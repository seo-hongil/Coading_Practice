package baekjoon;
import java.util.Scanner;

/* 백준 2675 문자열 반복문제
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 * EX)
 * 2
 * 3 ABC    -> AAABBBCCC
 * 5 /HTP   -> /////HHHHHTTTTTPPPPP
 */
public class String_Recursion {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      int a = scan.nextInt();
	        
	      for(int z=0; z<a; z++){
	          int n = scan.nextInt();
	          String s = scan.next();
	      
	          for(int i=0; i<s.length(); i++){       
	              for(int j=0; j<n; j++){
	                 System.out.print(s.charAt(i));       
	              }
	          }
	          System.out.println();
	     }
	     };
	};
