package com.telran.prof.PWE.Fibonacci.Palindrome;

public class Palindrome {

    public boolean checkPalindrome(String str, int start, int end) {
        if (start == end)
            return true;
        if (str.charAt(start) != str.charAt(end))
            return false;
        if (start < end + 1)
            return checkPalindrome(str, start + 1, end - 1);
        return true;
    }

    public boolean isPalindrome(String str) {
        int n = str.length();
         if (n == 0)
            return true;
        return checkPalindrome(str, 0, n - 1);
    }
}