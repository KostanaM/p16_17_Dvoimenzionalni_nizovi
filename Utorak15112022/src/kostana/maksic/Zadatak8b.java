package kostana.maksic;

public class Zadatak8b {

	public static void main(String[] args) {

		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };

		System.out.println("Matrica a: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nMatrica b: ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

}
