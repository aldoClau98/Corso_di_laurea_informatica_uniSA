package Controller;

import Model.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletUtenti")
public class ServletUtenti extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
	Utenti u=  (Utenti) session.getAttribute("utente");
	System.out.println(u.getIDutenti()+" "+u.getUsername());
		Utenti c = new UtentiDAO().doRetrieveById(Integer.parseInt(u.getIDutenti()));
			request.setAttribute("utente",c);
			System.out.println(c.getEmail()+" "+c.getUsername());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/utente.jsp");
			requestDispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
