public class Cacurator {
    double a;
    double b;
    public Cacurator( double a,double b){
        this.a=a;
        this.b=b;

    };

    public Cacurator() {

    }

    //các phương thức get/set
    public double getA(){
        return a;
    }
    public double getB(){
        return a;
    }
    public void setA(double a){
        this.a=a;
    }
    public void setB(double b){
        this.b=b;
    }

    public double add(){
        return a+b;
    }
    public double sub(){
        return a-b;
    }
    public double multi(){
        return a*b;
    }
    public double div(){
        return a/b;
    }
}
