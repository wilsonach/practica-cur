<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Datos personales</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<script type="text/javascript" src="../js/script.js"></script>
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/jqueryui.js"></script>
<!-- 
*Descargar JQuery y apuntar a el en el directorio JS 
*Validar formulario con JQuery
-->
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>
</head>
<body>
	<div id="cont">
		<h3>Datos Personales</h3>
		<form name="forma" method="GET" action="../persona">
			<input type="text" name="txtDocumento" id="txtDocumento" placeholder="Documento" autocomplete="off" /> <br> <br> 
			<input type="text" name="txtNombre" id="txtNombre" placeholder="Nombre" autocomplete="off" /> <br> <br> 
			<input type="text" name="txtApellido" placeholder="Apellido" autocomplete="off" /> <br> <br> 
			<input type="text" name="txtCelular" placeholder="Celular" autocomplete="off" /> <br> <br>
			<input type="text" name="txtDireccion" placeholder="Direccion" autocomplete="off" /> <br><br>
			<button type="button" onclick="validar();">Enviar</button>
			<br> <br> <br>
		</form>
	</div>
</body>
</html>