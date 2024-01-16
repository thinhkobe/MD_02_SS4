package baitap.bai5;

import java.util.Scanner;

public class Main {
    static StudenCrud studenCrud = new StudenCrud();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Hiển thị danh sách tất cả học sinh\n" +
                    "2.Thêm mới học sinh\n" +
                    "3.Sửa thông tin học sinh dựa vào mã học sinh\n" +
                    "4.Xoá học sinh\n" +
                    "5.Thoát\n");
            System.out.println("nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    studenCrud.display();
                    break;
                case 2:
                    studenCrud.addStudent(sc);
                    break;
                case 3:
                    studenCrud.updateStudentInfoById(sc);
                    break;
                case 4:
                    studenCrud.deleteStudent(sc);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
