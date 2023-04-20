package kostana.maksic;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// 5. Učitati dvodimenzionalni niz i izračunati zbir svih elemenata.
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

		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Zbir elemenata matrice a: ");
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				s += a[i][j];
			}

		}
		System.out.print(s);

		sc.close();
	}
}
