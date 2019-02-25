/**
 * @autor Andres
 */
//Se llama esta función cuando se carga el navegador
window.onload = iniciaDatos;

/**
Función que se manda llamar
al cargar la página HTML
*/
function iniciaDatos(){
	document.getElementById("link").onclick = validaSalir;
	document.getElementById("linkSearch").onclick = busqueda;
}

/**
Función que valida si el usaurio quiere salir del sitio o no
*/
function validaSalir(){
	if (confirm("Desea salir del sitio")){
		alert("Nos vamos a Google");
		return true;//regresarmos verdadero para salir
	}
	else
	{
		alert("Nos quedamos en el sitio");
		return false;//regresamos falso para quedarnos
	}
}

/**
 * Función que pide una cadena a buscar en google
 * @returns
 */
function busqueda(){
	//Con la función prompt capturamos información del usuario
	var respuesta = prompt("Escribe la cadena a buscar:","");
	//Si hubo una respuesta concatenamos la cadena a buscar
	//al link de google
	if(respuesta){
		alert("Tu respuesta fue: " + respuesta);
		//el operador this nos sirve para referenciar
		//el elemento que provoco el evento, en este caso
		//el elemento con identificador "linkSearch"
		//y concatenamos la respuesta como un parametro
		//de una peticion get
		var nuevoLink = this + "search?q=" + respuesta;
		alert("Nuevo link" + nuevoLink);
		//redireccionamos el link
		window.location = nuevoLink;
		//Regresamos false, sino nos lleva el link originalment
		//registrado en el elmento "linkSearch"
		return false;
		
	}
	else
	{
		alert("No proporcionaste ninguna cadena a buscar");
		return false;
	}
}