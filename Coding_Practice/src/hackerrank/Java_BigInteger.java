package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_BigInteger {

	public static void main(String[] args) {
		// 숫자 2개를 입력받고(숫자의 크기는 클 수 있으니 BigInteger로 받음)
		// 첫번째 출력에는 a + b, 두번째 는 a * b로 출력
		  Scanner scan = new Scanner(System.in);
	      BigInteger r = new BigInteger(scan.next());
	      BigInteger r2 = new BigInteger(scan.next());
	        
	      System.out.println(r.add(r2));      //덧셈
	      System.out.println(r.multiply(r2)); //곱셈
	   // 뺄셈은 .subtract(), 나눗셈은 .divide(), 나머지는 .remainder()
	        
	}

}
