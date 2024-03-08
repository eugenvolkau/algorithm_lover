package com.telran.prof.PWE.Fibonacci;

import com.telran.prof.PWE.Fibonacci.Palindrome.Palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfFibonacci {

    public static int buildList(int n) {


        int numCurrent = (n == 0) ? 0 : (n == 1 || n == 2) ? 1 : (buildList(n - 1) + buildList(n - 2));
        return numCurrent;
    }

    public static void main(String[] args) {
       Palindrome isPalindroooo = new Palindrome();

        ArrayList<Integer> numOfFabinacciNew = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int langOfList = scan.nextInt();
        for (int i = 0; i < langOfList; i++) {
            numOfFabinacciNew.add(buildList(i));
        }
        System.out.println(numOfFabinacciNew);
        for (Integer unit : numOfFabinacciNew) {
            String str = Integer.toString(unit);
//            System.out.print("  " + str);
          if (isPalindroooo.isPalindrome(str))
                System.out.println(str + " is a palindrome.");
            else
                System.out.println(str + " is not a palindrome.");
        }
        }
    }


