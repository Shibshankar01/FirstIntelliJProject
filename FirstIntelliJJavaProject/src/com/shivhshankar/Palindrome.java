package com.shivhshankar;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left <= right){

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }
            else{
                if(s.charAt(left) != s.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
