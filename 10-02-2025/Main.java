import java.io.*;
import java.util.Scanner;

class Main {

	public static void main(String [] pepito){

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero: ");
		double n1 = scanner.nextDouble();

		System.out.println("Ingresa el segundo numero: ");
		double n2 = scanner.nextDouble();

		System.out.println("1.Suma\n2.Resta\n3.Multiplicacion\n4.Division");

		System.out.println("Ingresa el numero de la operacion que quieres hacer ");
		String opcionStr = scanner.next().toUpperCase();

		Operando operacion = Operando.valueOf(opcionStr);

		Operacion op = new Operacion (n1,n2,operacion);
		ICalculadora calculadora = new CalculadoraImpl();
		Double resultado = resultado = calculadora.calcular(op);
                System.out.println("Tu resultado es: " + resultado);

	}
}
