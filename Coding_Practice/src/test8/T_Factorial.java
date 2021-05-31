package test8;

public class T_Factorial {

	public static void main(String[] args) {
		// 유튜브 선생님 알고리즘
		
		int inputNum = 5;
		int accNum = 1; // 값을 넣어놓는 곳
		// 5! = 5 * 4 * 3 * 2 * 1
		// 7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
		 for ( int i = 1; i <= inputNum; i++) {
			accNum *= i; // accNum = accNum * i;
		}
		 
		System.out.println(accNum);
		
		accNum = 1;
		for (int i = inputNum; i >= 1; i--) {
			accNum *= i; // accNum = accNum * i;
		}
		
		System.out.println(accNum);
	}

}
