package cliente;

/**Cliente que consumira el servicio.
 * Para generar el cliente se debe acceder a simbolo de sistema en la carpeta del proyecto/src y escribir:
 * wsimport -s . http://localhost:8080/WS/Calculadora?wsdl
 * Este comando genera todas clases necesarias para poder crear el cliente y poder consumir el servicio.
 * */
public class CalculadoraConsumer {

	public static void main(String[] args) {
		// Se crea un objeto de la clase CalculadoraImplementacionService que permitira consumir los servicios.
		CalculadoraImplementacionService calculadoraservice = new CalculadoraImplementacionService();

		Calculadora consumer = calculadoraservice.getCalculadoraImplementacionPort();

		System.out.println("Suma");
		System.out.println(consumer.operacion(1, 6, 4));

		System.out.println("Resta");
		System.out.println(consumer.operacion(2, 6, 4));

		System.out.println("Multiplicacion");
		System.out.println(consumer.operacion(3, 6, 4));

		System.out.println("Division");
		System.out.println(consumer.operacion(4, 10, 5));

	}

}
