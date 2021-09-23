package com.company;

public class Trekant {

    private int a;
    private int b;
    private int c;

    public Trekant (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getType() {

        if (a == b && a == c || b == c ) {
            return "Equilateral";
        } else if (a == b && a != c || a == c && a != b || b == c && b != a){
            return  "Isosceles";
        } else if (a >= b + c || b >= c + a || c >= b + a) {
            return "Invalid";
        } else if (a != b && a!= c && b != c) {
            return "Scalene";
        } else {
            return "not viable";
        }

    }

    @Override
    public String toString() {
        return getType();
    }
}