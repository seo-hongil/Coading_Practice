package test5;

public class Lower_Upper {

	public static void main(String[] args) {
		// 대문자를 소문자로, 소문자를 대문자로 변환하시오
		// helloWorlD
		// 정답 : HELLOwORLd
		// tag : 배열 , for, if
		
		String str  = "helloWorlD";
		char ran[]=new char[10];
		
		ran=str.toCharArray();		
		
		for(int i=0; i<ran.length; i++) {
			if(ran[i] >= 'a' && ran[i]<='z') {
				ran[i] = (char)(ran[i] + 'A'-'a');
			
			}else if(ran[i]>='A' && ran[i]<='Z') {
				ran[i] = (char)(ran[i]-'A'-'a'); //아래 for문으로 이용해서 출력하려면 'A'-'a'를 ()안으로 넣어서 사용해야한다. 그래야 출력이 깨지지 않음.
			}
		}
		//for(int i=0; i<ran.length; i++) {
			System.out.print(ran);//for문으로 이용해 ran[i]	
		//}
		
	}

}
