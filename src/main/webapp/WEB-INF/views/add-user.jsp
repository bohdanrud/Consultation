<%@ include file="/WEB-INF/taglib.jsp"%>

<style>
.error{
color: red;
}

</style>

<form:form action="/save-user" modelAttribute="userModel" method="POST">
<form:errors path="*" cssClass="error"></form:errors>

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