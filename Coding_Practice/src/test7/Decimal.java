package test7;

import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		/* 소수 판별
		 *
		 * 13
		 * 
		 * 정답 : 13은 소수입니다.
		 * 
		 * Tag : 반복문(for, while), if
		*/
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int result = 0;
		for(int i=1; i<=input; i++ ) {
			if(input%i==0) {
				result++;
			}
		}
		if(result<=2) {
			System.out.println(input+"은 소수입니다.");
		}else if(result>2){
			System.out.println(input+"은 소수가 아닙니다.");
		}
	}

}
