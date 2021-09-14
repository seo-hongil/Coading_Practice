package baekjoon;
import java.util.Scanner;

/* 백준 2941 크로아티아 알파벳 문제
 * 문제 : c=, c-. dz=, d-, lj, nj, s=, z= 크로아티아 알파벳을 이렇게 치환했다.
 *      예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
        dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 * EX) 
 * ljes=njak   ->  6
 * ddz=z=      ->  3
 * nljj        ->  3
 * 
 */

public class String_CroatiaAlphabet {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      String s = scan.nextLine();
	      int count = 0;
	        
	      for(int i=0; i<s.length(); i++){
	            char c = s.charAt(i);
	          
	          if(c=='c' && i< s.length()-1){
	              if(s.charAt(i+1)=='=' || s.charAt(i+1)=='-'){
	                  i++;
	                  
	              }
	          }
	          else if(c=='d' && i< s.length()-1){
	                  if(s.charAt(i+1)=='-'){
	                      i++;
	                  }else if(s.charAt(i+1)=='z' && i < s.length()-2){
	                      if(s.charAt(i+2)=='='){
	                          i+=2;
	                      } 
	                  }
	          }
	          else if((c=='l' || c=='n') && i < s.length()-1){
	                  if(s.charAt(i+1)=='j'){
	                      i++;
	                  }
	          }
	          else if((c=='s' || c=='z') && i < s.length()-1 ){
	               if(s.charAt(i+1)=='='){
	                   i++;
	               }
	          }
	          count++;
	      }
	         System.out.println(count);
	     };
	};
