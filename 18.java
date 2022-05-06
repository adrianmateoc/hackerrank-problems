import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    LinkedList<Character>queue = new LinkedList<>();
    LinkedList<Character>push = new LinkedList<>();

     public void enqueueCharacter(char c){
        queue.add(c);
    }

    public void pushCharacter(char c){
        push.push(c);
    }
    
    public char dequeueCharacter(){
        return queue.remove();
    }
    
    public char popCharacter(){
        return push.pop();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}