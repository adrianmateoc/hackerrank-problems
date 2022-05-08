import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] splitted = s.split("[^a-zA-Z]");
        int num = 0; 
        for (int i=0; i<splitted.length; ++i){ 
             if (splitted[i].length() > 0) num++;
        }    
        System.out.println(num);
        
        for (int i=0; i<splitted.length;++i){
            if (splitted[i].length() > 0) System.out.println(splitted[i]);
        }
        scan.close();
    }
}

