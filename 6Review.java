import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            String even = "";
            String odd = "";
            
            for (int z=0; z<s.length(); z++){
                char[] charArr = s.toCharArray();
                if (z%2==0){
                    even = even + charArr[z];
                }else{
                    odd= odd+charArr[z];
                }
            }
            System.out.println(even+" "+odd);
        }
        
        scan.close();
    }
}
