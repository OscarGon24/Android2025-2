import java.io.*;

class Main {

	public static void main(String [] pepito){

		Operacion op = new Operacion(50.9, .1, Operando.SUMA);
		ICalculadora calculadora = new CalculadoraImpl();
		Double resultado = calculadora.calcular(op);
		System.out.println("Tu resultado es: " + resultado);
	}

}
