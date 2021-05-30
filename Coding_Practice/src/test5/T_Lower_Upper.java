package test5;

public class T_Lower_Upper {

	public static void main(String[] args) {
		// 유튜브 선생님의 해답
		
		String input = "helloWorlD";
		char[]arr;
		arr=input.toCharArray();
		System.out.println(arr);
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] >= 'a' && arr[i]<='z') {
				arr[i] = (char)(arr[i] + 'A'-'a');
			}
			else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i]-('A'-'a')); 
			}
		}
		System.out.println(arr);
	}

}
