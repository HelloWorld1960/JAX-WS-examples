package com.mycompany.ws;
/**La interfaz Calculadora.java sera el EndPoint donde se va a definir el servicio que vamos a exponer en el Web Service. 
 * JAX-WS a travez de notaciones permite que la interfaz sea un EndPoint para poderlo publicar como un servicio en un 
 * Web Service. 
 * @WebService indica que sera un EndPoint. 
 * @WebMethod indica que se va exponer este metodo.
 * */
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Calculadora {
	
	@WebMethod
	public double operacion(int opcion, int valor1, int valor2);
}
