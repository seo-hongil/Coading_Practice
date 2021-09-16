package baekjoon;
import java.util.Scanner;

/* 백준 1065 한수 문제
 * 문제 : 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 *      N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 * EX)
 * 110 -> 99
 * 1   -> 1
 * 210 -> 105
 * 1000-> 144
 */

public class Function_Arithmetic_Sequence {
	 public static int han(int num) {
			int count = 0;
	 
			if (num < 100) {
				return num;
			
	        }else {
				count = 99;
				if(num == 1000) {
					num = 999;
				}
	            
				for (int i = 100; i <= num; i++) {
					int hun = i/100;
					int ten = (i/10)%10;
					int one = i%10;
	 
					if ((hun-ten)==(ten-one)){
						count++;
					}
				}
			}
	 
			return count;
		}
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			System.out.print(han(num));
			
		}
	 
		
	 
	}
