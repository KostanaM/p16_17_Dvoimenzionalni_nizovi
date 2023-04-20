package kostana.maksic;

public class Zadatak11b {

	public static void main(String[] args) {
		// 11. Učitati dvodimenzionalni niz - matricu 5x5. Izračunati i ispisati sumu
		// elemenata trećeg niza x[5,5]

		int[][] X = { { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1 } };

		System.out.println("Matrica X: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(X[i][j] + "  ");
			}
			System.out.println();
		}
		int s = 0;
		System.out.print("\nSuma elemenata trećeg reda niza X: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2)
					s += X[i][j];

			}

		}
		System.out.print(s);

	}
}
