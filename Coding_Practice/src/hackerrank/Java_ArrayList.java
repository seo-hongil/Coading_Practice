package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

		// Hackerrank Java ArrayList 문제
		//arraylist를 이용해서 값을 담고, index 위치를 입력하면 해당값이 출력하라.

public class Java_ArrayList {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // 이차원 배열을 위해 제너릭안에 arraylist를 다시 선언
	       
	         
	        for(int i = 0; i<n; i++){		// n으로 입력한 숫자만큼 반복
	            int x = scan.nextInt();		// list안의 index 당 몇번 반복할건지 입력
	            ArrayList<Integer> list2 = new ArrayList<>(); //필드에 선언하면 값이 중첩되니까 2차반복문이 끝날 때마다 리셋되게 선언
	            for(int j=0; j<x; j++){
	                list2.add(scan.nextInt());
	            }
	            list.add(list2);
	        }
	        
	        int q = scan.nextInt(); // 몇번 출력할건지 입력
	        
	        for(int i=0; i<q; i++){
	            int a = scan.nextInt();
	            int b = scan.nextInt();
	           try{									//try~catch 사용
	            System.out.println(list.get(a-1).get(b-1));
	            }catch(IndexOutOfBoundsException e){ //인덱스안에서 값이 없으면 출력하게 exception으로 처리
	                System.out.println("ERROR!");
	            }
	        }

	}

}
