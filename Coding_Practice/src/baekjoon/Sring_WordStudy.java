package baekjoon;
import java.util.Scanner;

/* 백준 1157 단어공부 문제
 * 문제 : 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 *      단, 대문자와 소문자를 구분하지 않는다.
 *  EX)
 *  Mississipi     ->      ?
 *  zZa            ->      Z
 *  baaa           ->      A
 */

public class Sring_WordStudy {
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     int[] a = new int[26];
	     String s = scan.next();
	 
	     for (int i = 0; i < s.length(); i++){
	        if ('a'<=s.charAt(i) && s.charAt(i)<='z'){
	            a[s.charAt(i)-'a']++;
		    }else {
			    a[s.charAt(i)-'A']++;
		    }
	    }
	  
	    int max = 0;
	    char ch='?';
	 
	    for (int i=0; i <a.length; i++) {
	    	if (a[i] > max) {
		    	max = a[i];
			    ch = (char)(i+65);
		
	        }else if(a[i] == max) {
			    ch = '?';
		    }
	    }
	         System.out.println(ch);
	     };
	};
