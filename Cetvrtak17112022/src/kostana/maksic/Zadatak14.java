package kostana.maksic;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		// Učitati dvodimenzionalni niz - matricu n x m. Izračunati i ispisati sumu svih
		// negativnih elemenata.
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
		int s = 0;
		System.out.print("\nSuma negativnih elemenata: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (X[i][j] < 0)
					s += X[i][j];

			}

		}
		System.out.print(s);
		sc.close();
	}
}
