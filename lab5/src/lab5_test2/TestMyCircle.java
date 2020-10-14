package lab5_test2;

public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint point = new MyPoint(0,0);
        MyCircle circle = new MyCircle(0,0,4);
        MyCircle circle2 = new MyCircle(new MyPoint(2,2),5);
        System.out.println(circle.getRadius());
        circle.setRadius(6);
        System.out.println(circle2.getCenter());
        circle2.setCenter(point);
        System.out.println(circle.getCenterX() + " " + circle.getCenterY());
        circle.setCenterXY(3, 3);
        System.out.println(circle.toString());
        System.out.println(circle2.toString());
        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());
    }
}
