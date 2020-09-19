package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.PreferitiDAO;
import Model.Prodotti;
import Model.Utenti;

/**
 * Servlet implementation class ServletNavListaPreferiti
 */
@WebServlet("/ServletNavListaPreferiti")
public class ServletNavListaPreferiti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession sessione= request.getSession(); //qui ho tutti gli oggetti che stanno nella sezione fino a questo momento
		Utenti us= (Utenti) sessione.getAttribute("utente"); //"sessione" sarabbe in name che sta  "Login"!
		
		if(us!=null) {
		ArrayList<Prodotti> listaProdottiLista= new PreferitiDAO().doRetrieveByKey(Integer.parseInt(us.getIDutenti()));
		sessione.setAttribute("lista", listaProdottiLista); //"lista" preso da "addListaPreferiti
		
		if(listaProdottiLista.isEmpty()) { //usato per verificare se vuoto
			request.setAttribute("vuoto", 1); 
		}
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/ListaPreferiti.jsp");
		view.forward(request, response);
		
																	//passare controllo alla jsp
		}
	

	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		doGet(request, response);
	}

}
