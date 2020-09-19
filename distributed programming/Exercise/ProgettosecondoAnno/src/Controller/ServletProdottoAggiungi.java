package Controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import java.io.InputStream;

import Model.Immagine;
import Model.ImmagineDAO;
import Model.ProdottiDAO;

@MultipartConfig
@WebServlet("/ServletProdottoAggiungi")
public class ServletProdottoAggiungi extends ServletBasic {
	private static final long serialVersionUID = 1L;

 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeProdotto = request.getParameter("nomeProdotto");
		System.out.println(nomeProdotto);
		double prezzo = Double.parseDouble((request.getParameter("prezzo")));
		int IDcategoria = Integer.parseInt(request.getParameter("nomeCategoria"));
		String descrizione = request.getParameter("textArea");
		int quantita = Integer.parseInt(request.getParameter("quantita"));
		
		Part uploadedFile = request.getPart("file");// prende l'immagine dall'html
		
		String nomeImmagine=uploadedFile.getSubmittedFileName();
	
		InputStream content =  uploadedFile.getInputStream();
		String path = getServletContext().getRealPath("/Immagini/" + nomeImmagine);
		
		String pathReal=null;
		
		pathReal=("Immagini/"+ nomeImmagine);
		Files.copy(content, Paths.get(path));
	
		new ImmagineDAO().doSave(pathReal);
		Immagine a=new ImmagineDAO().doRetrieveIdByLocazione(pathReal);
		
		int rs=new ProdottiDAO().doSave(nomeProdotto, quantita, prezzo,descrizione, IDcategoria,a.getLocazione());
		
		request.setAttribute("risultato",rs);
		
		RequestDispatcher view= request.getRequestDispatcher("WEB-INF/AggiungiProdotto.jsp");
		view.forward(request, response);
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
