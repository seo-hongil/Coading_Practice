package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_List {
	/* Hackerrank Java List 문제
	 * 숫자를 입력할 횟수를 입력하고, 횟수에 따라 숫자를 list에 넣는다.
	 * 그리고 n번의 수정할 횟수를 다시 입력하고, Insert or Delete 인지에 따라
	 * 수정,삭제되는 기능을 구현
	*/
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     int n = scan.nextInt();
	     ArrayList<Integer> list = new ArrayList<>();
	     
	     for(int i=0; i<n; i++){	// 입력받아서 list에 넣는다.
	    	 list.add(scan.nextInt());
	     }
	     
	     int r = scan.nextInt();
	     for(int i=0; i<r; i++){	// 문자열을 받아서 insert or delete 인지에 따라 다른 로직 구현
	    	 String x = scan.next();
	         if(x.equals("Insert")){
	        	 int a = scan.nextInt();
	             int b = scan.nextInt();
	             list.add(a, b);
	             
	         }else if(x.equals("Delete")){
	        	 int c = scan.nextInt();
	             list.remove(c);
	         }
	   
	     }

	        for (Integer num : list) {		// for each문으로 출력
	            System.out.print(num + " ");
	        }

	}

}
