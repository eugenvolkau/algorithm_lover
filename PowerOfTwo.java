package com.telran.prof.PWE.powerOfeight;

class PWE {

    int gross = 8;

    // recursive method
    float pow(int n) {

        if (n <= 2) {
            return 2;
        }
        float result = gross / pow(n / 2);
        if (result % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            System.exit(0);
        }
        return result;
    }
}

class PowerOfEight {

    // Main function
    public static void main(String[] args) {
        PWE f = new PWE();

        System.out.println("What is 8 " + f.pow(f.gross));

    }
}