package hackerrank;

import java.util.Scanner;

public class Java_Subarray {
	// Hackerrank Java Subarray 문제
	// 몇개를 입력할 건지 숫자로 먼저 개수를 입력받고,
	// 양수,음수 순서로 입력한다.
	// 그리고 붙어있는 숫자끼리 더한다음 음수인 것만 개수를 구한다.
	// {1,-2,3,-4,5} ->{1,-2,-4}는 떨어져있으니 x
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int[] a = new int[n];
	        int count = 0; // 개수
	        int sum=0; //음수를 판별
	        
	        for(int i=0;i<n;i++){ //숫자를 입력받는다.
	           a[i] = scan.nextInt();
	        }
	        
	        for(int i=0;i<n;i++){ //배열 한칸씩 붙어서 더해지는 값을 구하는 로직
	          for(int j=i;j<n;j++){
	            sum +=a[j];
	            
	            if(sum<0){
	                count++;
	            }
	          }
	        sum=0;  
	        }
	        System.out.println(count);

	}

}
