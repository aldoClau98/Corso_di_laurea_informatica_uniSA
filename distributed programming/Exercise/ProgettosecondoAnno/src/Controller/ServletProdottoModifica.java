package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ProdottiDAO;

/**
 * Servlet implementation class ServletProdottoModifica
 */
@WebServlet("/ServletProdottoModifica")
public class ServletProdottoModifica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int IDpro= Integer.parseInt(request.getParameter("IDpro"));
		String nomeProdotto = request.getParameter("nomeProdotto");
		double prezzo = Float.parseFloat(request.getParameter("prezzo"));
		
		String descrizione = request.getParameter("textArea");
		int quantita = Integer.parseInt(request.getParameter("quantita"));	
		
		
		
		ProdottiDAO pdao= new ProdottiDAO();
		int rs= pdao.doUpdate(IDpro, nomeProdotto, quantita, prezzo, descrizione);
		
		request.setAttribute("result", rs);
		request.getRequestDispatcher("WEB-INF/ProdottoModifica.jsp").forward(request, response);
		
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
