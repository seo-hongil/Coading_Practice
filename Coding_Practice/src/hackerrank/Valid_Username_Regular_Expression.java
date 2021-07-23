package hackerrank;

import java.util.Scanner;
		//Hackerrank의 Valid Username Regular Expression문제
		//8문자~30문자 사이의 id를 입력받는데 첫번째로 숫자가 오면안되고,
		//특수문자는 _만 가능한 정규식을 사용해서 출력

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "[a-zA-Z](\\w){7,29}"; 
    // [a-zA-Z] 첫문자는 영문자만 와야한다.
    // \는 다음에 오는게 특수문자면 그의미대로 표시, 문자가 오면 특수문자로 인식
    // \다음에 \w는 알파벳 + 숫자 + _ 중의 한 문자임을 의미
    // 7다음인 8부터 29인다음 30까지의 문자 입력.
   
}

public class Valid_Username_Regular_Expression {
	 private static final Scanner scan = new Scanner(System.in);
	    
	public static void main(String[] args) {
				
		 int n = Integer.parseInt(scan.nextLine());
	        while (n-- != 0) {
	            String userName = scan.nextLine();

	            if (userName.matches(UsernameValidator.regularExpression)) {
	                System.out.println("Valid");
	            } else {
	                System.out.println("Invalid");
	            }           
	        }
	}

}
