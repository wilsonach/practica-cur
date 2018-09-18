/**
 * Empresa :Remington
 * 
 */

function enviar(operacion){
	formulario = document.forms[0];
	formulario.operacion.value=operacion;
    formulario.submit();	
}