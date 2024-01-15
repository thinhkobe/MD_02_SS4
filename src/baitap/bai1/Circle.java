package baitap.bai1;

import java.util.Scanner;

public class Circle {
    float radius;
    String color;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "ban kinh=" + radius +
                ", mau='" + color + '\'' +
                '}'+"\n"+
        "diện tích"+calculateArea(radius)+"\n"
                +"chu vi :"+calculateCircumference(radius);
    }
    public void inputData(Scanner sc){
        System.out.println("nhập bán kính hình tròn");
        this.radius= Float.parseFloat(sc.nextLine());
        System.out.println("nhập màu");
        this.color=sc.nextLine();
        System.out.println(this);
    }
    // Phương thức tính diện tích hình tròn
    private static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Phương thức tính chu vi hình tròn
    private static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
