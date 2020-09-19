package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;

/**
 * Servlet implementation class ricercaProdottiAjax
 */
@WebServlet("/ricercaProdottiAjax")
public class ricercaProdottiAjax extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nome = request.getParameter("search");
		if (!nome.equalsIgnoreCase("")) {
			ArrayList<Prodotti> prodotti = new ProdottiDAO().doRetrieveAllSearch(nome, 10);
			if (!prodotti.isEmpty()) {
				for (int i = 0; i < prodotti.size(); i++) {
					response.getWriter()
							.append("<a href='ServletProdottoByName?search=" + prodotti.get(i).getNome()
									+ "'>"
									+  prodotti.get(i).getNome() + "<span class='text-muted'></span></li>");
				}
			} else {
				response.getWriter().append(
						"<li class='list-group-item link-class'>Nessun prodotto trovato!<span class='text-muted'></span></li>");
			}
		}
		
	}
/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	*/

}
