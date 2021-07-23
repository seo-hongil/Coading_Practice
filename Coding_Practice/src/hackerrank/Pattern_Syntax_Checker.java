package hackerrank;
import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker {
	public static void main(String[] args) {
		// Hackerrank의 Pattern Syntax Checker 문제 
		// 몇번의 테스트를 할건데 횟수를 입력받고,
		// 입력받은 정규표현식이 적합하면 Valid를 출력, 아니면 Invalid를 출력
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
		    //Write your code
		    try { //try~catch로 정규표현식 패턴이 적합하지 않으면 오류가 나고 그걸 예외처리로 잡아 출력
		    	Pattern.compile(pattern);   // Pattern 클래스의 compile 메소드로 입력받는 pattern으로 정규표현식 패턴을 만든다.
		        	System.out.println("Valid"); 
		    } catch (PatternSyntaxException e) {
		            System.out.println("Invalid");
		    }
		   
		    testCases--; //3을 입력받았으면 횟수를 줄여야하니까 -1씩 추가.
		}
	}
		            
}

