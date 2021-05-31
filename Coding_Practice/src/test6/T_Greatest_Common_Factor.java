package test6;

public class T_Greatest_Common_Factor {

	public static void main(String[] args) {
		// 유튜브 선생님의 알고리즘 코딩
		int num1,num2;
		num1=12;
		num2=18;
		
		int small;
		int big;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; //최대공약수
		
		for(int i = 1 ; i <= small ; i++) {
			if(big % i == 0 && small % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
