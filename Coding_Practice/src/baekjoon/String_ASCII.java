package baekjoon;
import java.io.InputStream;
import java.io.IOException;

/* 백준 11654 아스키코드 문제 
 * 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 * EX)  A -> 65 , C -> 67, 9 -> 57
 */

public class String_ASCII {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = System.in;
        int n =inputStream.read(); //이렇게 읽어들이면 아스키코드 단위로 읽어서 해당되는 int값으로 반환

         System.out.println(n);
     };
};