package test8;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/* 팩토리얼
		 * 입력된 수의 팩토리얼을 구하시고
		 * 
		 * 5
		 * 
		 * 정답 : 120
		 * 
		 * Tag : 반복문(for,while)
		*/
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = 1;
		for(int i= 1; i<=input; i++) {
			result *= i;
		}
		System.out.println("정답 : " + result);
	}

}
