package test6;

import java.util.Scanner;

public class Greatest_Common_Factor {

	public static void main(String[] args) {
		/* 최대공약수 구하기
		 * 
		 * 12 18 
		 * 
		 * 정답 : 6
		 * 
		 * Tag : 반복문(for,while), if
		*/
		
		
		/*Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int input2 = scan.nextInt();
		int result = 1;
		for(int i = 1; i<input; i++) {
			if(input%i==0 && input2%i==0) {
				result = i;
			}
		};
		System.out.println("최대공약수는 :"+ result);
	*/
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int input2 =scan.nextInt();
		int big = 0;
		int small = 0;
		int result = 1;
		
		if(input>input2) {
			big=input;
			small=input2;
		}else {
			big=input2;
			small=input;
		}
		
		for(int i=1; i<=small; i++) {
			if(big%i==0 && small%i==0) {
				result=i;
			}
		}
		System.out.println("최대공약수는 : "+result);
	}

}
