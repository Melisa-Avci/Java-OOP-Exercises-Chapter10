package test;
import odev3.Circle2D;

public class TestCircle2D {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.println("Alan (Area): " + c1.getArea());
        System.out.println("Çevre (Perimeter): " + c1.getPerimeter());
        System.out.println("(3, 3) noktası dairenin içinde mi? " + c1.contains(3, 3));
        System.out.println("Yeni daire içeride mi? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Yeni daire kesişiyor mu (overlaps)? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }
}