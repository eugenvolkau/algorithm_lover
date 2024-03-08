package com.telran.prof.PWE.DigitSumm;

public class DigitSumm {

    public static void main(String[] args){
        int num= 179;
        int resultOne = summator(num);
        System.out.println(summator(num));
int num1 = 985;
int resultTwo = summator(num1);
        System.out.println(summator(num1));
    }
public static int summator(int num){
      return (num==0)?0:(num%10)+summator(num/10);
}
}

