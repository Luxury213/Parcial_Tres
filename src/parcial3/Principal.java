package parcial3;

import java.util.Scanner;

public class Principal {
	//Atributos privados
private static int numero;

//Metodo main

public static void main(String[] args) {
	//Entrada de Datos
	System.out.println("Digite la base de datos que quiere conocer"
			+ "\nDonde 1 es Oracle"
			+ "\nDonde 2 es Microsoft");
	//Clase Scanner
	Scanner sc = new Scanner(System.in);
	//Entrada de Datos
	numero = sc.nextInt();
	//Creacion de Objetos
	Oracle o1 = new Oracle();
	Microsoft m1 = new Microsoft();
	
	if(numero == 1) {
		System.out.println("Digite la cantidad de peticiones");
		
}

}
}