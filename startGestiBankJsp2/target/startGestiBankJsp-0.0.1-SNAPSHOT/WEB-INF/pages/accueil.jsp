<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<link href="${pageContext.request.contextPath}/resources/css/3_dark_grey/css/www_rate_calc_frame.css"
	rel="stylesheet" title="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accueil</title>
</head>
<body>
<fmt:setBundle basename="com.wha.international/message"/>

<c:import url="header.jsp" />
<div class="bodyaccueil">
	<div class="row">
		<div class="offset-1 col-sm-3">
			<div id="powerd">
				<a href="https://www.transfermate.com/" target="_blank"
					id="tm_add146" class="tm_add146"><fmt:message key="acc.ws"></fmt:message> TransferMate</a>
			</div>
			<div id="demo-rate-convert"></div>
			<script>
				var apiTargetHtmlObj = document.getElementById("demo-rate-convert");
				var tmScript = document.createElement("script");
				tmScript.src = "https://www.transfermate.com/fr/exchange_rates_api.asp"; document.getElementsByTagName("head")[0].appendChild(tmScript);
			</script>
			<noscript>
				<br /> <span style="color: red;">Please enable your
					JavaScript.</span>
			</noscript>
</div>
<div class="col-sm-8">
<div class="row">
			<div class="col-sm-12">
						<form name="formulaire" action="formulaire" method= "post"> 
<input class="btn btn-primary btn-lg" type="submit" value="<fmt:message key="acc.devenirclient"></fmt:message>"></td>

</form> 
			
				</br>
				</br>
				</br>
				</br>
			</div>
			<div class="col-sm-12">
			<form name="formconnexion" action="formconnexion" method= "post"> 
<input class="btn btn-primary btn-lg" type="submit" value="<fmt:message key="acc.seconnecter"></fmt:message>"></td>

</form> 
			</div>
			</div>
		</div>
		</div>
		
<c:import url="footer.jsp" />
</body>
 

</html>