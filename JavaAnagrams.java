import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        
        if(a.length()!=b.length()) return false;

        char[] ar1 = a.toCharArray();
        char[] ar2 = b.toCharArray();
        
        ar1 = sortArray(ar1);
        ar2 = sortArray(ar2);
        
        for(int i = 0; i<ar1.length-1;i++){
            if(ar1[i]!=ar2[i])return false;
        }
        return true;  
    }
        
        
    public static char[] sortArray (char[] arr){
        char temp;
 
        int i = 0;
        while (i <= arr.length-1) {
            int j = i + 1;
            while (j <= arr.length-1) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        return arr;
    } 

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
