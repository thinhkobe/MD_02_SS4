package demo;

import demo.computer.Computer;

public class Person {
    //định nghĩa thuộc tính
    float height;
    float weight;

    Computer computer;
    //phương thức khởi tạo :dùng để tạo ra một đối tượng,cùng tên class,không có dữ liệu trả về
    //phạm vi tuy cập là public
    //phương thức khởi tạo mặc định không có tham số

    public Person() {
    }

    @Override //ghi đè của lớp Object
    public String toString() {
        return "Person{" +
                "height=" + height +
                ", weight=" + weight +
                ", computer=" + computer +
                '}';
    }

    public Person(float height, float weight, Computer computer) {
        this.height = height;
        this.weight = weight;
        this.computer = computer;
    }
}
