package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.*;

@WebServlet("/ServletLogin")
public class ServletLogin extends ServletBasic {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sessione = request.getSession();
		String username = request.getParameter("name");
		String password = request.getParameter("password");

		Utenti utente = null;
		if (username != null && password != null) {
			utente = new UtentiDAO().doRetrieveByLogin(username, password);
		}

		if (utente == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/ErrorLogin.jsp");
			requestDispatcher.forward(request, response);
		} else {

			sessione.setAttribute("utente", utente);

			ArrayList<Prodotti> ListaProdotti = new ProdottiDAO().doRetrieveAll();
			request.setAttribute("ListaProdotti", ListaProdotti);

			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ListaProdotti.jsp");
			view.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
