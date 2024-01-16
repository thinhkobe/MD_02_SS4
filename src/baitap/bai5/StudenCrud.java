package baitap.bai5;

import java.util.Scanner;

public class StudenCrud {
    public static Student[] students=new Student[0];

    //hiển thị toàn bộ danh sách học sinh
    public  void display(){
        if (students.length!=0) {
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i]);
            }
        }else {
            System.out.println("Danh sách trống");
        }
    }
    //phương thức thêm mới học sinh
    public void addStudent(Scanner sc){
        //nhập số lượng sinh viên cần thêm
        System.out.println("nhập số lượng sinh viên cần thêm");
        int n= Integer.parseInt(sc.nextLine());

        //tạo ra một mảng học sinh mới có số lượng bằng mảng cũ +n
        Student[] newStudents=new Student[students.length+n];
        for (int i = 0; i < students.length; i++) {
            newStudents[i]=students[i];
        }
        for (int i = 0; i <n ; i++) {
            Student newstu=new Student();
            newstu.addStudent(sc);
            //thêm vào mảng mới học sinh mới
            newStudents[students.length+i]=newstu;
        }
        //gán lại giá trị của mảng học sinh cũ
        students=newStudents;
    }
    //sửa thông tin dựa vào mã học sinh
    public void updateStudentInfoById(Scanner sc){
        System.out.println("nhập vào mã học sinh");
        String id=sc.nextLine();
        //tìm xem nó có trong mảng không
        int index=findIndexById(id);
        if (index !=-1){
            System.out.println("thông tin học sinh cũ " +
                    "\n"+students[index]);
            System.out.println("nhập thông tin học sinh");
            students[index].addStudent(sc);
            System.out.println("cập nhật thành công");
        }else{
            System.out.println("Nhập sai mã học sinh");
        }

    }
    //xóa học sinh theo id
    public void deleteStudent(Scanner sc){
        System.out.println("nhập mã học sinh");
        String deleteid= String.valueOf(Integer.parseInt(sc.nextLine()));
        int index=findIndexById(deleteid);
        if (index !=-1){
            Student[] student = new Student[students.length-1];
            for (int i = 0; i < students.length; i++) {
                if (i<index){
                    student[i]=students[i];
                } else if (i>index) {
                    student[i-1]=students[i];
                }
            }
            students=student;
        }else {
            System.out.println("Nhập sai mã học sinh");
        }
    }
    //tìm kiến mã dựa theo id
    public int findIndexById(String id){
        for (int i = 0; i < students.length; i++) {
            if (students[i].getStudentId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
