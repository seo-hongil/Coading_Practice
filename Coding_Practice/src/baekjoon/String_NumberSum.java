package baekjoon;
import java.util.Scanner;

/* 백준 11720 숫자의 합 문제
 * 문제 : N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * EX) 
 * 5                  25
 * 54321 -> 15        7000000000000000000000000   -> 7
 *  
 */
public class String_NumberSum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    String s = scan.next();
	    int sum = 0;
	        
	    for(int i=0; i<n; i++){
	      sum += s.charAt(i)-48; // charAt은 해당 문자의 아스키코드값으로 반환해주는데,
	      						 // 문자에서 숫자로 바꿀 때는 48이 문자 0이니까 -48 or -0 을 하면 입력한(우리가 원하는 값)으로 출력가능
	    }                        // 만약 숫자에서 문자로 바꾸려면 +48하면된다.
	       System.out.println(sum);
	};
};