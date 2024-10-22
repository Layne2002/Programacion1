package buclefor;

public class buclefor {

	public static void main(String[] args) {
		// creamos variable
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + " es par y múltiplo de 3, números hasta el " + i + ":");
				for (int j = 1; j <= i; j++) {
					System.out.println(j);
				}
			} else if (i % 2 == 0) {
				System.out.println(i + " es par");
			} else if (i % 2 != 0 && i % 5 == 0) {
				System.out.println(i + " es impar y múltiplo de 5, números del " + i + " hasta el 0:");
				for (int k = i; k > 0; k--) {
					System.out.println(k);
				}
			} else if (i % 2 != 0) {
				System.out.println(i + " es impar");

			}

		}
	}
}
