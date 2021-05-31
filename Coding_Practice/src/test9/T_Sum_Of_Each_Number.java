package test9;

public class T_Sum_Of_Each_Number {

	public static void main(String[] args) {
		// 유튜브 선생님의 알고리즘
		
		int inputNum = 1242;
		int accSum = 0;
		
		// 1232 => 123 => 12 => 1    => 0
		// 2         3     2    1 => 8
		
		while(inputNum > 0) {
			accSum += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(accSum);
	}	

}
