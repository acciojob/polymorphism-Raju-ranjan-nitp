package com.driver;
public class Main {

    public static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        // call the first method
        int result1 = p.product(3, 4);
        System.out.println("Result 1: " + result1);

        // call the second method
        int result2 = p.product(2, 5, 7);
        System.out.println("Result 2: " + result2);

        // call the third method
        double result3 = p.product(1.5, 2.5);
        System.out.println("Result 3: " + result3);
    }
}