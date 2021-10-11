<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>Ciudadano de 4 Patas</title>
</head>
<body>
  <h2><%="Ciudadano de 4 Patas"%></h2>
  <form action="main-page" method="post">
	  <label for="email-input">Ingrese Correo:</label>
	  <input type="email" id="email-input" name="email" required>
	  <br>
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
		  <br>
		  <label>
			  Funcionario
			  <input type="radio" name="rol" value="funcionario" required>
		  </label>
	  </div>
	  <button type="submit">Ingresar</button>
  </form>
</body>
</html>