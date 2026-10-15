import java.util.Scanner;

public class Ejercicio7 {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		char letra;
		
		System.out.println("Introduce un caracter.");
		
		letra = teclado.next().charAt(0);
		
		switch (letra){
		case 'A':
			System.out.println("El caracter introducido es la primera vocal 'A'.");
			break;
		case 'E':
			System.out.println("El caracter introducido es la segunda vocal 'E'.");
			break;
		case 'I':
			System.out.println("El caracter introducido es la tercera vocal 'I'.");
			break;
		case 'O':
			System.out.println("El caracter introducido es la cuarta vocal 'O'.");
			break;
		case 'U':
			System.out.println("El caracter introducido es la quinta vocal 'U'.");
			break;
		default:
			System.out.println("El caracter introducido no coincide con ninguna de las 5 vocales.");
			
		}
	}

}
