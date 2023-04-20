package kostana.maksic;

public class Zadatak9b {

	public static void main(String[] args) {
		// 9.Učitati dvodimenzionalni niz i ispisati sve elemente na glavnoj i ispod
		// glavne dijagonale.

		int[][] a = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		System.out.println("Matrica a: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("\nElementi na glavnoj i ispod glavne dijagonale");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i + j <= 5 - 1)
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
