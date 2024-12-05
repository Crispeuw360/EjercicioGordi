package programaPrincipal;


import java.util.ArrayList;
import clases.*;
import utilidades.Utilidades;

public class Main {
	
	public static int mostrarMenu() {
		System.out.println("1. ALTA GORDI/PESADOR ");
		System.out.println("2. LISTADO DE GORDIS: ");
		System.out.println("3. AÑADIR UNA MEDICIÓN A UN GORDI Y VER SU EVOLUCIÓN:");
		System.out.println("4.- ESTADISTICA DE GORDIS:");
		System.out.println("5. Salir");
		return Utilidades.leerInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op=-1;
		ArrayList<Persona> a = new ArrayList<>();

		do {
			switch(op=mostrarMenu()) {
			case 1:
				introducir(a, teclado);
				break;
			case 2:
				if(!a.isEmpty()) {
					//introducirPublicacion(a, teclado);
				}else {
					System.out.println("Debe introducir primero.");
				}
				break;
			case 3:
				if(!a.isEmpty()) {
				//	mostrarLibrosGalardo(a, teclado);
				}else {
					System.out.println("Debe introducir primero.");
				}

				break;
			case 4:
				if(!a.isEmpty()) {
				//	mostrarProfesores(a);
				}else {
					System.out.println("Debe introducir primero.");
				}
				break;
			case 5:
				System.out.println("Agur!");
				break;
			default:
				System.out.println("Esa op no esta");
			}
		}while(op!=5);
		
		
	}

}
