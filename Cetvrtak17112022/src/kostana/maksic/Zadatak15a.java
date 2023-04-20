package kostana.maksic;

import java.util.Scanner;

public class Zadatak15a {

	public static void main(String[] args) {
		// Učitati dvodimenzionalni niz - matricu 5 x 5. Izračunati i ispisati
		// aritmetičku sredinu svih elemenata
		Scanner sc = new Scanner(System.in);
		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int X[][] = new int[red][kolona];

		System.out.println("Elementi matrice X: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("X[" + i + "," + j + "]" + "=");
				X[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nMatrica X: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(X[i][j] + " ");
			}
			System.out.println();
		}
		double s = 0, b = 0;
		System.out.print("\nAritmetička sredina svih elemenata: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				s += (double) X[i][j];
				b++;

			}

		}
		System.out.print(s / b);
		sc.close();
	}
}
