<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp" />
<form name="form" action="ServletLogin" method="POST">
	name:<input type="text" name="name"><br> password:<input
		type="password" name="password"><br> <input type="submit">
</form>


<jsp:include page="footer.html" />