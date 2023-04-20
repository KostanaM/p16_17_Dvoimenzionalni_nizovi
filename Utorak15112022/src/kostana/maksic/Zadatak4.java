package kostana.maksic;

import java.util.Scanner;

public class Zadatak4 {
	// 4. Učitati dva dvodimenzionalna niza, a zatim izračunati:
	// a) Zbir elemenata
	// b) Razliku elemenata (rade polaznici na casu)
	// c) Proizvod elemenata (kvadratna matrica) (domaci zadatak)
	// d) Proizvod matrice skalarom.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Broj redova: ");
		int red = sc.nextInt();

		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();

		int a[][] = new int[red][kolona];
		int b[][] = new int[red][kolona];
		int z[][] = new int[red][kolona];
		int r[][] = new int[red][kolona];
		int p[][] = new int[red][kolona];
		int s[][] = new int[red][kolona];

		System.out.println("Elementi prve matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("a[" + i + "," + j + "]" + "=");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi druge matrice: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print("b[" + i + "," + j + "]" + "=");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza a su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi dvodimenzionalnog niza b su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		// a) Zbir elemenata
		System.out.println("Zbir elemenata matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				z[i][j] = a[i][j] + b[i][j];
				System.out.println("z[" + i + "," + j + "]" + "=" + z[i][j]);
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza z su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(z[i][j] + " ");
			}
			System.out.println();
		}
		// b) Razliku elemenata (rade polaznici na casu)
		System.out.println("Razlika elemenata matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				r[i][j] = a[i][j] - b[i][j];
				System.out.println("r[" + i + "," + j + "]" + "=" + r[i][j]);
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza r su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}
		// c) Proizvod elemenata (kvadratna matrica) (domaci zadatak)
		System.out.println("Proizvod elemenata matrica: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				p[i][j] = a[i][j] * b[i][j];
				System.out.println("p[" + i + "," + j + "]" + "=" + p[i][j]);
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza p su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(p[i][j] + " ");
			}
			System.out.println();
		}

		// d) Proizvod matrice skalarom
		System.out.println("Proizvod matrice a skalarom 3: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				s[i][j] = 3 * (a[i][j]);
				System.out.println("s[" + i + "," + j + "]" + "=" + s[i][j]);
			}
		}
		System.out.println("Elementi dvodimenzionalnog niza s su: ");
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kolona; j++) {
				System.out.print(s[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
