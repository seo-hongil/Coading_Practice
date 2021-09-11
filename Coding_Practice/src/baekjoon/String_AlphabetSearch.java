package baekjoon;
import java.util.Scanner;

/* 백준 10809 알파벳 찾기 문제
 * 문제 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
 *      포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * EX)
 * baekjoon -> 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
 * 
 *      이 문제는 a~z 까지를 배열로 두고 charAt으로 문자의 아스키코드값으로 불러와서 -a로 빼주고 문자의 차이만큼 배열에 넣는다.
 * */

public class String_AlphabetSearch {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	      int [] n = new int[26];
	      
	      for(int i=0; i<n.length; i++){
	          n[i] = -1;
	      }
	      
	      String s = scan.nextLine();
	      
	      for(int i=0; i<s.length(); i++){
	          char c = s.charAt(i);
	          
	          if(n[c-'a']==-1){
	              n[c-'a']=i;
	          }
	      }
	      
	      for(int i=0; i<n.length; i++){
	         System.out.println(n[i]);
	      }
	     };
	};
