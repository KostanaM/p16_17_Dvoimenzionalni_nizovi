package kostana.maksic;

import java.util.Scanner;

public class Zadatak3 {
//Suma kvadrata elemenata matrice na glavnoj dijagonali
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		// "matrica" = naziv naseg dvodimenzinalnog niza
		int matrica[][] = new int[red][kolona];

		System.out.println("Unesite elemente: ");

		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("matrica[" + i + "," + j + "]= ");
				matrica[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza:");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i == j)

					s += Math.pow(matrica[i][j], 2);
			}
		}

		System.out.println("Suma kvadrata elemenata matrice je: " + s);

		sc.close();
	}

}
