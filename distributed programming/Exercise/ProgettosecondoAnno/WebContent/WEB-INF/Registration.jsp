<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp" />
<div>

	<form action="ServletRegistration" method="POST">

		<input type="text" name="Username" placeholder="Username"
			onkeyup="getResultUser()" onkeyup="validazioneuser()" required />
		<h4 id="controllo_user"></h4>
		<br> <input type="email" name="Email" placeholder="Email"
			onkeyup="validazionemail()" onkeyup="getResultMail()" required />
		<h4 id="controllo_mail"></h4>
		<br> <input type="password" name="Password"
			placeholder="Password" onkeyup="validazionePassword()" required /> <br>
		<input type="hidden" name="amstr" value="false" /> <input
			class="btn btn-info btn-sm" type="submit" name="reg" id="reg"
			value="Registrati" />
		<h4 id="Messaggio"></h4>
	</form>
</div>
<script>
	/* controllo dati USER (se il nome è disponibili) di registrazione AJAX  */
	function getResultUser() {
		var xhttp = new XMLHttpRequest();
		var nome = $('input[name="Username"]').val();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				document.getElementById("controllo_user").innerHTML = this.responseText;

				var risp = this.responseText;
				if (risp == "Non disponibile") {
					$('#reg').prop("disabled", true);//disabilito il pulsante di  registrazione
				} else {
					$('#reg').removeAttr('disabled');
				}
			}
		};
		xhttp.open("GET", "ControlloUserAjax?Username=" + nome, true);
		xhttp.send();
	}

	/* controllo dati EMAIL (se è disponibile) di registrazione AJAX  */
	function getResultMail() {
		var xhttp = new XMLHttpRequest();
		var nome = $('input[name="Email"]').val();
		xhttp.onreadystatechange = function() {
			if (this.readyState == 4 && this.status == 200) {
				document.getElementById("controllo_mail").innerHTML = this.responseText;

				var risp = this.responseText;
				if (risp == "Non disponibile") {
					$('#reg').prop("disabled", true);

				} else {
					$('#reg').removeAttr('disabled');

				}
			}
		};
		xhttp.open("GET", "ControlloMailAjax?Email=" + nome, true);
		xhttp.send();
	}

	function validazionemail() {
		var mail = $('input[name="Email"]').val();
		var exp = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w+)+$/;
		if (exp.test(mail)) {
			emailOK = true;
			document.getElementById('reg').disabled = false;
			document.getElementById('Messaggio').innerHTML = '';
		} else {
			document.getElementById('reg').disabled = true;
			document.getElementById('Messaggio').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}

	function validazioneuser() {
		var user = $('input[name="Username"]').val();
		var exp = /^[0-9a-zA-Z]\w{3,14}$/;
		if (exp.test(user)) {
			document.getElementById('reg').disabled = false;
			document.getElementById('Messaggio').innerHTML = '';
		} else {
			document.getElementById('reg').disabled = true;
			document.getElementById('Messaggio').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}

	function validazionePassword() {

		var pssw = $('input[name="Password"]').val();
		var exp = /^[0-9a-zA-Z]\w{3,14}$/;
		if (exp.test(pssw)) {
			document.getElementById('reg').disabled = false;
			document.getElementById('Messaggio').innerHTML = '';
		} else {
			document.getElementById('reg').disabled = true;
			document.getElementById('Messaggio').innerHTML = 'Assicurati di compilare tutti i campi correttamente.';
		}
	}
</script>
<jsp:include page="footer.html" />