package test10;

import java.util.ArrayList;
import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// 연속된 출력되는 숫자 사각형을 출력
		/*
		 *  - 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는
		 *    숫자 사각형을 출력하시오
		 *    
		 *  - 4
		 *  
		 *  - 정답 :  1 2 3 4
		 *          5 6 7 8
		 *          9 10 11 12
		 *          13 14 15 16
		 *
		 * - Tag : 중첩 반복문(for or while)
		 * */
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for(int i= 0; i<input; i++) {
			for(int j=0; j<input; j++) {
				System.out.printf("%4d",i*input+j+1);
			}
			System.out.println();
		}
	}
}
