package hackerrank;
import java.io.*;
import java.util.*;

public class Java_String_Tokens {
	public static void main(String[] args) {
		// hackerrank의 Java String Tokens 문제
		// 문제 : 문자열을 입력 후 각각의 공백, 특수문자로 구분지어 한줄에 하나씩 출력,
		//       첫번째는 나누어진 문자열의 개수를 출력.
		//       string의 길이는 1<=s<=40000이다.
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine().trim(); // 공백제거
	        // Write your code here.
	        if (s.length()==0 || s.length()>400000){ //길이를 제한해 이 범위 안에 없으면 0을 출력;
	            System.out.println(0);
	            return;
	        }
	        String[] a = s.split("[!,?._'@\\s]+"); // split()메소드를 이용해 특수문자와 공백을 기준으로 나눠준다. 
	                                               // +를 붙여서 1번이상 진행하게 한다.(정규식) 
	        System.out.println(a.length);  // 개수를 출력
	        
	        for(int i = 0; i<a.length; i++){
	            System.out.println(a[i]);  // 문자열을 출력
	        }    
	        scan.close(); 
	}

}
