package kostana.maksic;

import java.util.Scanner;

public class Zadatak10c {

	public static void main(String[] args) {
		// 10. Učitati dvodimenzionalni niz i ispisati sve elemente na sporednoj i iznad
		// sporedne dijagonale.
		Scanner sc = new Scanner(System.in);
		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];

		System.out.println("Elementi matrice a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + "=");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nMatrica a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nElementi na sporednoj i iznad sporedne dijagonale: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j >= i)
					System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

		sc.close();
	}
}
