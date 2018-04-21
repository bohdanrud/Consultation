<%@ include file="/WEB-INF/taglib.jsp"%>

<form:form action="/save-user" modelAttribute="userModel" method="POST">

	<form:input path="login" />
	<br>
	<form:input path="email" />
	<br>
	<form:input path="password" />
	<br>
	<form:input path="passwordConfirmation" />
	<br>

	<input type="submit" value="Add User">
</form:form>