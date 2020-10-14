package lab5_test2;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(4, 2);
        MyPoint p2 = new MyPoint(6, 3);

        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(2, 4));

        MyPoint points[] = new MyPoint[10];

        for(int i=0 ; i<points.length ; i++)
        {
            points[i] = new MyPoint(i+1 , i+1);
        }
    }
}
