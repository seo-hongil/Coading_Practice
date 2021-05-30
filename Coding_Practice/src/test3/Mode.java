package test3;

import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		/* 최빈수 구하기
		 * - 가장 많이 출현한 수를 출력하시오.
		 * - 1 2 2 3 1 4 2 2 4 3 5 3 21
		 * - 정답 : 2(5회)
		 * - 배열, for 
		 * */
	
		Scanner scan = new Scanner(System.in);
		int num[] = new int[10];
		
		for(int i=0; i<10; i++) {
			num[i] = scan.nextInt();	
		}
		// 입력한 숫자를 배열에 넣었고,
		
		// 이제 입력한 숫자를 돌면서 최빈수 인지 아닌지 확인해야함.
		int count[]=new int[10];
		
		for(int i=0; i<10; i++) {
			count[num[i]]++;
		}
		// 해당되는 숫자가 오면 count[]에 해당되는 숫자 갯수 증가
		
		int set = 0; // 최빈수
		int set2 = 0; //최빈수가 나온 횟수
		
		for(int i=0; i<10; i++) {
			if(count[i]>set) {
			set2 = count[i];
			set = i;
			}
			// count[] 돌면서 해당되는 숫자가 최빈수이면 set2에 넣고 그 i를 최빈수로 넣기			
		}
		System.out.println("최빈수 : "+set+"("+set2+"회)");
	}

}
