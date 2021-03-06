import java.util.*;
import java.io.*;

//Write your code here
class Calculator{
    public int power(int v1,int v2)throws Exception{
            if (v1 <0 || v2 < 0){
                throw new Exception("n and p should be non-negative");
            }
            int result = (int)Math.pow(v1, v2);
            return result;  
            
    }
}


class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
