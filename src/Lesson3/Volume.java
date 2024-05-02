package Lesson3;

public class Volume {
    public static void main(String[] args) {
        double h = 10;
        double r = 7;

        double area = 2 * Math.PI * (r + h);
        double volume = Math.PI * Math.pow(r, 2) * h;

        System.out.println("Area of the cylinder is: " + area);
        System.out.println("Volume of the cylinder is: " + volume);
    }
}
