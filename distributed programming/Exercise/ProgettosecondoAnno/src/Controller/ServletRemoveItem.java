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
 * Servlet implementation class ServletRemoveItem
 */
@WebServlet("/ServletRemoveItem")
public class ServletRemoveItem extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		int idprodotto = Integer.parseInt(request.getParameter("idProd"));
		Utenti u;
		if((u =(Utenti) request.getSession().getAttribute("utente")) != null) {
		
			ArrayList<Prodotti> listaProdottiCarrello = (ArrayList<Prodotti>) session.getAttribute("carrello");
			for (int i = 0; i < listaProdottiCarrello.size(); i++) {
				int x = listaProdottiCarrello.get(i).getIDprodotto();
				if (x == idprodotto) {
					new CarrelloDAO().deleteProdotto(Integer.parseInt(u.getIDutenti()), idprodotto);
					listaProdottiCarrello = new CarrelloDAO().doRetrieveByCliente(u.getIDutenti());
					//fare funzione in DAO che prenda solo  i prodotti 
					//continiuamo domani 
					break;
				}
			}
			session.setAttribute("carrello", listaProdottiCarrello);
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
			view.forward(request, response);
		}else {
			ArrayList<Prodotti> listaProdottiCarrello = (ArrayList<Prodotti>) session.getAttribute("carrello");
			for (int i = 0; i < listaProdottiCarrello.size(); i++) {
				int x = listaProdottiCarrello.get(i).getIDprodotto();
				if (x == idprodotto) {
					listaProdottiCarrello.remove(i);
					break;
				}
			}
			session.setAttribute("carrello", listaProdottiCarrello);
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Carrello.jsp");
			view.forward(request, response);
		}
		
		}
		
		
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
