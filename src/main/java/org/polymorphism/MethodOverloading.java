package org.polymorphism;

// See summary of this for method overriding: https://docs.oracle.com/javase/tutorial/java/IandI/override.html
public class MethodOverloading {
    public int multiply(int x, int y) {
        return x * y;
    }

    public int multiply(int x, int y, int z) {
        return x * y * z;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.multiply(10, 20));
        System.out.println(methodOverloading.multiply(10, 20, 30));
        System.out.println(methodOverloading.multiply(10.5, 20.5));
    }

}
