package baekjoon;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 백준 1152 단어의 개수 문제 
 * 문제 : 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 *       단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 * EX)
 * The Curious Case of Benjamin Button   ->    6
 *  The first character is a blank       ->    6
 *  The last character is a blank        ->    6
 */

public class String_WordCount {
	   public static void main(String[] args) throws IOException{
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      
		      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		      
		      System.out.println(st.countTokens());
		     };
		};
