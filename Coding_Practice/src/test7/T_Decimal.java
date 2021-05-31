package test7;

public class T_Decimal {

	public static void main(String[] args) {
		// 유튜브 선생님 알고리즘
		
		int num = 20;
		
		boolean isPrimeNumber = true; // flag 이용
		
		for(int i = 2; i <= num-1; i++) { //num-1도 맞지만, num/2를 해도 항상 자기자신의 숫자의 반으로 나누면 안떨어진다. 그래서 num/2를 해도 된다.
			if(num % i == 0) {
				//primeNumber X
				isPrimeNumber = false;
			}
		}
		if(isPrimeNumber) {
			System.out.println(num+"은 소수입니다.");
		}
		else {
			System.out.println(num+"은 소수가 아닙니다.");
		}
	}

}
