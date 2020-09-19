package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.*;


/**
 * Servlet implementation class ServletGestioneProdotti
 */
@WebServlet("/ServletGestioneProdotti")
public class ServletGestioneProdotti extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		 if((request.getParameter("modifica"))!=null) {
			int idprodotto = Integer.parseInt(request.getParameter("id"));
			System.out.println("modifica");
			Prodotti  p =new ProdottiDAO().doRetrieveById(idprodotto);
			
			request.setAttribute("prodotto", p);
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/ProdottoModifica.jsp");
			dis.forward(request, response);
			
		}else if((request.getParameter("rimuovi")) !=null) {
			int idprodotto = Integer.parseInt(request.getParameter("id"));
			System.out.println("rimuovi");
					
					new ProdottiDAO().doDelete(idprodotto);	

			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/ProdottoSuccess.jsp"); 
			dis.forward(request, response);
		}else if((request.getParameter("aggiungi")) !=null) {
			System.out.println("Aggiungi");
			
			RequestDispatcher dis = request.getRequestDispatcher("WEB-INF/AggiungiProdotto.jsp"); 
			dis.forward(request, response);
			
		}
	
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
