<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ingrese datos</title>
</head>
<body>
	<form action="persona" method="post">
		<fieldset>

			<p>
				<label>Datos</label> <br> Documento <input type="text"
					name="documento" id="documento"> <br> Nombre <input
					type="text" name="nombre" id="nombre"> <br> Dirección
				<input type="text" name="direccion" id="direccion"> <br>Edad <input
					type="text" name="edad" id="edad"> <input type="hidden"
					name="operacion">
			</p>
			<p>
				<input type="button" value="Guardar" onclick="javascript:enviar('G');" /> 
				<input type="button" value="Actualizar" onclick="javascript:enviar('A');" />
				<input type="button" value="Eliminar" onclick="javascript:enviar('E');" />
			</p>
		</fieldset>
	</form>

	<%=request.getAttribute("error")%>
</body>
</html>


















