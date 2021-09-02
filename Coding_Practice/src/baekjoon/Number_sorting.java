package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 백준 2750 문제
//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

public class Number_sorting {
	    public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
	      int n = Integer.parseInt(br.readLine());
	      int[] arr = new int [n];
	        
	      for(int i=0; i<n; i++){
	         arr[i] =  Integer.parseInt(br.readLine());
	      }
	                
	        for(int i = 0; i<arr.length-1; i++){
	            for(int j=i+1; j<arr.length; j++){
	                if(arr[i]>arr[j]){
	                    int c = arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=c;
	                    
	                }
	            }
	        }
	        for(int result : arr){
	            System.out.println(result);
	        }
	     };
	};