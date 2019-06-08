package com.mycompany.ws;
/**CalculadoraPublish se encarga de publicar el servicio, es decir que creara el wsdl que es el contarto donde se 
 * exponen los servicios del WebService.
 * En la direccion http://localhost:8080/WS/Calculadora?wsdl se muestran los servicios que se exponen hacia los clientes 
 * que va a cosumir el servicio.
 * */
import javax.xml.ws.Endpoint;

public class CalculadoraPublish {

	public static void main(String[] args) {
		// Indicamos un servidor virtual que es donde se publicara el servicio.
		// Tambien la clase que implementa el servicio.
		Endpoint.publish("http://localhost:8080/WS/Calculadora", new CalculadoraImplementacion());
		
	}

}
