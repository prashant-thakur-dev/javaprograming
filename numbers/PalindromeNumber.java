package src.numbers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = n+"";
        boolean isPalindrome = true;
        for (int i = 0; i<s.length()/2 ; i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("panalidrom");
        }
        else{
            System.out.println("not panalidrom");
        }
    }
}
