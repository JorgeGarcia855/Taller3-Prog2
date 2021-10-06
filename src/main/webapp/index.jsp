<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>JSP - Hello World</title>
</head>
<body>
  <h1><%= "Hello World!"%></h1>
  <form action="hello-servlet" method="post">
	  <label for="email-input">Ingrese Correo:</label>
	  <input type="email" id="email-input" name="email" required>

	  <label for="password-input">Ingrese Contraseña:</label>
	  <input type="password" id="password-input" name="password" required>
	  <br>
	  <div>
		  Escoje el rol:
		  <br>
		  <label>
			  Propietario
			  <input type="radio" name="rol" value="propietario" required>
		  </label>
		  <label>
			  Funcionario
			  <input type="radio" name="rol" value="funcionario" required>
		  </label>
	  </div>

	  <button type="submit">Ingresar</button>
  </form>
<%--  <br/>--%>
<%--  <a href="hello-servlet">Hello Servlet</a>--%>
</body>
</html>