<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Espace Admin</title>
</head>
<body>
<fmt:setBundle basename="com.wha.international/message"/>
<div class="enteteEspaceClient">
<img id="logo4" src="${pageContext.request.contextPath}/resources/images/logo2.png" alt="logo2" />
Bienvenue dans l'espace Administrateur
</div>
<div class="bodyclient">
<input class="myButton" type="submit" value="Gestion des conseillers">
</div>
<div class="bodyclient">
<input class="myButton" type="submit" value="Gestion des affectations">
</div>
<c:import url="footer.jsp" />
</body>
</html>