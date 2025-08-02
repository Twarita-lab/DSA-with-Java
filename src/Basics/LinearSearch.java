package basics;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 8, 9, 0, 4, 7 };

		System.out.println(linearSearch(arr, 4));

	}

	private static int linearSearch(int[] arr, int targetElement) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == targetElement) {

				return i;

			}

		}
		return -1;
	}

}
