<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="header.jsp"/>
<div>
<section>
		<c:if test="${result==1}">
<h3>Prodotto modificato con successo!</h3>
</c:if>

<c:if test="${result==0}">
<h3>Modofica prodotto non riuscita. Riprova!</h3>
</c:if>

<br>
<p class="text-center"> Pagina di modifica prodotto</p>
<hr>
<div class="container">
	<form action="ServletProdottoModifica" method="post">
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">Nome Prodotto</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" name="nomeProdotto"
					placeholder="Prodotto" required value="<c:out value="${prodotto.nome}" />">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">Prezzo</label>
			<div class="col-sm-8">
				<input type="number" name="prezzo" class="form-control" placeholder="Prezzo" required value="<c:out value="${prodotto.prezzo}" />">
			</div>
		</div>
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">Descrizione</label>
			<div class="col-sm-8">
				<textarea class="form-control" rows="4" cols="97" name="textArea" required ><c:out value="${prodotto.descrizione}"/></textarea>
			</div>
		</div>

		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">Quantita</label>
			<div class="col-sm-8">
				<input type="number" class="form-control"
					placeholder="Inserisci la qui quantità" name="quantita" required value="<c:out value="${prodotto.numero}" />">
			</div>
		</div>

		<div class="form-group row">
			<div class="col-sm-10">
			<div class="text-right">
			<input type="hidden" value="<c:out value="${prodotto.IDprodotto}" ></c:out>" name="IDpro">
				<button type="submit" class="btn btn-primary">Modifica</button>
			</div>
			</div>
		</div>
	</form>
</div>
	


<jsp:include page="footer.html"/>