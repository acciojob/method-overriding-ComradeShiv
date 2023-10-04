package com.driver;


public class Main {

    static class A {
        String meth() {
            return "Invoking method from class A";
        }
    }
    static class B extends A {
        @Override
        String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args) {

        B o = new B();
        System.out.println(o.meth());

        B o1 = new B();
        System.out.println(o1.meth());
    }
}