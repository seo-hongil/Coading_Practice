package baekjoon;
import java.util.Scanner;

/* 백준 1018번 체스판 다시 칠하기
 * 문제 : M*N 크기의 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.
 *      지민이는 이 보드를 잘라서 8*8 크기의 체스판으로 만들려고 한다.
 * 		체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다. 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다. 
 *      (이게 중요)따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다. 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.

 * 출력 : 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.
 * ex) 
   8 8
   WBWBWBWB
   BWBWBWBW
   WBWBWBWB
   BWBBBWBW
   WBWBWBWB      ->   1
   BWBWBWBW
   WBWBWBWB
   BWBWBWBW
 */
public class Brute_Force_Chess_Repaint {
		 public static boolean[][] arr; //흰색, 검은색을 boolean으로 담을 배열
		 public static int min = 64;    //8*8 크기
		    
		 public static void find(int x, int y){ //8*8로 찾아야하니까 그 이상이 된다면 첫째줄,중간, 끝의 각 첫번째,끝까지의 8*8 크기만큼 정해서 찾을 메소드
			 int end_x = x+8;
		     int end_y = y+8;
		     int count = 0;
		        
		     boolean tf = arr[x][y];
		        
		     for(int i=x; i<end_x; i++){
		         for(int j=y; j<end_y; j++){
		             if(arr[i][j] != tf){
		                 count++;
		             }
		             tf = !tf; //b이면 w로, w면 b으로 해야하니까 true면 false로, false면 true로
		         }
		         tf = !tf;  //줄이 끝나면 다시 바꿔야 하니까 다시 바꿔준다.
		     }
		    count = Math.min(count,64-count); //최솟값
		    min = Math.min(min,count);		  //그리고 기존 선언해둔 min와 비교해서 최솟값 구하기.
		 }
		    
		 public static void main(String[] args) {
			 Scanner scan = new Scanner(System.in);
		     int a = scan.nextInt();
		     int b = scan.nextInt();
		     arr = new boolean[a][b];
		      
		     scan.nextLine();
		        
		     for(int i =0; i<a; i++){
		    	 String st = scan.nextLine().trim();
		          
		    	 for(int j=0; j<b; j++){
		    		 if(st.charAt(j)=='W'){
		    			 arr[i][j]= true;        
		             }else{
		                 arr[i][j]= false;
		             }              
		         }
		     }
		     int row = a-7;
		     int col = b-7;
		      
		     for(int i = 0; i<row; i++){
		    	 for(int j=0; j<col; j++){
		    		 find(i,j);
		         }
		     }
		     	System.out.println(min);
		     };
		};