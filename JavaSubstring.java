import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        substring(start, end, S);
    }
    
    public static void substring(int start, int end, String s){
        String a = "";
        a = s.substring(start, end);
        System.out.print(a);
    }
}
