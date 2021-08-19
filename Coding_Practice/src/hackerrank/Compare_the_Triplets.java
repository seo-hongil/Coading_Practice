package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Compare_the_Triplets {
	/* Hackerrank Compare the Triplets 문제
	     두 배열에 index를 비교하고 큰 값에 1씩 증가(같으면 0)
	 ex) 5 6 7
		 3 6 10
		 결과 :  1 1
		 
	*/
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int size = a.size();
        int A=0;
        int B=0;
        
        for(int i=0; i < size; i++){
            if(a.get(i) > b.get(i)){
                A++;
            }else if(a.get(i) < b.get(i)){
                B++;
            }
        }
        return Arrays.asList(A,B);
    }
       
   
    

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a.add(aItem);
        }

        String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b.add(bItem);
        }

        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

