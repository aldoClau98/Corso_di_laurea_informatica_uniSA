package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.UtentiDAO;


@WebServlet("/ControlloMailAjax")
public class ControlloMailAjax extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	String mail =  request.getParameter("Email");  // pendo la mail interessata
	System.out.println(mail);
	ArrayList<String> listaMail = new UtentiDAO().controlloMail(); //mi procuro  la lsta di tutte le mail  del  DB
	PrintWriter out = response.getWriter(); 
	
	for(int i=0;i<listaMail.size();i++) {
		String x = listaMail.get(i);
		if(x.equals(mail)) {	//vedo  se quella mail  è  contenuta nella lista 
			out.append("Non Disponibile");
			break;
		}
	}
	
		
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
