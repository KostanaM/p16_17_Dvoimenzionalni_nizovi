package kostana.maksic;

import java.util.Scanner;

public class Zadatak1 {
	// 1. Učitati elemente dvodimenzionalnog niza, a zatim ispisati:
	// a) sve elemente dvodimenzionalnog niza
	// b) elemente prvog reda
	// c) elemente druge kolone

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("niz[" + i + "," + j + "]" + "=");
				niz[i][j] = sc.nextInt();
			}
		}
		// a) sve elemente dvodimenzionalnog niza
		System.out.println("Matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		// b) elemente prvog reda
		System.out.println("Elementi prvog reda matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		// c) elemente druge kolone
		System.out.println("\nElementi druge kolone matrice su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 1) // ispitivanje indeksa kolone dvodimenzionalnog niza
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();

	}
}
