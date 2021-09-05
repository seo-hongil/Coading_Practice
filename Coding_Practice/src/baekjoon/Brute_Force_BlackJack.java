package baekjoon;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/* 백준 2798번 문제 (브루트 포스)
 * 숫자 갯수를 입력하는 n과 블랙잭 m을 입력하고, n만큼 숫자를 입력한다.
 * 그 후 입력받은 n읙 숫자 중 3개를 조합해서 m의 값을 넘지 않고 최대한 가까운 수를 구해라.
 */

public class Brute_Force_BlackJack {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int c = scan.nextInt();
	    int max = scan.nextInt();
	    int [] count = new int[c];
	      
	    for(int i=0; i<c; i++){
	            count[i] = scan.nextInt();
	    }
	      
	     
	    List<Integer> hac = new ArrayList<>();
	        
	    for(int i=0; i<count.length-2; i++){
	         int r = 0;    
	         for(int j=i+1; j<count.length-1; j++){
	              for(int z=j+1; z<count.length; z++){
	                 r = count[i]+count[j]+count[z];
	                     if(max>=r){
	                         hac.add(r);
	                     }
	              }
	         }
	    }
	    int v = hac.get(0);
	    for(int i = 1; i< hac.size(); i++){
	        if(v<=hac.get(i)){
	            v=hac.get(i);
	        }
	    }
	       System.out.println(v);
	};
};