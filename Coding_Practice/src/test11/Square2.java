package test11;

public class Square2 {

	public static void main(String[] args) {
		// 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출려되는 
		// 숫자 사각형을 출력하시오.
		/*
		 * - 4
		 * 
		 * - 정답 : 1 2 3 4
		 *        8 7 6 5
		 *        9 10 11 12
		 *        16 15 14 13
		 *      
		 * - Tag : 중첩 반복문(for or while), 조건문(if), 배열
		 * */
		
		int n = 4;
		int list[][] = new int[10][10];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i%2==1) {
					list[i][n-j-1] = i*n+j+1;
				}else { 
					list[i][j] = i*n+j+1;
				}		
			}
		}	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
			System.out.printf("%4d",list[i][j]);
			}
			System.out.println();
		}	
	}
}
