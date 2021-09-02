package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 10989 문제
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 단, 중복되는 수가 있어도 차례대로 입력  
 */

public class Number_Sorting3 {
	 public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int [] arr = new int[10001];
	        
	        for(int i =0; i<n; i++){
	            arr[Integer.parseInt(br.readLine())]++;    
	        }
	        
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i =1; i<arr.length; i++){
	            while(arr[i]>0){
	                sb.append(i).append('\n');
	                arr[i]--;
	            }
	        }
	        System.out.println(sb);
	        
	     };
	};
