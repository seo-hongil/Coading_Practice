package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

/* 백준 10814 문제
 * 온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
 * ex)
 * 3
   21 Junkyu          20 Sunyoung
   21 Dohyun  ->      21 Junkyu
   20 Sunyoung        21 Dohyun
 */
public class Age_sort {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        String[][] arr = new String[n][2];
	        
	        for(int i=0; i<n; i++){
	            arr[i][0] = scan.next();
	            arr[i][1] = scan.next();
	        }
	        Arrays.sort(arr, (o1, o2) ->{ 
	                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
	        });
	        
	        for(int i=0; i<n; i++){
	            System.out.println(arr[i][0]+" "+arr[i][1]);
	        }
	     };
	};