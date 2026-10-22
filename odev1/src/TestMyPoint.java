
public class TestMyPoint {
     
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("Nokta 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Nokta 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("İki nokta arasındaki mesafe: " + p1.distance(p2));
    }
}