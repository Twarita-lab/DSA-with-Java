package basics;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(binarySearch(arr, 7, 0, arr.length - 1));
		// System.out.println(binarySearchWithWhileLoop(arr, 7));

	}

	private static int binarySearchWithWhileLoop(int[] arr, int i) {
		int left = 0;
		int right = arr.length - 1;
		int middle;
		while (left <= right) {
			middle = (left + right) / 2;
			if (arr[middle] == i) {
				return middle;
			} else if (arr[middle] > i) {
				right = middle - 1;
			} else if (arr[middle] < i) {
				left = middle + 1;
			}

		}
		return -1;
	}

	private static int binarySearch(int[] arr, int targetElement, int left, int right) {
		if (right < left)
			return -1;

		int middle = (left + right) / 2;
		if (arr[middle] == targetElement) {
			return middle;
		} else if (arr[middle] > targetElement) {
			right = middle - 1;
			return binarySearch(arr, targetElement, left, right);
		} else{
			left = middle + 1;
			return binarySearch(arr, targetElement, left, right);
		}

	}

}
