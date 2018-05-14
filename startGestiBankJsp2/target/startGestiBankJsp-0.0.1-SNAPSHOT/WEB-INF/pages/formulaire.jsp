<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ouverture de compte</title>
<c:import url="header.jsp" />
<SCRIPT src="scripts/scriptform.js" type="text/javascript"></SCRIPT>
</head>
<body>
<fmt:setBundle basename="com.wha.international/message"/>


<%-- 		<form class="form-horizontal" method="get" id="formcrea" action="demandeCreationClient"> --%>
			<form:form class="form-horizontal" method="post" action="demandeCreationClient" modelAttribute="demande">
			<fieldset>

				<legend><fmt:message key="f.ouvcompte"></fmt:message></legend>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfnom"><fmt:message key="f.nom"></fmt:message> : </label>
					<div class="col-md-6">
						<form:input path="nom"/>

					</div>
					
				</div>
				<div class="jserror" id="errNom"></div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfprenom"><fmt:message key="f.prenom"></fmt:message>
						: </label>
					<div class="col-md-6">
						<input id="txtfprenom" name="txtfprenom" type="text"
							placeholder="<fmt:message key="f.prenom"></fmt:message>" class="form-control input-md" >

					</div>
				</div>
				<div class="jserror" id="errPrenom"></div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfmail"><fmt:message key="f.mail"></fmt:message> : </label>
					<div class="col-md-6">
						<input id="txtfmail" name="txtfmail" type="email"
							placeholder="<fmt:message key="f.mail"></fmt:message>" class="form-control input-md"
							>

					</div>
				</div>
				<div class="jserror" id="errMail"></div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfnumrue"><fmt:message key="f.numrue"></fmt:message> : </label>
					<div class="col-md-6">
						<input id="txtfnumrue" name="txtfnumrue" type="text"
							placeholder="<fmt:message key="f.numerue"></fmt:message>" class="form-control input-md">

					</div>
				</div>

				<div class="form-group row text-right fcrea">
					<label class="col-md-2 control-label" for="txtfrue"><fmt:message key="f.rue"></fmt:message> : </label>
					<div class="col-md-6">
						<input id="txtfrue" name="txtfrue" type="text" placeholder="<fmt:message key="f.rue"></fmt:message>"
							class="form-control input-md">

					</div>
				</div>

				<div class="form-group row text-right fcrea ">
					<label class="col-md-2 control-label" for="txtfcodpo"><fmt:message key="f.codepo"></fmt:message> : </label>
					<div class="col-md-6">
						<input id="txtfcodpo" name="txtfcodpo" type="text" placeholder=""
							class="form-control input-md">

					</div>
				</div>

				<div class="form-group fcrea row text-right ">
					<label class="col-md-2 control-label" for="txtfville"><fmt:message key="f.ville"></fmt:message>
						: </label>
					<div class="col-md-6">
						<input id="txtfville" name="txtfville" type="text"
							placeholder="<fmt:message key="f.ville"></fmt:message>" class="form-control input-md">

					</div>
				</div>

				<div class="form-group fcrea row text-right">
					<label class="col-md-2 control-label" for="selectbasic"><fmt:message key="f.pays"></fmt:message>
						: </label>
					<div class="col-md-6">
						<select id="selectbasic" name="selectbasic" class="form-control">
							<option value="1">France</option>
							<option value="2">Option two</option>
							<option value="3">Option three</option>
						</select>
					</div>
				</div>

				<div class="form-group fcrea row text-right">
					<label class="col-md-2 control-label" for="txtfnbenf"><fmt:message key="f.numenf"></fmt:message> : </label>
					<div class="col-md-1">
						<input id="txtfnbenf" name="txtfnbenf" type="text"
							class="form-control input-md">

					</div>
				</div>

				<div class="form-group fcrea row text-right ">
					<label class="col-md-2 control-label" for="radiofsitumari"><fmt:message key="f.sitmar"></fmt:message> : </label>
					<div class="col-md-4">
						<label class="radio-inline" for="radiofsitumari-0"> <input
							type="radio" name="radiofsitumari" id="radiofsitumari-0"
							value="1" checked="checked"> <fmt:message key="f.celi"></fmt:message>
						</label> <label class="radio-inline" for="radiofsitumari-1"> <input
							type="radio" name="radiofsitumari" id="radiofsitumari-1"
							value="2"> <fmt:message key="f.mari"></fmt:message>
						</label> <label class="radio-inline" for="radiofsitumari-2"> <input
							type="radio" name="radiofsitumari" id="radiofsitumari-2"
							value="3"><fmt:message key="f.veuf"></fmt:message>
						</label>
					</div>
				</div>

			</fieldset>

			<fieldset>

				<div class="form-group">

					<div class="col-md-10 text-center">
						
						<input type="submit" value="<fmt:message key="f.valid"></fmt:message>" class="btn btn-success"  id="btnfvalider" name="btnfvalider" >
						<script src="scripts/scriptform.js" type="text/javascript"></script>
						<a href="Controller?page=formulaireok"><button id="button2id" name="button2id" class="btn btn-danger"><fmt:message key="f.annul"></fmt:message></button></a>
						
						
					</div>
				</div>

			</fieldset>

		</form:form>
 <p class="info">${ form.resultat }</p>
	<c:import url="footer.jsp" />
</body>

</html>