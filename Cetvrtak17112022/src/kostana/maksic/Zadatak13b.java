package kostana.maksic;

import java.util.Scanner;

public class Zadatak13b {

	public static void main(String[] args) {
		// Učitati dvodimenzionalni niz - matricu 5 x 5. zračunati i ispisati sumu svih
		// članova većih od 3.

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Elementi matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "]" + "[" + j + "]=");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		int suma = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (a[i][j] > 3)
					suma += a[i][j];

			}
		}
		System.out.print("Suma elemenata matrice većih u 3 je " + suma);
		sc.close();
	}

}
