<%@ include file="/WEB-INF/taglib.jsp"%>

<form:form action="/save-user" modelAttribute="userModel" method="POST">

	Login: <form:input path="login" />
	<br>
	Email: <form:input path="email" />
	<br>
	Password: <form:input path="password" />
	<br>
	Password Confirmation: <form:input path="passwordConfirmation" />
	<br>

	<input type="submit" value="Add User">
</form:form>