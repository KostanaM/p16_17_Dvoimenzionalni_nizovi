package kostana.maksic;

public class Zadatak13a {

	public static void main(String[] args) {
		// Učitati dvodimenzionalni niz - matricu 5 x 5. zračunati i ispisati sumu svih
		// članova većih od 3.

		int[][] a = { { 7, 1, 8, 1, 1 }, { 4, 1, 5, 9, 1 }, { 2, 1, 1, 1, 1 }, { 1, 6, 1, 3, 5 }, { 1, 2, 9, 1, 7 } };

		System.out.println("Matrica a: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		int s = 0;
		System.out.println("\nSuma elemenata većih od 3:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a[i][j] > 3)
					s += a[i][j];

			}

		}
		System.out.print(s);
	}
}
