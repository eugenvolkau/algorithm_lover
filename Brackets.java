package com.telran.prof;

import java.util.Stack;


public class Brackets {

    public static void main(String[] args) {

        String str1="([{}])";
        String str2="([)]";
        String str3="{()]";
        System.out.println(str1 + "" + validate(str1));
        // [({})]true

        System.out.println(str2 + ""+validate(str2));
        // ([)]false
        System.out.println(str3+""+validate(str3));
        // {()]false
    }
    public static boolean validate(String str) {
        Stack<Character> stack = new Stack <>();
        for (char c:
                str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else
            if(c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' &&
                        top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}