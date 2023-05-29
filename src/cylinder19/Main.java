package cylinder19;
/*
Write a class with the name Main that have main method
 */

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle radius=" + circle.getRadius());
        System.out.println("circle.area=" + circle.getArea());
        Cylinder cylinder19 = new Cylinder(5.55,7.25);
        System.out.println("cylinder.radius=" + cylinder19.getRadius());
        System.out.println("cylinder.height=" + cylinder19.getHeight());
        System.out.println("cylinder.area=" + cylinder19.getArea());
        System.out.println("cylinder.volume=" + cylinder19.getVolume());
    }
}
