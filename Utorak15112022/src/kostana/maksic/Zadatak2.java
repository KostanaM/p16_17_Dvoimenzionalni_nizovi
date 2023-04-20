package kostana.maksic;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// 2. Učitati dvodimenzionalni niz:
		// a) Ispisati parne elemente niza
		// b) Ispisati neparne elemente niza(rade polaznici na casu)

		Scanner sc = new Scanner(System.in);

		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int niz[][] = new int[red][kolona];

		System.out.println("Elementi matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("niz[" + i + "," + j + "]" + "=");
				niz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");

			}
			System.out.println();
		}
		// a) Ispisati parne elemente niza
		// svaki element ima svoju poziciju koja se određuje vrednošću reda i kolone
		System.out.println("Parni elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		// b) Ispisati neparne elemente niza(rade polaznici na casu)
		System.out.println("\nNeparni elementi dvodimenzionalnog niza su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (niz[i][j] % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();
	}
}
