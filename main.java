package Int;

import java.util.concurrent.Callable;

class Main
{
        public static void main (String[] args)
        {
            /*Int v = new Int();
            v.increment();
            System.out.println(v);
            v.increment();
            System.out.println(v);
            v.add(v);
            System.out.println(v);
            v.substract(v);
            System.out.println(v);
            v.decrement();
            System.out.println(v);

            Int a = new Int();
            a.setInt(1000);
            System.out.println("Result:" + a);*/

           Circle one = new Circle();
           System.out.println(one);

            Circle two = new Circle(1,2,3);
            System.out.println(two);
            System.out.println("This point is in thue circle: " + two.isInside(1, 1));
            System.out.println("This point is in thue circle: " + two.isInside(551, 2) + "\n");

            Circle three = new Circle(1,2,3);
            three.zoom(2);
            System.out.println(three);
        }
}
