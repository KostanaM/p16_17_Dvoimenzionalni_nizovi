package kostana.maksic;

import java.util.Scanner;

public class Zadatak2 {
//Suma kvadrata elemenata matrica koji nisu negativni elementi
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj redova: ");
		int red = sc.nextInt();

		System.out.print("Unesite broj kolona: ");
		int kolona = sc.nextInt();

		// "matrica" = naziv naseg dvodimenzinalnog niza
		int matrica[][] = new int[red][kolona];

		System.out.println("\nUnesite elemente: ");
		int s = 0;
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("matrica[" + i + "," + j + "]= ");
				matrica[i][j] = sc.nextInt();
				if (matrica[i][j] < 0)
					System.out.println("Unesite pozitivnu vrednost");
				else
					s += Math.pow(matrica[i][j], 2);

			}
		}
		System.out.print("\nSuma kvadrata elemenata matrice: " + s);
		sc.close();
	}
}
