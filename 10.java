import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        printResult(countConsecutive(convertBinary(n)));

        bufferedReader.close();
    }
    public static String convertBinary(int n){
         return Integer.toBinaryString(n);
    }
    
    public static Integer countConsecutive(String num){
        int maxCount = 0;
        int count = 0;
        for(int i=0;i<num.length();i++){
            if((num.charAt(i)=='1')){ 
                count++;
               if (count > maxCount){
                   maxCount = count;
               }
            
            }else count = 0;
            
        }
        return maxCount;
    }
    
    public static void printResult(int v){
        System.out.print(v);
    }
}