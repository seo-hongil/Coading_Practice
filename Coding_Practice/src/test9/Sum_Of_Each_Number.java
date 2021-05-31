package test9;

import java.util.Scanner;

public class Sum_Of_Each_Number {

	public static void main(String[] args) {
		/* 각 자릿수의 합
		 * 입력된 수의 각 자릿수 합을 구하시오.
		 * 
		 * 1242
		 * 
		 * 정답 : 9
		 * 
		 * Tag : 반복문(for,while)
		 * */
		
		
		// 아마 for문을 이용해서 10으로 나눠서 1의 자리를 배열에 넣고
		// 그 배열로 나온 값들을 for문을 통해서 다 더하면 될듯
	
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = 0;
		
		while(input>0) {
			result += input%10;
			input /= 10;
			
		}
		
		System.out.println("정답 : " + result);
	
	}

}
