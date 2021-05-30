package test4;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		// 10진수를 2진수로 변환하기
		// 19
		// 정답 : 10011
		// tag : 배열, 반복문(while, for)
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
	    int count[]=new int[10]; // 나머지(2진수) 담을 배열
		int mok = num; // 입력된 값을 목으로 두고 나눠서 담을 변수
	    int i = 0;  // 반복할 변수
	    
	    // 풀이과정을 40% 봐버림....
	    while(mok>0) {
	    	count[i]=mok%2;
	    	mok/=2;
	    	i++;   	
	    }
	    for(i--; i>=0; i-- ) {
	    	// i를 -- or ++ 로 적용하든 상관 x 어차피 들어있는 값은 같아서
	    	System.out.print(count[i]);
	    }
		
			
	}

}
