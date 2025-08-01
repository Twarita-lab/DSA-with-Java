package basics;

import java.util.Arrays;

public class MergeSort {

	static int middle;
	
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 5, 8, 9, 0, 4,7 };

		System.out.println(Arrays.toString(mergeSort(arr)));

	}

	private static int[] mergeSort(int[] arr) {
		if (arr.length < 2) {
			return arr;
		} else {
			middle = arr.length / 2;
			int[] left = new int[middle];
			int[] right = new int[arr.length - middle];
			
			for(int i=0; i<middle; i++) {
				left[i]= arr[i];
			}
			for(int i=middle; i<arr.length; i++) {
				right[i-middle]= arr[i];
			}
			mergeSort(left);
			mergeSort(right);
			merge(left, right, arr);

		}
		return arr;

	}

	private static int[] merge(int[] left, int[] right, int[] arr) {
		int i=0, j=0, k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}
			else {
				arr[k++]=right[j++];
			}
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		return arr;
	}

}
