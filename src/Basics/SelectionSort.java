package basics;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a = {1,3,2,5,9,4,7,6};
		
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				if(a[j]<a[i]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));

	}

}
