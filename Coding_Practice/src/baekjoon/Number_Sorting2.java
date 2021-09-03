package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 2751 문제
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 * 단 시간제한이 2초 
*/

public class Number_Sorting2 {
	    public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        boolean [] arr = new boolean[2000001];
	        
	        for(int i = 0; i<n; i++){ //카운팅정렬을 사용하기 위해 boolean 타입으로 받아 index를 증가.
	            arr[Integer.parseInt(br.readLine())+1000000] = true;  
	        }
	        StringBuilder sb = new StringBuilder();
	        for(int i =0; i<arr.length; i++){
	            if(arr[i]){
	                sb.append(i-1000000).append('\n');
	            }
	        }
	        System.out.println(sb);
	    };
	};
