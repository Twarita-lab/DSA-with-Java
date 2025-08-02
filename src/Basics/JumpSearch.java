package basics;

public class JumpSearch {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8};

		System.out.println(jumpSearchWithWhile(arr, 6));

	}

	private static int jumpSearchWithWhile(int[] arr, int target) {

		int start = 0;
		int sqrt = (int) Math.sqrt(arr.length);

		int last = sqrt - 1;
		while (last < arr.length) {
			if (arr[last] == target)
				return last;
			else if (arr[last] < target) {
				start = last + 1;
				last = last + sqrt;
			} else {
				for (int i = start; i <= last; i++) {
					if (arr[i] == target)
						return i;
				}
			}
		}
		return -1;

	}

}
