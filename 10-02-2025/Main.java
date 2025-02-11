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
		int opcion = scanner.nextInt();

		Operacion op = null;
		ICalculadora calculadora = new CalculadoraImpl();
		Double resultado = null;
		
		switch(opcion) {

			case 1:
				op = new Operacion(n1, n2, Operando.SUMA);
			break;

			case 2:
				op = new Operacion(n1, n2, Operando.RESTA);
			break;

			case 3:
				op = new Operacion(n1, n2, Operando.MULT);
			break;
				
			case 4:
				op = new Operacion(n1, n2, Operando.DIV);
			break;	
		}

		resultado = calculadora.calcular(op);
                System.out.println("Tu resultado es: " + resultado);

	}
}
