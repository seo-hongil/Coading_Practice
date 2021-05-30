package test4;

public class T_Decimal_to_Binary {

	public static void main(String[] args) {
		// 유튜브 선생님의 10진수를 2진수로 변환하기
		
		int inputNum = 19;
		int bin[]= new int[100];
		
		/*
		 * 19 / 2   9 ... 1
		 *  9 / 2   4 ... 1
		 *  4 / 2   2 ... 0
		 *  2 / 2   1 ... 0
		 *  1 / 2   0 ... 1 
		 *  
		 *  010011 => 19
		 */
		
		
		int i = 0;
		int mok = inputNum;
		
		while(mok>0) {
			bin[i]=mok%2;
			mok /= 2;
			i++;
		}
		
		i--;
		for(; i>=0; i--) {
			System.out.print(bin[i]);
		}
	}

}
