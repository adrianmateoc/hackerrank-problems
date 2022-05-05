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

        String s = bufferedReader.readLine();
        convertToInt(s);
        bufferedReader.close();
    }
    
    public static void convertToInt(String s){
        int i;
        try{
            i = Integer.valueOf(s);
            System.out.println(i);
        }catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
