<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="header.jsp"/>

<div class="container">
	<p id="x" class="text-center">Pagina di inserimento prodotto</p>
	<hr>
	<form action="ServletProdottoAggiungi" method="post" enctype="multipart/form-data">
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">
				Prodotto</label>
			<div class="col-sm-8">
				<input type="text" class="form-control" name="nomeProdotto"
					placeholder="Nome Prodotto" >
			</div>
		</div>
		<div class="form-group row">
			<div class="input-group">

				<label class="col-sm-2 col-form-label" style="font-weight: bold;">
					Prezzo &euro;</label>
				<div class="col-sm-8">
					<input type="number" name="prezzo" />
				</div>
			</div>
		</div>

		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">
				Categoria</label>
			<div class="col-sm-8">
				<div class="bootstrap-select-wrapper">
					<input type="number" name="nomeCategoria">
				</div>
			</div>
		</div>

		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">Descrizione</label>
			<div class="col-sm-8">
				<textarea class="form-control" rows="4" cols="97" name="textArea"
					required></textarea>
			</div>
		</div>

		<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">Quantita</label>
			<div class="col-sm-8">
				<input type="number" class="form-control" placeholder="Quantità"
					name="quantita" required>
			</div>
			
			<div class="form-group row">
			<label class="col-sm-2 col-form-label" style="font-weight: bold;">Inserisci
				immagine</label>
			<div class="col-sm-8">
				<input type="file" class="form-control-file" name="file" required>
			</div>
		</div>
		</div>

		
<br>
<%
int ris=-1;
	if((request.getAttribute("risultato"))!=null){
		ris = (int) request.getAttribute("risultato");
	}
	%>
		<div class="form-group row">
			<div class="col-sm-10">
				<%if(ris==1) { %>
					<h3>Prodotto aggiunto con successo</h3>
				<%} %>
				<div class="text-right">
					<button type="submit" class="btn btn-primary">Aggiungi</button>

				</div>

	
				<% if(ris== 0) { %>
					<h3 style="color: #c10922;">Inserimento prodotto non riuscito,riprova</h3>
				<%} %>

			</div>
		</div>
		<br>
	</form>
</div>

<jsp:include page="footer.html"/>