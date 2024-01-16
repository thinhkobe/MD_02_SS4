package baitap.bai5;

import java.util.Scanner;

public class Student {
    String studentId;
    String studentName;
    int age;
    boolean sex;
    String adress;
    String phoneNumber;

    public Student() {
    }

    public Student(String studentId, String studentName, int age, boolean sex, String adress, String phoneNumber) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void addStudent(Scanner sc){
        if (this.studentName==null){
        System.out.println("Nhập Id học sinh");
        this.studentId=sc.nextLine();
        }
        System.out.println("Nhập tên học sinh");
        this.studentName=sc.nextLine();
        System.out.println("Nhập tuổi học sinh");
        this.age= Integer.parseInt(sc.nextLine());
        System.out.println("nhập giới tính Nam(true)Nữ(false)");
        this.sex= Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập địa chỉ học sinh");
        this.adress=sc.nextLine();
        System.out.println("nhập số điện thoại");
        this.phoneNumber=sc.nextLine();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", sex=" + (sex?"Nam":"Nữ") +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
