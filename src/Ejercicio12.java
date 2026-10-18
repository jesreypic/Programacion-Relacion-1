import java.util.Scanner;

public class Ejercicio12 {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		char tipoTarta;
		char tipoChocolate;
		char ponerNata;
		char mensajePersonalizado;
		double precio = 0;
		
		System.out.println("Seleccione el sabor de tarta que quiera pedir (M- Manzana, F-Fresa o C-Chocolate).");
		tipoTarta = teclado.next().charAt(0);
		
		if ( tipoTarta == 'M') {
			precio = precio + 12;
		}
		else {
			if ( tipoTarta == 'F') {
				precio = precio + 14;
			}
			else {
				if ( tipoTarta == 'C') {
					System.out.println("Elija el tipo de chocolate que desea (N-Negro, B-Blanco).");
					tipoChocolate = teclado.next().charAt(0);
					
					if (tipoChocolate == 'N') {
						precio = precio + 14;
					}
					else {
						if (tipoChocolate == 'B')
						precio = precio + 15;
					}
				}	

			}
		}
		System.out.println("¿Le gustaría ponerle nata a la tarta? (S/N)");
		ponerNata = teclado.next().charAt(0);
		
		if (ponerNata == 'S') {
			precio = precio + 2.50;
		}
		System.out.println("¿Desea agregar un mensaje personalizado en su tarta?(S/N)");
		mensajePersonalizado = teclado.next().charAt(0);
		
		if (mensajePersonalizado == 'S') {
			precio = precio + 2.75;
		}
		
		System.out.println("El precio total de su tarta es de: " + precio + "€. Gracias por su compra.");
	}

}
