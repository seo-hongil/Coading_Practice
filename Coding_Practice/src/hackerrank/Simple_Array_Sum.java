package hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Simple_Array_Sum {
	/* Hackerrank Simple Array Sum 臾몄젣 
	 scanner濡� �닽�옄瑜� �븯�굹 �엯�젰諛쏆쑝硫� 洹� �닽�옄瑜� �떎 �뜑�븯�뒗 臾몄젣
	*/
	
	static int simpleArraySum(int[] ar) {
         int sum=0;
         for(int i=0; i<ar.length; i++)
            sum+=ar[i];
            return sum;
         
    }
	
	private static final Scanner
	scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
