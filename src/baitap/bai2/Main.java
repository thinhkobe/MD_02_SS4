package baitap.bai2;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng QuadraticEquation
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);

        // Hiển thị kết quả
        System.out.println("Delta = " + equation.calculateDelta());

        if (equation.hasRealRoots()) {
            System.out.println("Root 1 = " + equation.getRoot1());
            System.out.println("Root 2 = " + equation.getRoot2());
        } else {
            System.out.println("The equation has no roots.");
        }
    }
}
