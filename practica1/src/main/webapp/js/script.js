/**
 * 
 */
function validar(){
	formulario = document.forms[0];
	var nombre = formulario.txtNombre.value;
	if(nombre != ''){
		formulario.submit();
	} else{
		alert('El campo esta vacio');
	}
} 