<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />



<style>
.icon-container {
	margin-bottom: 20px;
	padding: 7px 0;
	font-size: 24px;
}

.btn {
	padding: 12px;
	margin: 10px 0;
	border: none;
	width: 100%;
	border-radius: 3px;
	cursor: pointer;
	font-size: 17px;
}

a {
	text-color: #2196F3;
}

hr {
	border: 1px solid lightgrey;
}

span.price {
	float: right;
	color: grey;
}

/* Responsive layout - when the screen is less than 800px wide, make the two columns stack on top of each other instead of next to each other (also change the direction - make the "cart" column go on top) */
@media ( max-width : 800px) {
	.row {
		flex-direction: column-reverse;
	}
	.col-25 {
		margin-bottom: 20px;
	}
}
</style>


<div id="checkout">
	<div class="riepilogo">

		<h2>Riepilogo Carrello</h2>

		<h4>
			<b>Totale numero articoli:</b> ${quantitaCarrello}
		</h4>
		<div class="table-responsive">
			<table class="table table-dark">
				<thead>
					<tr>
						<th>Nome articolo</th>
						<th>Prezzo</th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${carrello }" var="i">
						<tr>
							<td>${i.nome}</td>
							<td>${i.prezzo}</td>
						</tr>
					</c:forEach>
					<tr></tr>
					<tr>
						<td><strong>Totale:</strong></td>
						<td><strong>&euro; ${prezzoTOT}</strong></td>
					</tr>
				</tbody>
			</table>
		</div>


	</div>


	<div class="dati_ordine">
		<h2>Procedi all'ordine</h2>
		<h4>Inserisci i dati richiesti:</h4>
		<form action="ServletConvalidaOrdine" name="ordine" method="POST">
			<div class="col-md-6">
				<h5>Dettagli spedizione:</h5>

				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-user"></i> Nome e cognome:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="fname" name="firstname"
								placeholder="John M. Doe" class="input-sm">
						</div>
						<div class="row">
							<small id="controllo_nome"></small>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-address-card-o"></i> Indirizzo:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="adr" name="address"
								placeholder="Via Garibaldi, 123" class="input-sm">
						</div>
						<div class="row">
							<small id="controllo_indirizzo"></small>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-institution"></i> Citt:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="city" name="city" placeholder="New York"
								class="input-sm">
						</div>
						<div class="row">
							<small id="controllo_citta"></small>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-globe"></i> Stato:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="state" name="state" placeholder="NY"
								class="input-sm">
						</div>
						<div class="row">
							<small id="controllo_stato"></small>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-map-marker"></i> CAP:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="zip" name="zip" placeholder="10001"
								class="input-sm">
						</div>
						<div class="row">
							<small id="controllo_cap"></small>
						</div>
					</div>
				</div>
			</div>

			<div class="col-md-6">

				<h5>Dettagli pagamento:</h5>
				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-user-circle"></i> Intestatario carta
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="cname" name="cardname"
								placeholder="John More Doe" onkeyup="validazioneIntCarta()"
								class="input-sm">
						</div>
						<div class="row">
							<small id="Messaggio_controllo"></small>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-credit-card-alt"></i> Numero carta:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="ccnum" name="cardnumber"
								placeholder="1111222233334444"
								onkeyup="validazioneNumCarta()" class="input-sm">
						</div>
						<div class="row">
							<small id="Messaggio_controllo2"></small>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-calendar"></i> Mese di scadenza:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="expmonth" name="expmonth"
								placeholder="Es: 04" onkeyup="validazionExpmonth()"
								class="input-sm">
						</div>
						<div class="row">
							<small id="Messaggio_controllo3"></small>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-calendar-plus-o"></i> Anno di scadenza:
						</h6>
					</div>
					<div class="col-md-3">
						<div class="row">
							<input type="text" id="expyear" name="expyear"
								placeholder="Es: 2020" class="input-sm">
						</div>
						<div class="row">
							<small id="Messaggio_controllo4"></small>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-3">
						<h6>
							<i class="fa fa-unlock-alt"></i> CVV:
						</h6>
					</div>
					<div class="col-md-3">
					<div class="row">
						<input type="text" id="cvv" name="cvv" placeholder="es: 352"
							class="input-sm">
					</div>
					<div class="row">
						<small id="Messaggio_controllo5"></small>
					</div>		
					</div>
				</div>

			</div>
			<input type="submit" id="paga" value="Procedi al pagamento"
				class="btn btn-info">
		</form>
	</div>
</div>




<script>

	//validzione checkout
	function validazionExpmonth() {
		var state = $('input[name="expmonth"]').val();
		var exp = /^[0-9]{1,2}$/;

		if (exp.test(state)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('Messaggio_controllo3').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('Messaggio_controllo3').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
	function validazionExpCVV() {
		var state = $('input[name="cvv"]').val();
		var exp = /^[0-9]{3}$/;

		if (exp.test(state)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('Messaggio_controllo5').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('Messaggio_controllo5').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
	function validazionExpyear() {
		var state = $('input[name="expyear"]').val();
		var exp = /^[0-9]{4}$/;

		if (exp.test(state)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('Messaggio_controllo4').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('Messaggio_controllo4').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}

	function validazionezip() {
		var state = $('input[name="zip"]').val();
		var exp = /^[0-9]{5}$/;

		if (exp.test(state)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('controllo_cap').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('controllo_cap').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
	function validazionestate() {
		var state = $('input[name="state"]').val();
		var exp = /^[a-z0-9_-]{3,15}$/;

		if (exp.test(state)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('controllo_stato').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('controllo_stato').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
	function validazioneIndirizzo() {
		var address = $('input[name="address"]').val();
		var exp = /^[a-z0-9_-]{3,15}$/;

		if (exp.test(address)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('controllo_indirizzo').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('controllo_indirizzo').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
	function validazionecity() {
		var city = $('input[name="city"]').val();
		var exp = /^[a-z0-9_-]{3,15}$/;

		if (exp.test(city)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('controllo_citta').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('controllo_citta').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
	function validazionenome() {

		var numCarta = $('input[name="firstname"]').val();
		var exp = /^[a-z0-9_-]{3,15}$/;

		if (exp.test(numCarta)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('controllo_nome').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('controllo_nome').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
	function validazioneNumCarta() {

		var numCarta = $('input[name="cardnumber"]').val();
		var exp = /^[0-9]{16}$/;

		if (exp.test(numCarta)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('Messaggio_controllo2').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('Messaggio_controllo2').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}

	function validazioneIntCarta() {

		var numCarta = $('input[name="cardname"]').val();
		var exp = /^[a-z0-9_-]{3,15}$/;

		if (exp.test(numCarta)) {
			cartaOK = true;
			document.getElementById('paga').disabled = false;
			document.getElementById('Messaggio_controllo').innerHTML = '';
		} else {
			document.getElementById('paga').disabled = true;
			document.getElementById('Messaggio_controllo').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
</script>

<jsp:include page="footer.html"></jsp:include>