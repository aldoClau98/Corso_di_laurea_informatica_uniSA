package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.*;
@WebServlet("/ServletAdmin")
public class ServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ArrayList<Utenti> listaUtenti = new UtentiDAO().doRetrieveAll() ;
		if(listaUtenti != null) {
			System.out.println("La lista utenti no è vuota   " +listaUtenti.size());
			
		}
		request.setAttribute("utenti", listaUtenti);
		
		RequestDispatcher req = request.getRequestDispatcher("WEB-INF/Admin.jsp");
		req.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		doGet(request, response);
	}

}
