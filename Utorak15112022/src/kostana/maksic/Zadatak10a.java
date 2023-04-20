package kostana.maksic;

public class Zadatak10a {

	public static void main(String[] args) {
		// 10. Učitati dvodimenzionalni niz i ispisati sve elemente na sporednoj i iznad
		// sporedne dijagonale.

		int[][] a = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		System.out.println("Matrica a: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("\nElementi na sporednoj i iznad sporedne dijagonale:");
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j >= i; j--) {
				// if (j >= i)
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
