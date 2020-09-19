package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;
import Model.Utenti;


@WebServlet("/ServletListaPreferiti")
public class ServletListaPreferiti extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int IDpro = Integer.parseInt(request.getParameter("prodId"));

		Utenti a = (Utenti) request.getSession().getAttribute("utente");
		boolean trovato = false;
		
		// se l'utente è loggato
		if (a != null) {
			Prodotti x = new ProdottiDAO().doRetrieveById(IDpro);
			ArrayList<Prodotti> listaPreferiti = new PreferitiDAO().doRetrieveByKey(Integer.parseInt(a.getIDutenti()));
			
			
			if (listaPreferiti == null) { //quando non esiste l'oggetto array list, allora lo crea e aggiuge il prodotto alla lista
				ArrayList<Prodotti> listaPreferiti2 = new ArrayList<Prodotti>();
				listaPreferiti2.add(x);
				new PreferitiDAO().doSave(Integer.parseInt(a.getIDutenti()), IDpro);
				request.setAttribute("lista", listaPreferiti2); //nome lista impo!!!
				RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ListaPreferiti.jsp");
				view.forward(request, response);
				
			} else { //qua so che l'array list di prodotti già esiste, ma vado a controllore se il prodotto che volgio aggiungere è già stato aggiunyo 
				
				for (int i = 0; i < listaPreferiti.size(); i++) { 
					Prodotti temp = listaPreferiti.get(i);
					if (temp.getIDprodotto() == IDpro) {
						trovato = true; //ha trovato il prodotto e non lo aggiunge
						break;
					}
					}
				if (trovato == false) { //non ha trovato il prodotto allora lo aggiuge
					listaPreferiti.add(x);
					new PreferitiDAO().doSave(Integer.parseInt(a.getIDutenti()), IDpro);
				}
				request.setAttribute("lista", listaPreferiti);
				
				RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ListaPreferiti.jsp");
				view.forward(request, response);
			}
		} else {
			request.getRequestDispatcher("WEB-INF/ErrorProduct.jsp").forward(request, response);
		}
	}

	
	
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
