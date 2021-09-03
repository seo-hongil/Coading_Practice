package baekjoon;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

/* 백준 18870 문제
 * 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
   Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.
   X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
   
   ex)
      5                 
      2 4 -10 4 -9      ->    2 3 0 3 1
      
      6
      1000 999 1000 999 1000 999   -> 1 0 1 0 1 0
 */

public class Coodinate_Compression {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();    
        }
        
        int[] ar = arr.clone();
        Arrays.sort(ar);
        
        int count =0;
        
        Map<Integer, Integer> m = new HashMap<>(); //HashMap을 사용해서 key에 해당 값이 없으면 증가
        for(int r : ar){
            if(!m.containsKey(r)){
                m.put(r, count);
                count++;
            }
        }
        StringBuilder sb = new StringBuilder();
        
        for(int result : arr){
            sb.append(m.get(result)).append(' ');
        }
        
            System.out.print(sb);
     };
};

