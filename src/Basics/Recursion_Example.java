package Basics;

public class Recursion_Example {
	static int[] arr = {10,3,4,45,5,5,50};
	static int value = 6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(suomOfArray(arr.length-1));
			System.out.println(factorial(value));
			System.out.println(fibonachi(value));
			
			for(int i=0; i<=value; i++) {
				System.out.println(fibonachi(i));
			}
		

	};

	private static int fibonachi(int x) {
		// TODO Auto-generated method stub
		//0,1=1 =>series of 1
		//1+1=2 => series of 2
		//2+2 =4
		if(x==0 || x==1) return x;
		else 
			return fibonachi(x-2)+fibonachi(x-1); // 1+f(2)=>1+f(1)=>1
	}

	private static int factorial(int x) {
		// n=n*(n-1)*(n-2)...1
		if(x==1) return 1;
		else return x*factorial(x-1);
		
		
	}

	private static int suomOfArray(int n) {
		if(n==0) {
			return arr[n];
		}
		else {
			return arr[n]+suomOfArray(n-1);
			
		}
		
	}

	
}
