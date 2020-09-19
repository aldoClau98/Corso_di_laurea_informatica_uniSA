<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="Model.Prodotti"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<script src="https://use.fontawesome.com/c560c025cf.js"></script>

<jsp:include page="header.jsp" />

<div id="carrello">

	<h1>
		<span class="glyphicon glyphicon-shopping-cart"></span> Carrello
	</h1>

	<div class="table-responsive">
		<table class="table table-dark">
			<thead>
				<tr>
					<th>Nome articolo</th>

					<th>Prezzo</th>

					<th>Quantit</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${carrello}" var="carrello">
					<tr>
						<td><strong>${carrello.nome}</strong><br> <small>${carrello.descrizione}</small>

						</td>

						<td>&euro; ${carrello.prezzo}</td>

						<td>${carrello.quantitacarrello}</td>
						<td><form action="ServletRemoveItem" method="post">
								<input type="hidden"
									value=<c:out value="${carrello.IDprodotto}"></c:out>
									name="idProd">
								<button type="submit" class="btn btn-outline-danger btn-xs">
									Rimuovi <i class="fa fa-trash" aria-hidden="true"></i>
								</button>
							</form></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	</div>

	<div class="pull-right" style="margin: 10px; margin-bottom: 100px;">

		<c:if test="${vuoto!=1}">
			<form action="ServletCheckout" method="post"
				onsubmit="return controlloLoggato()">
				<input type="submit" class="btn btn-primary pull-right"
					value="Checkout"> <input type="hidden"
					value="${utente.username}" id="utente">
			</form>
		</c:if>

		<div class="pull-right" style="margin: 5px">

			<%
				float tot = 0;
				ArrayList<Prodotti> listaProdottiCarrello = (ArrayList<Prodotti>) session.getAttribute("carrello");
				for (int i = 0; i < listaProdottiCarrello.size(); i++) {

					tot += ((listaProdottiCarrello.get(i).getPrezzo())
							* (listaProdottiCarrello.get(i).getQuantitacarrello()));
				}
			%>

			Prezzo Totale: <b>&euro;<%
				out.println(tot);
			%></b>


		</div>
	</div>
</div>

				<script>
				// funzione per verificare se ci  sono prodotti 
				function controlloProdotti() {
					var quantita = $("#quantitaCarrello").val(); //attributo 
					document.write(quantita);
					if (quantita == 0) {
						alert("Devi aggiungere i prodotti");
						return false;
					} else {
						return true;
					}
				}
				// funzione per verificare se l'utente  loggato
				function controlloLoggato() {
					var utente = $("#utente").val(); //attributo 
					var quantita = $("#quantitaCarrello").val() //attributo2
					if (utente == "") {
						alert("Devi essere loggato");
						return false;
					}if( quantita == 0){
						alert("Devi aggiungere qualche prodotto");
						return false;
					} else {
						return true;
					}
				}
				
				</script>


<jsp:include page="footer.html"/>