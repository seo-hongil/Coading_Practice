package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

/* 백준 11651 문제
 * 2차원 평면 위의 점 N개가 주어진다. 이번엔 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오
 * ex)
 * 0 4            1 -1 
   1 2            1  2
   1-1     ->     2  2
   2 2            3  3
   3 3            0  4
 */

public class Coordinate_To_Sort2 {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        int [][] arr = new int[n][2];
	        
	        for(int i =0; i<n; i++){
	            arr[i][0] = scan.nextInt();
	            arr[i][1] = scan.nextInt();
	        }
	        
	        Arrays.sort(arr, (o1, o2) -> {
	            if(o1[1] == o2[1]){
	                return o1[0]-o2[0];
	            }else{
	                return o1[1]-o2[1];
	            }
	        });
	        for(int i =0; i<n; i++){
	            System.out.println(arr[i][0]+" "+arr[i][1]);
	        }
	     };
	};