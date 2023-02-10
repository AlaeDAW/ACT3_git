
import java.io.IOException;
import java.util.Scanner;

/*
Comptar les xifres d'un nombre enter en Java
Programa Java que demana un nombre enter per teclat i calcula i mostra el nombre de xifres que té.
Per exemple si s'introdueix el número 54391 el programa mostrarà el missatge:
El número té 5 xifres

Si s'introdueix el número 101 es mostrarà el missatge:
El número té 3 xifres

El procés llegir un número i comptar les seves xifres es repetirà fins que es contesti ‘N’ a la pregunta Continuar? (S/N)
Si es respon 'S' es tornarà a demanar un altre número. 
Per a saber quantes xifres té un nombre enter farem el següent:
Dividirem el número successivament entre 10. En cada divisió prendrem la part sencera i tornem a dividir. Aquest procés es repeteix fins que s'obtingui un zero com a quocient en la divisió.

Per exem1ple, si el número llegit és 1234 farem les següents operacions:
1234 / 10 = 123
123 / 10 = 12
12 / 10 = 1
1 / 10 = 0

hem realitzat 4 divisions fins a obtenir un zero com a quocient, per tant el número té 4 xifres.
 */

public class Comptador {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int xifres;
		String numeroEntrat;
		char car;
		do {
			System.out.print("Introdueix un número sencer: ");
			numeroEntrat = sc.next();
			numeroEntrat = 1 + numeroEntrat;
			int numResultat = Integer.valueOf(numeroEntrat);
			xifres = 0; // aquesta variable és el comptador de xifres
			while (numResultat != 0) { // mentre quedin xifres
				numResultat = numResultat / 10; // eliminem el darrer dígit
				xifres++; // sumem 1 al comptador de xifres
			}
			--xifres;
			System.out.println("El número tiene " + xifres + " cifras");
			System.out.print("Continuar? ");
			car = (char) System.in.read();
		} while (car == 's' || car == 'S');
		System.out.print("Programa finalitzat!");
	}
}