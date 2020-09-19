<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp"/>
<div>
	
			
		
				<p>codice identificativo : ${utente.IDutenti}</p>
				
					<p>nomeutente : ${utente.username}</p>
				
				<p> MAIL : ${utente.email}</p>
		
		
				
				<h4>password: ${utente.password}</h4>
				
			
	
		
	</div>


<jsp:include page="footer.html"/>