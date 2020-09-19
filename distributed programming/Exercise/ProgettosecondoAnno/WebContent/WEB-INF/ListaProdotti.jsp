<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="Model.Utenti"%>
<%@ page import="Model.Prodotti"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />

<div>

	<%
		Utenti c = (Utenti) session.getAttribute("utente");
	%>
	<table>
		<tr>
			<th>Categoria</th>
			<th>ID</th>
			<th>Nome</th>
			<th>Disp.</th>
			<th>Prezzo</th>
			<th>Desc.</th>
			<th>Quantià Carrello</th>
			<%
				if (c != null) {
					if (c.isAmm()) {
			%>
			<form action="ServletGestioneProdotti" method=get>
				<input type="submit" name="aggiungi" value="aggiungi" />
			</form>
			<%
				}
				}
			%>

		</tr>

		<c:forEach items="${ListaProdotti}" var="i">

			<tr>
				<th><img src="${i.locazioni}" height="100px" weigth="100px" />
				<th>${i.nomecategoria}</th>
				<!-- 	<th>${i.IDprodotto}</th>  -->
				<th>${i.nome}</th>
				<th>${i.numero}</th>
				<th>${i.prezzo}</th>
				<th>${i.descrizione}</th>


				<th><form name="AggiungiProdotto" method="GET"
						action="ServletCarrello2">
						<input type="hidden" name="prodId" value="${i.IDprodotto}" /> <select
							name="numProd">
							<option name="numProd" value="1">1</option>
							<option name="numProd" value="2">2</option>
							<option name="numProd" value="3">3</option>
						</select>
						<button type="submit">Aggiungi Al Carrello</button>

					</form>
					<form method="post" action="ServletListaPreferiti"
						onsubmit="return controlloLoggato()">
						<input type="hidden" name="prodId" value="${i.IDprodotto}" /> <input
							type="hidden" value="${utente.username}" id="utente">
						<button type="submit" id="prefe"
							style="margin-left: 50px; width: 200px;">
							Aggiungi ai preferiti <img class="img-responsive"
								src="icons8-lista-dei-desideri-48 (1).png"
								style="width: 25px; height: 25px;" id="cuore">
						</button>
					</form> <%
 	if (c != null) {
 			if (c.isAmm()) {
 %>
					<form action="ServletGestioneProdotti" method="post">
						<input type="hidden" name="id" value="${i.IDprodotto}"> <input
							type="submit" name="modifica" value="Modifica"> <input
							type="submit" name="rimuovi" value="Rimuovi">

					</form> <%
 	}
 		}
 %></th>

			</tr>

		</c:forEach>
	</table>


</div>


<jsp:include page="footer.html" />