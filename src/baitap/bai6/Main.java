package baitap.bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Employee[] employees=new Employee[2];

        for (int i = 0; i < employees.length; i++) {
           employees[i]=new Employee();

            System.out.println("nhập thông tin nhân viên số"+(i+1));

            employees[i].inputData(sc);

        }
        //hiển thị danh sách empluyee
        for (int i = 0; i < employees.length; i++) {
            System.out.println("aa"+employees[i]);
        }
    }
}
