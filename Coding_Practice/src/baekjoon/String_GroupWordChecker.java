package baekjoon;
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;

/* 백준 1316 그룹 단어 체커 문제
 * 문제 : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 *      aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다. 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 * EX) 
	3
	happy
	new           ->   3
	year
	
	4
	aba
	abab          ->   1
	abcabc
	a
 * */
public class String_GroupWordChecker {
	public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      int n = Integer.parseInt(br.readLine());
	      int count = n; 
	        
	      for(int i=0; i<n; i++){
	    	  String s = br.readLine();
	          boolean [] check = new boolean[26];
	          int now = 0;  
	            
	            for(int j=0; j<s.length(); j++){ 
	            	int c =  s.charAt(j);
	                 
	                if(now != c){
	                     if(check[c-'a']==false){
	                         check[c-'a']=true;
	                         now = c;
	                     }else{
	                    	 count--;
	                         break;
	                     }
	                }else{
	                     continue;
	                }
	             }            
	     }
	      System.out.println(count);
	};
};