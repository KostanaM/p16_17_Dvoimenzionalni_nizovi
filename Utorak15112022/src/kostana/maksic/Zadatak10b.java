package kostana.maksic;

public class Zadatak10b {

	public static void main(String[] args) {
		// 10. Učitati dvodimenzionalni niz i ispisati sve elemente na sporednoj i iznad
		// sporedne dijagonale.

		int a[][] = new int[5][5];

		System.out.println("\nMatrica a: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				a[i][j] = 1;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nElementi na sporednoj i iznad sporedne dijagonale: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i)
					System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

	}
}
