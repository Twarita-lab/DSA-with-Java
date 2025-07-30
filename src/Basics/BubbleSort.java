package basics;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a = {1,10, 3,4,2,9,6,3,0};
		
		for(int i=0; i<a.length; i++) {
			for(int j=1; j<a.length-i; j++) {
				if(a[j]<a[j-1]) {
					int temp = a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(a));
		

	}

}
