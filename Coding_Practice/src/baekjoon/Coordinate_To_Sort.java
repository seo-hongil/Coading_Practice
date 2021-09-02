package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 백준 11650 문제
 * 2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오
 * ex)
 * 3 4            1 -1 
   1 1            1  1
   1-1     ->     2  2
   2 2            3  3
   3 3            3  4
 */

public class Coordinate_To_Sort {
	 public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int n = Integer.parseInt(br.readLine());
	        int[][] arr = new int[n][2];
	        StringTokenizer st; 
	        for(int i =0; i<n; i++){
	            st = new StringTokenizer(br.readLine());
	            arr[i][0] = Integer.parseInt(st.nextToken());
	            arr[i][1] = Integer.parseInt(st.nextToken());
	        }
	      Arrays.sort(arr, (int[] o1,int[] o2) -> {
	          if(o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
	      });
	        
	        for(int i=0; i<n; i++){
	            System.out.println(arr[i][0]+ " " + arr[i][1]);   
	        }
	     };
	};