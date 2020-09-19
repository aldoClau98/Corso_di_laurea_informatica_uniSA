package Controller;
import  Model.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRegistration
 */
@WebServlet("/ServletRegistration")
public class ServletRegistration extends ServletBasic {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Boolean temp;
	String username = request.getParameter("Username");
	System.out.println(username);
	String email = request.getParameter("Email");
	String password = request.getParameter("Password");
	String amstr = request.getParameter("amstr");
	if(amstr.equals("true"))
	 temp =   new UtentiDAO().doSave(username, email, password, true);
	else
	 temp =   new UtentiDAO().doSave(username, email, password, false);
	  System.out.println(temp);
	
	if(!temp) {
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ErrorRegistration.jsp");
		view.forward(request, response);
		
	}else
	{
		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/SuccessRegistration.jsp");
		view.forward(request, response);
	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
