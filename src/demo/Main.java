package demo;

import demo.computer.Computer;
import demo.computer.Screen;

public class Main {
    public static void main(String[] args) {
        //tạo đối tượng
        Person person = new Person();
        // truy xuất thuộc tính của đối tượng
        person.height=75;
        person.weight=1.75f;
        System.out.println("height ="+person.height);
        System.out.println("weight ="+person.weight);
        Screen s_a =new Screen(14,"red");
        Screen s_b =new Screen(17,"blue");

        Computer del =new Computer("mayA",12000,s_a);
        Computer hp =new Computer("mayb",12000,s_b);
       Person hai = new Person(1.8F,65,hp);
       Person minh = new Person(1.8F,65,del);
        System.out.println(hai.computer.getScreen().getSize());
        System.out.println(minh);
    }
}

// lớp-class:mô hình tạo ra các đối tượng
//1, thuộc tính nên để phạm vi truy cập private
//2,các phương thức :Contructor,get/set,các phương thức khác :toSring
//Đối tượng :object là 1 trường hợp cụ thể
//- cách khỏi tạo : Tên_Class tên_đối_tượng =new Cóntructor(args)
//-truy cập phương thức và thuộc tính bằng dấu"."
////phạm vi truy cập của thuộc tính và phương thức
////PUBLIC Công khai truy cập mọi nơi
////-PROTECTED:cho phép truy cập cùng package
////-default:chỉ cho phép truy cập trog package
////-private:chỉ cho phép truy cập trong lớp
