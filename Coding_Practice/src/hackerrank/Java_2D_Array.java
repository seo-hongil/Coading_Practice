package hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class Java_2D_Array {

			// Hackerrank Java 2D Array 문제
			// 각각 6개의 row,column이 있고 전체를 돌면서, 
			// 1째줄 3칸, 둘째줄 가운데 1칸, 셋재줄 3칸으로 3,1,3 규칙으로 
			// 합을 구해서 제일 큰 값을 출력하는 2차원 배열.	
	
	public static void main(String[] args) throws IOException {
		 Scanner scan = new Scanner(System.in); // row,column에 6칸씩 숫자를 입력받고,
	        int [][] arr = new int[6][6];
	        for(int i=0;i<6; i++){
	            for(int j=0;j<6; j++){
	                arr[i][j]= scan.nextInt();
	            }
	        }
	            System.out.println(findMax(arr)); // 로직이 복잡해지니까 findMax 메소드를 만들어서 배열값을 보내준다.
	    }
	    public static int findMax(int[][] arr){ // 받은 배열값에 max를 Integer 클래스를 이용해 최솟값을 구하고,
	        int max = Integer.MIN_VALUE;		
	        for(int i=0; i<4; i++){				// 배열을 통해 각 자리의 합을 구해준다. 4번째부터는 3칸씩하면 6개니까 기준을 4로 둔다.
	            for(int j=0; j<4; j++){
	                int sum = findSum(arr,i,j); // 로직이 길어지니까 3,1,3 더하는 로직은 findSum으로 만들어준다.
	                max = Math.max(max,sum);    // 최댓값을 구하는 Math 클래스를 이용
	            }
	        }
	        return max;
	    }
	    public static int findSum(int[][] arr, int i, int j){ //각 자리에 1칸씩 늘려서 더하기.
	        int sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]
	                           +arr[i+1][j+1]+
	                  arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]; 
	        return sum;
	    }

}
