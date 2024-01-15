import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("nhập chiều rộng");
//        double width=sc.nextDouble();
//        System.out.println("nhập chiều cao");
//        double heigth=sc.nextDouble();
//        Rectangle rectangle =new Rectangle(width,heigth);
//        System.out.println("hình chữ nhật"+rectangle.display());
//        System.out.println("chu vi "+rectangle.getPerimeter());
//        System.out.println("diện tích"+rectangle.getArea());
        //Khỏi tạo đối tượng
        Student std1=new Student(1,"NV A",true,"JV 02",19,"hà nội");
        Student std2=new Student(2,"NV b",false,"JV 02",20,"hà nội");
        Student std3=new Student(3,"NV c",true,"JV 02",39,"hà nội");

//        System.out.println("Thông tin hs");
//        std1.display();
//        std2.display();
//        std3.display();
        Category Dm1=new Category(1,"Quần");
        Category Dm2=new Category(1,"Áo");
        Product  product1=new Product(1,"quần nâu",10000,Dm1);
        Product  product2=new Product(2,"quần nâu",20000,Dm1);
        Product  product3=new Product(3,"quần nâu",30000,Dm2);
        Product  product4=new Product(4,"quần nâu",40000,Dm2);
//        product1.display();
//        product2.display();
//        product3.display();
//        product4.display();
        //khởi tạo đối tượng cacurator
        Cacurator cacurator=new Cacurator();
        //nhập giá trị cho a và b
//        System.out.println("nhập a");
//        double a=sc.nextDouble();
//        System.out.println("nhap b");
//        double b=sc.nextDouble();
//        //đặt giá trị cho a và b
//        cacurator.setA(a);
//        cacurator.setB(b);
//        System.out.println("a+b"+cacurator.add());
//        System.out.println("a-b"+cacurator.sub());
//        System.out.println("a*b"+cacurator.multi());
//        System.out.println("a/b"+cacurator.div()
//        );
        Student_1 st1=new Student_1(11,"aa");
        Student_1.change("kkkk");
        Student_1 st2=new Student_1(22,"bb");

        Student_1 st3=new Student_1(33,"cc");
        st1.display();
        st2.display();
        st3.display();
    }
}