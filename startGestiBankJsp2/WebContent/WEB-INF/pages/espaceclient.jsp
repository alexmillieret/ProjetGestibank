<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Espace Client</title>
</head>
<body>
<div class="enteteEspaceClient">
<img id="logo4" src="images/logo2.png" alt="logo4" />
Bienvenue dans l'espace client
</div>
<div class="bodyclient">
<form name="verscompte" action="Controller?page=compte" method= "post">
<input class="myButton" type="submit" value="Demande de modification / Ajout de comptes">
</form>
</div>
<div class="bodyclient">
<input class="myButton" type="submit" value="Effectuer une transation">
</div>
<div class="bodyclient">
<input class="myButton" type="submit" value="Voir mes notifications">
</div>
<div class="bodyclient">
<input class="myButton" type="submit" value="Visualiser mes comptes">
</div>
<c:import url="footer.jsp" />
</body>
</html>