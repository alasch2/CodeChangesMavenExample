package io.sl.ex.calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void sayHello() {
        System.out.println("Hello");
    }

    public static void sayTwo() {
        System.out.println("Two");
    }

    public static void sayThree() {
        System.out.println("Three");
    }

    public void callMoo() {
        new Moo().moo();
    }
}
