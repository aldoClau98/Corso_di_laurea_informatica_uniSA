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

/**
 * Servlet implementation class ServletCheckout
 */
@WebServlet("/ServletCheckout")
public class ServletCheckout extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		HttpSession session =  request.getSession();
		if(session.getAttribute("utente")==null) {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Home.jsp");
			view.forward(request, response);
		} else {
			Utenti u = new  Utenti();
			u= (Utenti) session.getAttribute("utente");
			ArrayList<Prodotti> carrello = (ArrayList<Prodotti>) session.getAttribute("carrello");
			int prodottiTOT=0;
			double prezzoTOT=0;
			for(int i =0; i<carrello.size();i++) {
				
				prodottiTOT+= carrello.get(i).getQuantitacarrello();
				prezzoTOT+= carrello.get(i).getPrezzo()* carrello.get(i).getQuantitacarrello();
				
			}
			
			
			session.setAttribute("quantitaCarrello", prodottiTOT);
			System.out.println("quantita carrello:" +prodottiTOT);
			session.setAttribute("prezzoTOT", prezzoTOT);
			
			
			
			if(prodottiTOT==0) {
				RequestDispatcher view =request.getRequestDispatcher("WEB-INF/ErroreOrdine.jsp");
				view.forward(request, response);
			}else {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Checkout.jsp");
			view.forward(request, response);
		
			}
		}
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		doGet(request, response);
	}

}
