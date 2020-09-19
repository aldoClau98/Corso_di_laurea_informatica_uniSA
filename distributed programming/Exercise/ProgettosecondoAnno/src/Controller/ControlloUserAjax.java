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

/**
 * Servlet implementation class ControlloUserAjax
 */
@WebServlet("/ControlloUserAjax")
public class ControlloUserAjax extends ServletBasic implements Servlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String nome = request.getParameter("Username");
	
	ArrayList<String> listaNomi = new UtentiDAO().controlloUser();
	PrintWriter out = response.getWriter();
	for(int i = 0; i< listaNomi.size();i++) {
		String x = listaNomi.get(i);
		if(x.equals(nome)) {
			out.append("Non Disponibile"); //mi scrive nell innerHTML con qusti  metodi
			break;
		}
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		doGet(request, response);
	}

}
