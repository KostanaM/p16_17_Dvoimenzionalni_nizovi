package kostana.maksic;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
//Učitati dvodimenzionalni niz - matricu n x m. zračunati i ispisati sumu elemenata pete kolone niza X [n,m]
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
		System.out.print("\nSuma elemenata pete kolone niza X: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j == 4)
					s += X[i][j];

			}

		}
		System.out.print(s);
		sc.close();
	}
}
