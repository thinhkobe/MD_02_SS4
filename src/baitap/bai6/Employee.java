package baitap.bai6;

import java.util.Scanner;

public class Employee {
   private String id;
   private String name;
   private int age;
   private double rate;
   private double salary;

    public Employee() {
    }

    public Employee(String id, String name, int age, double rate, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rate = rate;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rate=" + rate +
                ", salary=" + calSalary(this.rate) +
                '}';
    }

    //phương thức inputData
    public void inputData(Scanner sc){
        System.out.println("Nhập id Employee");
        this.id=sc.nextLine();
        System.out.println("Nhập tên Employee");
        this.name=sc.nextLine();
        System.out.println("Nhập tuổi Employee");
        this.age= Integer.parseInt(sc.nextLine());
        System.out.println("Nhập rate Employee");
        this.rate= Double.parseDouble(sc.nextLine());

    }


   //phương thức calSalary
    public double calSalary(double rate){
        return rate*1300000;
    }

}
