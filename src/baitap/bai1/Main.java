package baitap.bai1;

import java.util.Scanner;

public class Main {
    static Circle circle=new Circle();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Circle circle1=new Circle(6.5F,"red");
        Circle circle2=new Circle(3.4F,"blue");
        System.out.println(circle2);
        System.out.println(circle1);
        circle.inputData(sc);
    }
}
