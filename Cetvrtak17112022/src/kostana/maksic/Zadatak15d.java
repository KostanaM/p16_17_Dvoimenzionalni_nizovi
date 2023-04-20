package kostana.maksic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak15d {

	public static void main(String[] args) {
		// Učitati dvodimenzionalni niz - matricu 5 x 5. Izračunati i ispisati
		// aritmetičku sredinu parnih elemenata na kolonama
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
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

		for (int i = 0; i < red; i++) {
			double s = 0;
			for (int j = 0; j < kolona; j++) {

				if (X[i][j] % 2 == 0) {
					s += (double) X[j][i];
				}

			}
			System.out.println("\nAritmetička sredina parnih elemenata na koloni: " + df.format(s / red));
		}

		sc.close();
	}
}
