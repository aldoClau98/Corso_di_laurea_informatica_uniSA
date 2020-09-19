<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp" />
<div id="categorie">
	<h3>Clicca su una categoria per visualizzare i prodotti</h3>
	<div class="row row_cat">

		<div class="col-xs-6 col-md-3 cat">

			<a href="ServletProdottoByCategoria?categoria=aerofoni"
				class="thumbnail"> <img src="./242x200.jpg" alt="Aerofoni">
			<h4>Aerofoni</h4>
			</a>

		</div>

		<div class="col-xs-6 col-md-3 cat">

			<a href="ServletProdottoByCategoria?categoria=elettrofoni"
				class="thumbnail"> <img src="./242x200.jpg" alt="Elettrofoni">
			<h4>Elettrofoni</h4>
			</a>
		</div>

		<div class="col-xs-6 col-md-3 cat">

			<a href="ServletProdottoByCategoria?categoria=cordofoni"
				class="thumbnail"> <img src="./242x200.jpg" alt="Cordofoni">
			<h4>Cordofoni</h4>
			</a>
		</div>

		<div class="col-xs-6 col-md-3 cat">

			<a href="ServletProdottoByCategoria?categoria=membranofoni"
				class="thumbnail"> <img src="./242x200.jpg" alt="Membranofoni">
			<h4>Membranofoni</h4>
			</a>
		</div>

		<div class="col-xs-6 col-md-3 cat">

			<a href="ServletProdottoByCategoria?categoria=aerofoni"
				class="thumbnail"> <img src="./242x200.jpg" alt="Idiofoni">
			<h4>Idiofoni</h4>
			</a>
		</div>



	</div>
</div>

<jsp:include page="footer.html"></jsp:include>