package kostana.maksic;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		// 7. Učitati dvodimenzionalni niz i ispisati elemente na:
		// a) Glavnoj dijagonali
		// b) Sporednoj dijagonali. (rade polaznici na casu)
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

		System.out.println("Matrica a: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		// a) Glavnoj dijagonali
		System.out.println("Elementi na glavnoj dijagonali su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == j)
					System.out.print(a[i][j] + " ");
			}
		}

		// b) Sporednoj dijagonali. (rade polaznici na casu)
		System.out.println("\nElementi na sporednoj dijagonali su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i + j == red - 1) // ili (i + j == kolona - 1)
					System.out.print(a[i][j] + " ");
			}
		}
		sc.close();
	}
}
