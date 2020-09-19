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
@WebServlet("/ServletAdminModifica")
public class ServletAdminModifica extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session =  request.getSession();
		String usernamemodifica;
		String emailmodifica ;
		String passwordmodifica;
		
		String username = request.getParameter("username");
		System.out.println(username);
		String email= request.getParameter("email");
		String IDutente= request.getParameter("idutente");
		String password= request.getParameter("password");
		
		Utenti u = new Utenti();
	
		ArrayList<Utenti> lista = new  UtentiDAO().doRetrieveAll();
		System.out.println(lista.toString());
		for(int i =0; i<lista.size();i++) {
			
			if((lista.get(i).getIDutenti()) == IDutente){
					u = lista.get(i);
					break;
			}
			System.out.println("elemento  non trovato");
				}
		
			if((request.getParameter("usernamemodifica"))!=null) {
				usernamemodifica = request.getParameter("usernamemodifica");
				
				
				System.out.println(usernamemodifica);
			
				u.setUsername(usernamemodifica);
				session.setAttribute("listaUtenti", lista);
				new UtentiDAO().doUpdate(Integer.parseInt(IDutente), email, password, usernamemodifica, false);	
				
			} else if((emailmodifica = request.getParameter("emailmodifica"))!=null) {
				emailmodifica = request.getParameter("emailmodifica");
				new UtentiDAO().doUpdate(Integer.parseInt(IDutente), emailmodifica, password, username, false);	
				
			} else if((passwordmodifica = request.getParameter("passwordmodifica"))!=null) {
				passwordmodifica = request.getParameter("passwordmodifica");
				new UtentiDAO().doUpdate(Integer.parseInt(IDutente), email, passwordmodifica, username, false);	
				
			}

			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/AdminSuccess.jsp");
			view.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
