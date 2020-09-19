<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="Model.Utenti"%>
     <%@ page import="Model.Prodotti"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="header.jsp"/>

<div>

     	<% 
		Utenti c =  (Utenti) session.getAttribute("utente");
		
		 %>  
<table>
	<tr>
		<th>Categoria  </th>
		<th>ID  </th>
		<th>Nome  </th>
		<th>Disp. </th>
		<th> Prezzo  </th>
		<th> Desc. </th>
			
			 <% 
		if(c!=null){
			if( c.isAmm() ) { %>
			<form action="ServletGestioneProdotti" method=get>
				<input type="submit" name="aggiungi" value="aggiungi"/>
			</form>
							<%}
						} %>
			
	</tr>
	
       <c:forEach items="${lista}"  var="i">

	<tr>
		<th><img src="${i.locazioni}" height="100px" weigth="100px"/>
		<th>${i.nomecategoria}</th>
	<!-- 	<th>${i.IDprodotto}</th>  -->
		<th>${i.nome}</th>
		<th>${i.numero}</th>
		<th>${i.prezzo}</th>
		<th>${i.descrizione}</th>
	
	
		<th><form name="AggiungiProdotto"method="GET" action="ServletCarrello2">
		<input type="hidden" name="prodId" value="${i.IDprodotto}"/>
			
			
			
			<button type="submit">Aggiungi Al Carrello</button>
			
		</form>
	
		
		</th>
		
	</tr>
	
	</c:forEach>
	</table>
	

</div>


<jsp:include page="footer.html"/>