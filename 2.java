import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
            int v1;
            double v2;
            String v3;
        /* Read and save an integer, double, and String to your variables.*/
            v1=scan.nextInt();
            v2=scan.nextDouble();
            scan.nextLine();
            v3=scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
            System.out.println(i+v1);
        /* Print the sum of the double variables on a new line. */
		    System.out.println(d+v2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            String s1=s.concat(v3);  
            System.out.println(s1);
        scan.close();