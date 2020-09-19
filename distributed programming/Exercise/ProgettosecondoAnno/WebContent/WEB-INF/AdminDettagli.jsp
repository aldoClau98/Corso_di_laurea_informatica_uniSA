<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="header.jsp"/>
<div>
<section>
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>Username</th>
					<th>Email</th>
					<th>Admin</th>
					
				</tr>
			</thead>
					<tr>
					
						<td>${utenteDettaglio.IDutenti}</td>
						<td> ${utenteDettaglio.username}</td>
						
						
						
						
						<td>${utenteDettaglio.email}</td>
						<td>${utenteDettaglio.amm ? "Si" : "No"}</td>
					  	
					  	
					<tr>
					  	<th>IDordine  </th>
						<th>Nome Prodotto  </th>
						<th> Prezzo </th>
						<th> Tipo Carta</th>
					</tr>
					
					<tbody>
					  	<c:forEach   items="${listaordini}" var="i">
					  	
									
				      					  
						  	<tr align="center">
						  	
						  		<td>  ${i.idordine}   </td>
						  		<td>  ${i.nomeprodotto} </td>
						  		<td>  ${i.prezzo}  </td>
						  		<td>  ${i.tipocarta}   </td>
						  
						  	</tr>
					  	</c:forEach>
					</tbody>
					</tr>	
		</table>
	</section>
	</div>


<jsp:include page="footer.html"/>