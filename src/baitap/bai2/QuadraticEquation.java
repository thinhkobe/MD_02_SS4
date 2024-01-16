package baitap.bai2;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override//hiển thị
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    // Phương thức tính delta
    public double calculateDelta() {
        return b * b - 4 * a * c;
    }

    // Phương thức kiểm tra xem phương trình có nghiệm hay không
    public boolean hasRealRoots() {
        return calculateDelta() >= 0;
    }

    // Phương thức tính nghiệm thứ nhất
    public double getRoot1() {
        if (hasRealRoots()) {
            return (-b + Math.sqrt(calculateDelta())) / (2 * a);
        } else {
            throw new ArithmeticException("No real roots.");
        }
    }

    // Phương thức tính nghiệm thứ hai
    public double getRoot2() {
        if (hasRealRoots()) {
            return (-b - Math.sqrt(calculateDelta())) / (2 * a);
        } else {
            throw new ArithmeticException("No real roots.");
        }
    }



}
