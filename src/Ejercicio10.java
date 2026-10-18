import java.util.Scanner;

public class Ejercicio10 {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		double numero1;
		double numero2;
		double resultado = 0;
		char operadorAritmetico;
		
		System.out.println("Introduce el primer número para la operación.");
		numero1 = teclado.nextDouble();
		
		System.out.println("Introduce el segundo número");
		numero2 = teclado.nextDouble();
		
		System.out.println("Introduzca el operador de la operación.");
		operadorAritmetico = teclado.next().charAt(0);
		
			switch (operadorAritmetico) {
			case '+':
				resultado = numero1+numero2;
				System.out.println("El resultado es: " + resultado);
				break;
			case '-':
				resultado = numero1-numero2;
				System.out.println("El resultado es: " + resultado);
				break;
			case '*':
				resultado = numero1*numero2;
				System.out.println("El resultado es: " + resultado);
				break;
			case '/':
				resultado = numero1/numero2;
				System.out.println("El resultado es: " + resultado);
				break;
			default:
				System.out.println("Error, operador introducido incorrecto.");
			}
	}

}
