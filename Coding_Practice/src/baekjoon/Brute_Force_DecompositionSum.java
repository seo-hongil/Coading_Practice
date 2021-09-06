package baekjoon;
import java.util.Scanner;

/* 백준 2231 문제
 * 자연수 n이 주어지면 n의 분해합은 n을 이루는 각 자리수의 합이다.
 * n을 입력하면 n의 제일 작은 분해합인 생성자를 구하라
 * ex) 216 -> 198(198+1+9+8)
 * */

public class Brute_Force_DecompositionSum {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      int result = 0;
	        
	      for(int i=1; i<n; i++){
	          int num = i;
	          int sum = num;
	          
	          while(num!=0){
	             sum += num%10;
	             num /= 10; 
	          }
	        
	          if(sum==n){
	              result=i;
	              break;
	          }
	      }
	        System.out.println(result);
	     };
	};
