package kostana.maksic;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// 6. Učitati dvodimenzionalni niz i pronaći:
		// a) Najeveći element
		// b) Najmanji element (rade polaznici na casu)
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

		System.out.println("Elementi dvodimenzionalnog niza a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		// a) Najeveći element
		System.out.println("Najveći elemenat matrice a: ");
		int max = a[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (max < a[i][j])
					max = a[i][j];
			}
		}
		System.out.print(max);

		// b) Najmanji element (rade polaznici na casu)
		System.out.println("\nNajmanji elemenat matrice a: ");
		int min = a[0][0];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (min > a[i][j])
					min = a[i][j];
			}
		}
		System.out.print(min);
		sc.close();
	}
}
