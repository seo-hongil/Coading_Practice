package hackerrank;

import java.util.Scanner;

public class Solve_Me_First {
		/* Hackerrank Solve Me First 문제
		 값을 각각 입력하면 더해서 출력
		*/
		
		 static int solveMeFirst(int a, int b) {
		      // Hint: Type return a+b; below
		      return a+b;
			}

		 public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int a;
		        a = in.nextInt();
		        int b;
		        b = in.nextInt();
		        int sum;
		        sum = solveMeFirst(a, b);
		        System.out.println(sum);
			}
		}
