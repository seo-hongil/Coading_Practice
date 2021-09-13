package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 백준 2908 상수 문제 
 * 문제 : 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
 *      따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
                  두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
   EX)
   734 893       ->   437
   221 231       ->   132
   839 237       ->   938
 */
public class String_Constant {
    public static void main(String[] args) throws IOException { 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    
    	int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
    	int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        
    	System.out.print(a>b? a:b);
       
     };
};