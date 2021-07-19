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
     * Complete the 'getMaxCharCount' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> getMaxCharCount(String s, List<List<Integer>> queries) {
    // queries is a n x 2 array where queries[i][0] and queries[i][1] represents x[i] and y[i] for the ith query.
        int[][] mat=new int[26][300000];
        int[] sz=new int[26];
        if(s.charAt(s.length()-1)=='a'||s.charAt(s.length()-1)=='A'){
            mat[0][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='b'||s.charAt(s.length()-1)=='B'){
            mat[1][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='c'||s.charAt(s.length()-1)=='C'){
            mat[2][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='d'||s.charAt(s.length()-1)=='D'){
            mat[3][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='E'){
            mat[4][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='f'||s.charAt(s.length()-1)=='F'){
            mat[5][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='g'||s.charAt(s.length()-1)=='G'){
            mat[6][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='h'||s.charAt(s.length()-1)=='H'){
            mat[7][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='I'){
            mat[8][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='j'||s.charAt(s.length()-1)=='J'){
            mat[9][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='k'||s.charAt(s.length()-1)=='K'){
            mat[10][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='l'||s.charAt(s.length()-1)=='L'){
            mat[11][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='m'||s.charAt(s.length()-1)=='M'){
            mat[12][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='n'||s.charAt(s.length()-1)=='N'){
            mat[13][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='O'){
            mat[14][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='p'||s.charAt(s.length()-1)=='P'){
            mat[15][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='q'||s.charAt(s.length()-1)=='Q'){
            mat[16][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='r'||s.charAt(s.length()-1)=='R'){
            mat[17][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='s'||s.charAt(s.length()-1)=='S'){
            mat[18][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='t'||s.charAt(s.length()-1)=='T'){
            mat[19][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='u'||s.charAt(s.length()-1)=='U'){
            mat[20][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='v'||s.charAt(s.length()-1)=='V'){
            mat[21][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='w'||s.charAt(s.length()-1)=='W'){
            mat[22][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='x'||s.charAt(s.length()-1)=='X'){
            mat[23][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='y'||s.charAt(s.length()-1)=='Y'){
            mat[24][s.length()-1]=1;
        }
        if(s.charAt(s.length()-1)=='z'||s.charAt(s.length()-1)=='Z'){
            mat[25][s.length()-1]=1;
        }
        for(int i=s.length()-2;i>=0;i--){
            mat[0][i]=mat[0][i+1];
            mat[1][i]=mat[1][i+1];
            mat[2][i]=mat[2][i+1];
            mat[3][i]=mat[3][i+1];
            mat[4][i]=mat[4][i+1];
            mat[5][i]=mat[5][i+1];
            mat[6][i]=mat[6][i+1];
            mat[7][i]=mat[7][i+1];
            mat[8][i]=mat[8][i+1];
            mat[9][i]=mat[9][i+1];
            mat[10][i]=mat[10][i+1];
            mat[11][i]=mat[11][i+1];
            mat[12][i]=mat[12][i+1];
            mat[13][i]=mat[13][i+1];
            mat[14][i]=mat[14][i+1];
            mat[15][i]=mat[15][i+1];
            mat[16][i]=mat[16][i+1];
            mat[16][i]=mat[16][i+1];
            mat[17][i]=mat[17][i+1];
            mat[18][i]=mat[18][i+1];
            mat[19][i]=mat[19][i+1];
            mat[20][i]=mat[20][i+1];
            mat[21][i]=mat[21][i+1];
            mat[22][i]=mat[22][i+1];
            mat[23][i]=mat[23][i+1];
            mat[24][i]=mat[24][i+1];
            mat[25][i]=mat[25][i+1];
            if(s.charAt(i)=='a'||s.charAt(i)=='A'){
                mat[0][i]=mat[0][i+1]+1;
            }
            if(s.charAt(i)=='b'||s.charAt(i)=='B'){
                mat[1][i]=mat[1][i+1]+1;
            }
            if(s.charAt(i)=='c'||s.charAt(i)=='C'){
                mat[2][i]=mat[2][i+1]+1;
            }
            if(s.charAt(i)=='d'||s.charAt(i)=='D'){
                mat[3][i]=mat[3][i+1]+1;
            }
            if(s.charAt(i)=='e'||s.charAt(i)=='E'){
                mat[4][i]=mat[4][i+1]+1;
            }
            if(s.charAt(i)=='f'||s.charAt(i)=='F'){
                mat[5][i]=mat[5][i+1]+1;
            }
            if(s.charAt(i)=='g'||s.charAt(i)=='G'){
                mat[6][i]=mat[6][i+1]+1;
            }
            if(s.charAt(i)=='h'||s.charAt(i)=='H'){
                mat[7][i]=mat[7][i+1]+1;
            }
            if(s.charAt(i)=='i'||s.charAt(i)=='I'){
                mat[8][i]=mat[8][i+1]+1;
            }
            if(s.charAt(i)=='j'||s.charAt(i)=='J'){
                mat[9][i]=mat[9][i+1]+1;
            }
            if(s.charAt(i)=='k'||s.charAt(i)=='K'){
                mat[10][i]=mat[10][i+1]+1;
            }
            if(s.charAt(i)=='l'||s.charAt(i)=='L'){
                mat[11][i]=mat[11][i+1]+1;
            }
            if(s.charAt(i)=='m'||s.charAt(i)=='M'){
                mat[12][i]=mat[12][i+1]+1;
            }
            if(s.charAt(i)=='n'||s.charAt(i)=='N'){
                mat[13][i]=mat[13][i+1]+1;
            }
            if(s.charAt(i)=='o'||s.charAt(i)=='O'){
                mat[14][i]=mat[14][i+1]+1;
            }
            if(s.charAt(i)=='p'||s.charAt(i)=='P'){
                mat[15][i]=mat[15][i+1]+1;
            }
            if(s.charAt(i)=='q'||s.charAt(i)=='Q'){
                mat[16][i]=mat[16][i+1]+1;
            }
            if(s.charAt(i)=='r'||s.charAt(i)=='R'){
                mat[17][i]=mat[17][i+1]+1;
            }
            if(s.charAt(i)=='s'||s.charAt(i)=='S'){
                mat[18][i]=mat[18][i+1]+1;
            }
            if(s.charAt(i)=='t'||s.charAt(i)=='T'){
                mat[19][i]=mat[19][i+1]+1;
            }
            if(s.charAt(i)=='u'||s.charAt(i)=='U'){
                mat[20][i]=mat[20][i+1]+1;
            }
            if(s.charAt(i)=='v'||s.charAt(i)=='V'){
                mat[21][i]=mat[21][i+1]+1;
            }
            if(s.charAt(i)=='w'||s.charAt(i)=='W'){
                mat[22][i]=mat[22][i+1]+1;
            }
            if(s.charAt(i)=='x'||s.charAt(i)=='X'){
                mat[23][i]=mat[23][i+1]+1;
            }
            if(s.charAt(i)=='y'||s.charAt(i)=='Y'){
                mat[24][i]=mat[24][i+1]+1;
            }
            if(s.charAt(i)=='z'||s.charAt(i)=='Z'){
                mat[25][i]=mat[25][i+1]+1;
            }
        }
     /*   for(int i=0;i<26;i++){
            for(int j=0;j<s.length();j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }*/
        int[] x=new int[2];
        int pos=-1,tempres=0;
        List<Integer> res=new ArrayList<Integer>();
        int flag=0;
        for(List<Integer> list: queries){
            for(Integer item: list){
                x[++pos]=item;
            }
            pos=-1;
            if(x[0]==x[1]){
                res.add(1);
                continue;
            }
            for(int i=25;i>=0;i--){
                if(mat[i][x[0]]-mat[i][x[1]]==0){
                    if(mat[i][x[0]]==0 && mat[i][x[1]]==0){
                        continue;
                    }
                    else if(mat[i][x[1]]!=mat[i][x[1]+1]){
                        res.add(1);
                        break;
                    }
                }
                else if(mat[i][x[0]]-mat[i][x[1]]>0){
                    if(x[1]==s.length()-1){
                        if(mat[i][x[1]]==1){
                            res.add(mat[i][x[0]]-mat[i][x[1]]+1);
                            break;
                        }
                        else{
                            res.add(mat[i][x[0]]-mat[i][x[1]]);
                            break;
                        }
                    }
                    else{
                        if(mat[i][x[1]]!=mat[i][x[1]+1]){
                            res.add(mat[i][x[0]]-mat[i][x[1]]+1);
                            break;
                        }
                        else{
                            res.add(mat[i][x[0]]-mat[i][x[1]]);
                            break;
                        }
                    }
                }
            }
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> query = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                query.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = Result.getMaxCharCount(s, query);

        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
