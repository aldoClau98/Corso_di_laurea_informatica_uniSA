<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="Model.Utenti"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Import Bootstrap -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<link href="style.css" rel="stylesheet" type="text/css">

<!-- Search button -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<style>
.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  padding: 12px 16px;
  z-index: 1;
}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>
</head>

<body>
	<div class="container">
		<nav class="navbar navbar-inverse navbar-fixed-top" id="header">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#myNavbar">
						<span class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>

					<a class="navbar-brand" href="ServletHome"> CodEx </a>


				</div>

				<div class="collapse navbar-collapse" id="myNavbar">
					<ul class="nav navbar-nav navbar-right ">
					
						<li class="search-container">
						<form class="form-inline" name="search"
							action="ServletProdottoByName" method="GET">
							
							
							<div class="dropdown">
						  <input class="form-control mr-sm-2" type="text" name="search" onkeyup="getResult()" placeholder="Cerca..">
						  <div class="dropdown-content">
						  <li  id="results" style="max-width: 400px"><br></li>
						  </div>
						</div>
							
							
							
							<button type="submit"><div align="center"><i class="fa fa-search" ></i></div></button>
						</form>
						
						</li>
						<li><a href="ServletHome">Home</a></li>
						<li><a href="ServletCategorie">Categorie</a></li>



						<li><a href="ServletCarrello2">Carrello<span
								class="glyphicon glyphicon-shopping-cart"></span></a> <%
 	Utenti c = (Utenti) session.getAttribute("utente");
 	if (c == null) {
 %>
						<li><a href="ServletNavRegistration">Registrati</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">Login <span
								class="glyphicon glyphicon-log-in"></span></a>
							<div class="dropdown-menu">
								<form id="formLogin" class="form container-fluid" name="Login"
									action="ServletLogin" method="post">
									<div class="form-group">
										<label for="name">Username:</label> <input type="text"
											class="form-control" name="name">
									</div>
									<div class="form-group">
										<label for="password">Password:</label> <input type="password"
											class="form-control" name="password">
									</div>
									<input type="submit" id="btnLogin" class="btn btn-block" value="Login"></input>
								</form>
								<div class="container-fluid">
									<br> <a class="medium" href="ServletNavRegistration">Non
										sei ancora registrato? Fallo ora!</a>
								</div>
							</div></li>

						<%
							} else {
						%>
						<li><a href="ServletNavListaPreferiti">Lista Preferiti</a></li>
						<li><a href="ServletUtenti">Profilo</a></li>
						<li><a href="ServletLogout">Logout</a></li>

						<%
							if (c.isAmm()) {
						%>

						<li><a href="ServletAdmin" name="gestioniutenti">
								Gestione utenti</a></li>

						<%
							}
						%>

						<%
							}
						%>


					</ul>
				</div>
			</div>
		</nav>

	<script>
				function getResult() {
			var xhttp = new XMLHttpRequest();
			var nome = $('input[name="search"]').val();
			xhttp.onreadystatechange = function() {
				if (this.readyState == 4 && this.status == 200) {
					document.getElementById("results").innerHTML = this.responseText;
				}
			};
			xhttp.open("GET", "ricercaProdottiAjax?search=" + nome, true);
			xhttp.send();
		}
	</script>