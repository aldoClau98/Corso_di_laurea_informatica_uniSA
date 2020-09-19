<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:include page="header.jsp"/>
<div>
<section>
		<table>
		<p>Modifica dell' utente  ${modifica.username} <br> INFORMAZIONI:<br>    
			<tr>IDutente: ${modifica.IDutenti}</tr>
			<tr>email: ${modifica.email}</tr>
			<tr>Password: ${modifica.password}</tr>
		
		</p>
		
		
			<form name="Modifica" action="ServletAdminModifica" method="POST">

       			 <label > Modifica Username:</label>
       				 <input type="text" name="usernamemodifica" /><br>
       				 <input type="hidden" value="${modifica.IDutenti}" name="idutente">
						<input type="hidden" value="${modifica.email}" name="email">
						<input type="hidden" value="${modifica.password}" name="password">
      					 <div class="row">
       						 <div class="mx-auto">
          						<button type="submit" class="btn btn-success">Effettua Modifiche</button>
       						 </div>
       					 </div> 
       		 </form>
       		 
       		 <form name="Modifica" action="ServletAdminModifica" method="POST">

       			 <label > Modifica email:</label>
       				 <input type="text" name="emailmodifica" /><br>
       				 <input type="hidden" value="${modifica.IDutenti}" name="idutente">
						<input type="hidden" value="${modifica.username}" name="username">
						<input type="hidden" value="${modifica.password}" name="password">
      					 <div class="row">
       						 <div class="mx-auto">
          						<button type="submit" class="btn btn-success">Effettua Modifiche</button>
       						 </div>
       					 </div> 
       		 </form>
       		 <form name="Modifica" action="ServletAdminModifica" method="POST">

       			 <label > Modifica password:</label>
       				 <input type="text" name="passwordmodifica" /><br>
       				 <input type="hidden" value="${modifica.IDutenti}" name="idutente">
		<input type="hidden" value="${modifica.email}" name="email">
		<input type="hidden" value="${modifica.username}" name="username">
      					 <div class="row">
       						 <div class="mx-auto">
          						<button type="submit" class="btn btn-success">Effettua Modifiche</button>
       						 </div>
       					 </div> 
       		 </form>
     
		</table>
	</section>
	</div>


<jsp:include page="footer.html"/>