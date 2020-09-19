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



@WebServlet("/ServletAdminTodo")
public class ServletAdminTodo extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ArrayList<Utenti> lista = (ArrayList<Utenti>) session.getAttribute("utenti");
		String modifica ;
		String rimuovi;
		String dettagli;
		Utenti idutenteloggato = (Utenti) session.getAttribute("utente");
		int idutenti =  Integer.parseInt(request.getParameter("id"));
		System.out.println(idutenti);
		if((modifica = request.getParameter("modifica"))!=null) {
			System.out.println("modifica");
			Utenti  u =new UtentiDAO().doRetrieveById(idutenti);
			request.setAttribute("modifica", u);
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/AdminModifica.jsp");
			dis.forward(request, response);
			
		}else if((rimuovi = request.getParameter("rimuovi")) !=null) {
			System.out.println("rimuovi");
					
					new UtentiDAO().doDelete(idutenti);	
			if(idutenti==(Integer.parseInt(idutenteloggato.getIDutenti()))) {
				request.getSession().removeAttribute("utente");
			}
		
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/AdminSuccess.jsp");
			dis.forward(request, response);
		} else if((dettagli= request.getParameter("dettagli"))!=null) {
			System.out.println("dettagli");
		
		ArrayList<Modifica> listaordini = new ModificaDAO().doRetrieveById(idutenti);
		Utenti u= new UtentiDAO().doRetrieveById(idutenti);
		request.setAttribute("utenteDettaglio", u);
		request.setAttribute("listaordini", listaordini);
		
		RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/AdminDettagli.jsp");
		dis.forward(request, response);
		
		
		}
		
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
