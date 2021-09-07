package baekjoon;
import java.util.Scanner;

/* 백준 1436번 문제 영화감독 숌
 * 영화 시리지를 만들기 위해 영화제목 끝에 6이 최소 3개이상 들어가야한다. 시작은 666이다.
 * 입력에 몇번 째 시리즈 인지 입력하면 제목 끝에 숫자를 출력하라.
 * 
 * ex)
 * 2  -> 1666
 */

public class Brute_Force_Movie_Director {
	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        int n = scan.nextInt();
		        int count = 1;
		        int num = 666;

		            while(n!=count){
		                num++;
		                if(Integer.toString(num).contains("666")){
		                    count++;
		                }
		            }      
		         System.out.println(num);
		    };
		};
