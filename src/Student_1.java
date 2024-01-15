public class Student_1 {
    private int rollNo;
    private String studentname;
    private static String college="BBDI";

    Student_1(int r,String n){
        rollNo=r;
        studentname=n;
    }
    static void change( String a){
        college=a;
    }
    void display(){
        System.out.println(rollNo+"/"+studentname+"/"+college);
    }
}
