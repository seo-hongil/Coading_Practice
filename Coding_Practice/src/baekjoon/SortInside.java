package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 백준 1427 문제
 * 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 * ex) 2143 -> 4321
 */

public class SortInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = n;
        int [] arr = new int[10];
        
        while(c>0){
            arr[c%10]++;
            c /= 10;
        }
           
        for(int i=9; i>=0; i--){
            while(arr[i]>0){
                System.out.print(i);
                arr[i]--;
            }
        }
     };
};