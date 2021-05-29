package test2;

import java.util.Scanner;

public class Step2_Fibonacci_numbers {

	public static void main(String[] args) {
		/* - 피보나치 수열을 출력해라
		   - An - An-1 + An-2
		   - 1 1 2 3 5 8 13 21 34....

		 */				
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int arr[] = new int[100];
		arr[0]=1;
		arr[1]=1;	
		
		for(int i=2;i<n;i++ ) {
				
			arr[i]= arr[i-1] + arr[i-2];
		};
		
		for(int i=0; i<n; i++ ) {
			System.out.print(arr[i]+" ");
		};
				
	}
}
