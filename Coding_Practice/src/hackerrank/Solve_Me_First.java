package hackerrank;

import java.util.Scanner;

public class Solve_Me_First {
		/* Hackerrank Solve Me First 臾몄젣 
		   a�� b�뿉 媛믪쓣 �엯�젰�뻽�쓣 �븣 洹� �몮�쓽 �빀�쓣 援ы븯�떆�삤.
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
