package kostana.maksic;

public class Zadatak9c {

	public static void main(String[] args) {

		int matrica[][] = new int[5][5];

		System.out.println("Matrica a: ");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matrica[i][j] = 1;
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nElementi na glavnoj i ispod glavne dijagonale");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j)
					System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
	}
}