package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;

import java.util.GregorianCalendar;

@WebServlet("/ServletConvalidaOrdine")
public class ServletConvalidaOrdine extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		Utenti u = new Utenti();
		

		try {
			
			u = (Utenti) session.getAttribute("utente");
			String numeroCarta = request.getParameter("cardnumber");
			String tipoCarta = request.getParameter("cardname");
			String citta = request.getParameter("city");
			String paese = request.getParameter("state");
			int cap = Integer.parseInt(request.getParameter("zip"));
			String indirizzo = request.getParameter("address");

			int IDutenti = Integer.parseInt(u.getIDutenti());

			GregorianCalendar data = new GregorianCalendar();

			new PagamentoDAO().doSave(indirizzo, cap, paese, citta, tipoCarta, numeroCarta,
					IDutenti, data);

			// registrazione ordine nel DB

			ArrayList<Prodotti> listaProdotti = new ArrayList<>();
			listaProdotti = (ArrayList<Prodotti>) session.getAttribute("carrello");

			Pagamento p = new PagamentoDAO().doRetrieveByIdCli(Integer.parseInt(u.getIDutenti()));

			for (int i = 0; i < listaProdotti.size(); i++) {

				new OrdiniDAO().doSave(p.getIDpagamento(), listaProdotti.get(i).getIDprodotto());
			}

			// registrazione Spedizione

			Spedizione s = new Spedizione();
			System.out.println(s.getCorriere());
			new SpedizioneDAO().doSave(s.getCorriere(), p.getIDpagamento());

			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/SuccessoOrdine.jsp");
			view.forward(request, response);
			
			
			}catch(NumberFormatException e) {
				RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ErroreOrdine.jsp");
				  view.forward(request, response);
				
			}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
