package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Java_Primality_Test {

	public static void main(String[] args) throws IOException {
		// Hackerrank의 Java Primality Test 문제
		// 소수인지 아닌지 소수판별하는 알고리즘
		// 아래 주석처리를 해도 결과는 같게 나오는데, Hackerrank에서 원하는 답이 아니라 구글링의 도움으로 다른 답을 출력
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		        String n = bufferedReader.readLine();
/*		        int so = Integer.parseInt(n);
		        int i = 2;
		        int a = 0;
		        int b = 0;
		        while(i<so/2){
		                if(so/i==0){
		                    a=0;
		                }else{
		                    b++;
		                }
		                i++;
		        }
		            if(b==0){
		                System.out.println("not prime");
		            }else{
		                System.out.println("prime");
		            }
*/
		        BigInteger bi = new BigInteger(n); // 수가 큰값일 경우에도 분석해서 오류가 나기 때문에 BigInteger 클래스로 사용
		        
		        if(bi.isProbablePrime(1)){		// 소수판변을 위한 BigInteger의 isProbablePrime를 사용 
		            System.out.println("prime");
		        }else{
		            System.out.println("not prime");
		        }
		        
		        bufferedReader.close();
	}

}
