<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
<div id="admin" class="table-responsive">
	<h3>Elenco utenti</h3>

	<form action="ServletAdminTodo" method="post">
		<div class="table-responsive">
			<table class="table table-dark">

				<thead>
					<tr>

						<th>Username</th>
						<th>Email</th>
						<th>Admin</th>

					</tr>
				</thead>

				<tbody>
					<c:forEach items="${utenti}" var="utente">
						<tr>

							<td>${utente.username}</td>

							<td>${utente.email}</td>
							<td>${utente.amm ? "Si" : "No"}</td>

							<div class="btn-group ">
							<form action="ServletAdminTodo" method="post">
								<input class="btn btn-default btn-sm" type="submit"
									name="dettagli" value="Dettagli"> <input
									class="btn btn-default btn-sm" type="submit" name="modifica"
									value=Modifica> <input class="btn btn-default btn-sm"
									type="submit" name="rimuovi" value="Rimuovi"> <input
									type="hidden" name="id" value="${utente.IDutenti}">
							</form>
							</div>

						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>
	</form>
</div>


<jsp:include page="footer.html" />