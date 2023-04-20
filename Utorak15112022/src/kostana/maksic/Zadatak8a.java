package kostana.maksic;

import java.util.Scanner;

public class Zadatak8a {

	public static void main(String[] args) {
		// 8. Učitanom dvodimenzionalnom nizu zameniti redove i kolone.

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

		System.out.println("Nova matrica: ");

		for (int j = 0; j < kolona; j++) {
			for (int i = 0; i < red; i++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
