import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = sc.nextInt();
            }
        }      
        printMax(maxValue(arr));
    }
    
    public static int maxValue(int arr[][]){
       int max = -100;
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
            	int sum = 0;
                sum += arr[i][j] + arr[i][j+1] + arr[i][j+2];
                sum += arr[i+1][j+1];
                sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum>max) {
                    max = sum;
                }
            }
        } 
        return max;    
    }
    
    public static void printMax(int max){
        System.out.print(max);
    }

}
