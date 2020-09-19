package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Prodotti;
import Model.ProdottiDAO;

/**
 * Servlet implementation class ServletLogout
 */
@WebServlet("/ServletLogout")
public class ServletLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getSession().removeAttribute("utente");
		request.getSession().removeAttribute("carrello");

		ArrayList<Prodotti> ListaProdotti = new ProdottiDAO().doRetrieveAll();
		request.setAttribute("ListaProdotti", ListaProdotti);

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ListaProdotti.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
