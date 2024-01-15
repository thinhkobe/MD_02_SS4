public class Student {
    int studnetId;
    String studenName;

    boolean sex;
    String className;
    int age;
    String address;

    public Student(int id, String name, boolean sex, String className, int age, String address){
        this.studnetId=id;
        this.studenName=name;
        this.sex=sex;
        this.className=className;
        this.age=age;
        this.address=address;
    }
    public  void display(){
        System.out.println("Mã HS"+studnetId+"\n"
        +"tên HS :"+studenName+"\n"
                +"Tuổi :"+age+"\n"
                +"Giới tính :"+sex+"\n"
                +"Lớp :"+className+"\n"
                +"Địa chỉ :"+address+"\n");
    }
}
