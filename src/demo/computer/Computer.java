package demo.computer;

public class Computer {

    String name;
    double price;

    Screen screen;

    public Computer(String name, double price, Screen screen) {
        this.name = name;
        this.price = price;
        this.screen = screen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", screen=" + screen +
                '}';
    }
}
