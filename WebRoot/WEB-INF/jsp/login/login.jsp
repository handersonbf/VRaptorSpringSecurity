<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<!--<form action="<c:url value="/main"/>" name="loginForm" method="post">-->
<!--	<fieldset id="login">-->
<!--		<button type="submit" id="submit">Enviar</button>-->
<!--	</fieldset>-->
<!--</form>-->

<!--<c:set value="SysPDVWebAutorizador/j_spring_security_check" var="loginUrl" />-->
<form id="login" name="login" method="post" action="WebSpringSecurityOSS/j_spring_security_check">
	<fieldset id="login">
		<legend>Login</legend>
		<label for="login">Usuário</label>
		<input type="text" name="j_username" id="login" />	
		<label for="password">Senha</label>
		<input type="password" name="j_password" id="password" />
		<br clear="all" />
		<button type="submit" id="submit">Enviar</button>
	</fieldset>
</form>

