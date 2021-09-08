package baekjoon;
import java.util.Scanner;

/* 백준 10872번 팩토리얼
 * 문제 : 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * ex)
 * 10 ->3628800
 * 0 -> 1
 */
public class Recursion_Factorial {
	
	public static int re(int r){    
        
		if(r<=1){
            return 1;    
        }
        
        return r * re(r-1);
        
}
	
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
		      int n = scan.nextInt();
		      int a = re(n);
		         System.out.println(a);
		     };
		};
