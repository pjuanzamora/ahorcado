package Juego;

import java.util.Scanner;

public class JuegoAhorcado {
	//Pinta el muñeco en pantalla dependiendo de las vidas
	public static void dibujarMuneco(int vidas) {
		switch (vidas) {
		case 7:
			System.out.println("_____________________");
			break;
		case 6:
			System.out.println("|");
			System.out.println("|_____________________");
			break;
		case 5:
			
			break;
		case 4:
			
			break;
		case 3:
			
			break;
		case 2:
			
			break;
		case 1:
			
			break;
		case 0:
			
			break;

		default:
			break;
		}
	}
	
	//Comprueba que una letra existe en la palabra.
	//Devuelve verdadero si se encuentra, falso en caso contrario
	public static boolean comprobarLetraPalabra(String vPalabraSecreta[], String letra) {
		boolean encontrado=false;
		
		return encontrado;
	}
	
	public static void inicializarVectores(String palabra, String vPalabraSecreta[], String vAciertos[],String vFallos[]) {
		for (int i = 0; i < vFallos.length; i++) {
			vFallos[i] = "_ ";
		}
		for (int i = 0; i < vPalabraSecreta.length; i++) {
			//Trocear la palabra en letras al vector
			
			vAciertos[i] = "_ ";
		}
	}
	
	public static void main(String[] args) {
		//Vidas totales 7
		Scanner leer = new Scanner(System.in);
		int vidas = 8;
		String palabraSecreta = "Juan";
		String letra;
		String vPalabraSecreta[], vAciertos[], vFallos[];
		vPalabraSecreta = new String[palabraSecreta.length()];
		vAciertos = new String[palabraSecreta.length()];
		vFallos = new String[vidas];
		inicializarVectores(palabraSecreta, vPalabraSecreta, vAciertos, vFallos);
		//Estructura general del juego
		do {
			//1º Preguntar letra
			System.out.println("Dime una letra");
			letra = leer.next();
			//2º Comprobar si la letra está en la palabra
			
			//3º Dibujar muñeco
			dibujarMuneco(vidas);
			//4º Dibujar aciertos y errores
			vidas--;
		}while(vidas>=0);

	}

}
