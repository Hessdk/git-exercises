package org.example;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.writeNumbers();

    }

    public int writeNumbers() {


        for (int i = 1; i <= 100; i++) {
            boolean checker = false;
            if (i % 3 == 0 && i % 5 == 0) {
                checker = true;
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                checker = true;
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                checker = true;
                System.out.println("Buzz");
            }
            if (!checker) {
                System.out.println(i);
            }   

        }
        return 1;
    }
}