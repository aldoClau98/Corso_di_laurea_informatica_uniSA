package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Prodotti;
import Model.ProdottiDAO;

/**
 * Servlet implementation class ServletProdottoByCategoria
 */
@WebServlet("/ServletProdottoByCategoria")
public class ServletProdottoByCategoria extends ServletBasic {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String categoria = request.getParameter("categoria");
		ArrayList<Prodotti> ListaProdotti = new ProdottiDAO().doRetrieveCategoria(categoria);
		request.setAttribute("ListaProdotti", ListaProdotti);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/ListaProdotti.jsp");
		requestDispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
