package baitap.bai8;

public class StaticMethod {
    public static double Pi= 3.14;

    public static double calCircleArea(double R){
        return Pi*R*R;
    }
    public static double calRectangleArea(double width,double height){
        return  width*height;
    }
    public static double calTriangleArea(double a, double b, double c){
        // Tính nửa chu vi
        double s = (a + b + c) / 2;

        // Tính diện tích tam giác bằng công thức Heron
        double dienTich = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return dienTich;
    }
}
