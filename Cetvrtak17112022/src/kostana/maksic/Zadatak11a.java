package kostana.maksic;

import java.util.Scanner;

public class Zadatak11a {

	public static void main(String[] args) {
		// 11. Učitati dvodimenzionalni niz - matricu 5x5. Izračunati i ispisati sumu
		// elemenata trećeg niza x[5,5]
		Scanner sc = new Scanner(System.in);
		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int X[][] = new int[red][kolona];

		System.out.println("Elementi matrice a: ");
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
		System.out.println("\nSuma elemnata trećeg reda niza X: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == 2)
					s += X[i][j];

			}

		}
		System.out.print(s);
		sc.close();
	}
}
