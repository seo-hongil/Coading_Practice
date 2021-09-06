package baekjoon;
import java.util.Scanner;

/* 백준 7568문제
 * n갯수만큼 인원을 입력하면 각 인원마다 몸무게 x, 키 y가 주어지고, 등수를 정한다.
 * 키와 몸무게가 둘다 커야 등수가 올라가고 하나라도 비슷하면 같은 등수가 된다. 그리고 같은 등수로 입력됐을 때
 * 다음 등수는 3이 아닌 인원만큼의 등수이다. 
 * ex)
 * 55 185
   58 183
   88 186     ->          2 2 1 2 5
   60 175
   46 155
 */

public class Brute_Forxe_Bulk {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      int [][] arr = new int[n][2];
	      
	      for(int i=0; i<n; i++){
	          arr[i][0] = scan.nextInt();
	          arr[i][1] = scan.nextInt();
	      }
	      
	      for(int i=0; i<n; i++){
	          int count = 1;
	          
	          for(int j=0; j<n; j++){
	              if(i==j){
	                  continue;
	              } else if(arr[i][0]<arr[j][0] && arr[i][1]<arr[j][1]){
	                    count++;     
	              }
	          }
	          System.out.print(count + " ");
	      }    
	     };
	};