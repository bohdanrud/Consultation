<%@ include file="/WEB-INF/taglib.jsp" %>

<h2>${ title }</h2>

<form:form action="/login" method="POST">

	Login: <input type="text" name="login"> <br>
	Password: <input type="password" name="password"> <br>
	<input type="submit" value="Log In">

</form:form>