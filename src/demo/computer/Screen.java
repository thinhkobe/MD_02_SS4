package demo.computer;

public class Screen {
    float size;
    String color;

    public Screen(float size, String color) {
        this.size = size;
        this.color = color;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}
