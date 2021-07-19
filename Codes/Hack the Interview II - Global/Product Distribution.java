import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'maxScore' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER m
     */

    public static int maxScore(List<Integer> a, int m) {
    // Write your code here
        Collections.sort(a);
        long res=0,tempres=0;
        int j,temp=0;
        for(int i=0;i<Math.floor(a.size()/m);i++){
            temp++;
            tempres=0;
            for(j=m*i;j<m*i+m;j++){
                tempres=tempres+a.get(j);
            }
            if(a.size()-j<m){
                for(j=m*(i+1);j<a.size();j++){
                    tempres=tempres+a.get(j);
                }
            }
            res=(res+((tempres*temp)%(1000000007)))%(1000000007);
        }
        return (int)res%1000000007;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int ans = Result.maxScore(a, m);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
