package kostana.maksic;

import java.util.Scanner;

public class Zadatak3 {
	// 3. Učitati dvodimenzionalni niz i ispisati elemente sa:
	// a) parnim indeksima redova
	// b) neparnim ideksima kolona
	// c) parnim indeksima kolona (domaci zadatak)
	// d) neparnim ideksima redova (domaci zadatak)
	// e) parnim indeksima i redova i kolona(domaci zadatak)

	public static void main(String[] args) {
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
		// a) parnim indeksima redova
		System.out.println("Parni indeksi redova su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if ((i + 1) % 2 == 0) //red
				if (i % 2 == 0)// indeks
					System.out.print(niz[i][j] + " ");
				// 1. red je neparan
				// 2. red je paran
				// 3. red je neparan
				// 4. red je paran
				// 0.red
				// 0.indeks
				// matrica nema 0 red ali ima 0 indeks
				// 0. indeks matrice je oznaka za red matrice
				// mi vidimo elemente matrice (dok su indeksi u pozadini)
			}
		}
		// b) neparnim ideksima kolona
		System.out.println("\nNeparni indeksi kolona su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				// if ((j + 1) % 2 != 0) //kolona
				if (j % 2 != 0)// indeks
					System.out.print(niz[i][j] + " ");
			}
		}
		// c) parnim indeksima kolona (domaci zadatak)
		System.out.println("\nParni indeksi kolona su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (j % 2 == 0)// indeks
					System.out.print(niz[i][j] + " ");
			}
		}
		// d) neparnim ideksima redova (domaci zadatak)
		System.out.println("\nNeparni indeksi redova su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i % 2 != 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		// e) parnim indeksima i redova i kolona(domaci zadatak)
		System.out.println("\nParni indeksi i redova i kolona su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				if (i % 2 == 0 && j % 2 == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		sc.close();
	}
}
