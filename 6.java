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
        bufferedReader.close();
        calculateMultiples(n);
    }
    
    public static void calculateMultiples(int n){
        int i = 1;
        while(i >= 1 && i <= 10){
          System.out.print(n+" x "+i+" = "+n*i+"\n");
          i++;  
        }
    }
}
