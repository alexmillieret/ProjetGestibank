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


<h1>Test recup demandes</h1>

	<th>Id</th>
	<th>Nom</th>

	<table border="1">

		<c:forEach var="demande" items="${listDemande}">
			<tr>
				<td>${demande.idDemande}</td>
				<td>${demande.nom}</td>
				<td><a href="editEmployee?id=${demande.idDemande}">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp; <a
					href="deleteDemande?id=${demande.idDemande}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>


<c:import url="footer.jsp" />
</body>
</html>