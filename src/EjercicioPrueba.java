import java.util.Scanner;

public class EjercicioPrueba {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		int edad;
		int descuento = 0;
		int precioMasajes;
		double precioFinal;
		char masajeFacial;
		char masajeEspalda;
		char masajeCuello;
		char masajePiernas;
		
		do {
			System.out.println("Bienvenido a nuestro centro de masajes, por favor introduzca su edad.(18-100)");
			edad = teclado.nextInt();
		} while (edad<18 || edad>100);
		
		descuento = 0;
		
		if (edad>60) {
			descuento = descuento + 5;
		}
		else {
			if (edad>=40) {
				descuento = descuento + 2;
			}
		}
		do {
			System.out.println("¿Desea masaje facial? (S/N)");
			masajeFacial = teclado.next().charAt(0);
		} while (masajeFacial!='S' && masajeFacial!='N');
		
		precioMasajes = 0;
		
		if (masajeFacial == 'S') {
			precioMasajes = precioMasajes + 20;
		}
		
		do {
			System.out.println("¿Desea masaje de espalda? (S/N)");
			masajeEspalda = teclado.next().charAt(0);
		} while (masajeEspalda!='S' && masajeEspalda!='N');
		
		if (masajeEspalda == 'S') {
			precioMasajes = precioMasajes + 22;
		}
		do {
			System.out.println("¿Desea masaje de cuello? (S/N)");
			masajeCuello = teclado.next().charAt(0);
		} while (masajeCuello!='S' && masajeCuello!='N');
		
		if (masajeCuello == 'S') {
			precioMasajes = precioMasajes + 18;
		}
		do {
			System.out.println("¿Desea masaje de piernas? (S/N)");
			masajePiernas = teclado.next().charAt(0);
		} while (masajePiernas!='S' && masajePiernas!='N');
		
		if (masajePiernas == 'S') {
			precioMasajes = precioMasajes + 25;
		}
		
		if (precioMasajes == 85) {
			descuento = descuento + 3;
		}
		
		if (precioMasajes == 0) {
			System.out.println("Error. No ha elegido ningún masaje.");
		}else {
			precioFinal = precioMasajes - precioMasajes * descuento / 100.0;
			System.out.println("El precio final es de " + precioFinal + " €.");
		}
	}

}
