<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/signup-style.css">
<title>Registrarse</title>
</head>
<body>
	<div id='container'>
		<div class='signup'>
			<form action="" method="post">
				<select name="selTipoDocu" required>
					<option value="">Seleccione</option>
					<option value="CC">Cedula de Ciudadania</option>
					<option value="PA">Pasaporte</option>
					<option value="CE">Cedula Extranjería</option>
				</select>
				<input type="text" name="txtNumDocu" placeholder="Ingrese número de documento" required>
				<input type="text" name="txtNombre" placeholder="Ingrese su nombre" required>
				<input type="text" name="txtEmail" placeholder="Correo electrónico" required>
				<input type="text" name="txtTelefono" placeholder="Número de telefono" required>
				<select name="selPregSegura" required>
					<option value="">Pregunta de seguridad</option>
					<option value="¿Cómo se llamaba mi primera mascota?">¿Cómo se llamaba mi primera mascota?</option>
					<option value="¿Cual es el nombre de su padre?">¿Cual es el nombre de su padre?</option>
					<option value="¿Marca de su primer vehiculo?">¿Marca de su primer vehiculo?</option>
				</select>
				<input type="text" name="txtPregRespuesta" placeholder="Ingrese la respuesta" required>
				<input type="password" name="txtPassword" placeholder="Ingrese su contraseña" required>
				<input type="submit" name="btnRegistrar" value="Registrar" required>
			</form>			
		</div>
		<div class='whysign'>
			<h1>Successfully Updated</h1>

			<h1>Some thing Went Wrong! Try Again !</h1>

			<h2>Online Shopping</h2>
			<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et 
			   dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex 
			   ea commodo consequat</p>
			<h2><a href="">Iniciar Sesión</a></h2>
		</div>
	</div>

</body>
</html>