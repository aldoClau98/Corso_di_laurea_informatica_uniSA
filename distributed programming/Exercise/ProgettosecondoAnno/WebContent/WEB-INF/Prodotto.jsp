<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="header.jsp"/>

<div>

       
<table>
	<tr>
		<th> Foto </th>
		<th>IDprodotto  </th>
		<th>Nome  </th>
		<th>Disponibilità  </th>
		<th>prezzo  </th>
		<th> descrizione  </th>
	
	</tr>
	
       

	<tr>
		<th><img src="${prodotto.locazioni}" height="100px" weight="100px"/></th>
		<th>${prodotto.nomecategoria}</th>
		<th>${prodotto.IDprodotto}</th>
		<th>${prodotto.nome}</th>
		<th>${prodotto.numero}</th>
		<th>${prodotto.prezzo}</th>
		<th>${prodotto.descrizione}</th>
		<th>
		<form name="AggiungiProdotto"method="GET" action="ServletCarrello2">
		<input type="hidden" name="prodId" value="${prodotto.IDprodotto}"/>
			<select name="numProd" >
					  
  					  <option value="1">1</option>
					  <option value="2">2</option>
					  <option value="3">3</option>
					  <option value="4">4</option>
			</select>
			<button type="submit">Aggiungi Prodotto</button>
		</form>
		<form method="post" action="ServletListaPreferiti"
									onsubmit="return controlloLoggato()">
									<input type="hidden" name="prodId" value="${prodotto.IDprodotto}"/>
										<input type="hidden" value="${utente.username}" id="utente">
									<button type="submit" id="prefe"
										style="margin-left: 50px; width: 200px;">
										Aggiungi ai preferiti <img class="img-responsive"
											src="icons8-lista-dei-desideri-48 (1).png"
											style="width: 25px; height: 25px;" id="cuore">
									</button>
								</form>
		</th>
	</tr>
	
	
	</table>
	

</div>
<script>


</script>

<jsp:include page="footer.html"/>