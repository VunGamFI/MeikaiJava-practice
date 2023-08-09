package practice14_1;

public class ShapeTester{
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(4, 7);
        Parallelogram parallelogram = new Parallelogram(4, 7);

        System.out.println(rectangle.getArea());
        System.out.println(parallelogram.getArea());
    }
}