package repaso;

public class Main {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 3, 5, 6, 7 };

		int guardar = 0;

		for (int i = 0; i < array.length; i++) {
			guardar = array[i];
			for (int j = 0; j < array.length; j++) {
				if (guardar == array[j]) {
					System.out.println(guardar);
				}

			}
		}

	}

}
