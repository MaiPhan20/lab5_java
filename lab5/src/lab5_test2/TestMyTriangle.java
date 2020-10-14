package lab5_test2;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(3,3);
        MyPoint point2 = new MyPoint(4,4);
        MyPoint point3 = new MyPoint(5,5);
        MyTriangle triangle = new MyTriangle(0,0,1,1,2,2);
        MyTriangle triangle2 = new MyTriangle(point1 , point2 , point3);

        System.out.println(triangle.toString());
        System.out.println(triangle2.toString());
        System.out.println(triangle.getPerimeter());
        triangle.printType();
    }
}

