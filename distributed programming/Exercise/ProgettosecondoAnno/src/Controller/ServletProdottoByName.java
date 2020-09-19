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

import Model.*;
/**
 * Servlet implementation class ServletProdottoByName
 */
@WebServlet("/ServletProdottoByName")
public class ServletProdottoByName extends ServletBasic {
	private static final long serialVersionUID = 1L;
       
   
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessione= request.getSession();
		ArrayList<Prodotti> listaProdotti = new  ProdottiDAO().doRetrieveAll();
	System.out.println("accesso  alla servlet !");
	String nomeProdotto = request.getParameter("search");
	int i;
	Prodotti p = new Prodotti();
	boolean temp=false;
	for(i=0; i < listaProdotti.size() ; i++) {
		
		Prodotti temp1 = new Prodotti();
		
		temp1 =  listaProdotti.get(i);
		
		if(temp1.getNome().equals(nomeProdotto)) {
			temp=true;
			p.setDescrizione(temp1.getDescrizione());
			p.setIDprodotto(temp1.getIDprodotto());
			p.setNome(temp1.getNome());
			p.setNomecategoria(temp1.getNomecategoria());
			p.setNumero(temp1.getNumero());
			p.setPrezzo(temp1.getPrezzo());
			p.setLocazioni(temp1.getLocazioni());
		}
	}
	if(temp) {
		System.out.println("TROVATO!");
		request.setAttribute("prodotto", p);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/Prodotto.jsp");
					requestDispatcher.forward(request, response);
	}else {
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/ErrorProduct.jsp");
	requestDispatcher.forward(request, response);
	System.out.println("non TROVATO!");
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
