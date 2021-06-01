package test10;

public class T_Square {

	public static void main(String[] args) {
		// 유튜브 선생님 알고리즘
		
		int n=5;
		
		/*
		 * 	n = 3
		 * 	1 2 3
		 * 	4 5 6
		 * 	7 8 9 
		 */
		// int num = 1;
		
		for(int j = 0; j < n; j++) {
			for(int i = 0; i < n; i++) {
				System.out.printf("%4d", j*(n) + i + 1);
				//num++;
				//System.out.println(j*(n) + i + 1 + " ");
			}
			System.out.println();
		}
	}

}
