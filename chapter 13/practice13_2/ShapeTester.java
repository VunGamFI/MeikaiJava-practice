package practice13_2;

class ShapeTester{
    public static void main(String[] args){

        Shape[] p = new Shape[4];

        p[0] = new RightAngleLD(5);
        p[1] = new RightAngleLU(5);
        p[2] = new RightAngleRD(5);
        p[3] = new RightAngleRU(5);
        for(Shape s : p){
            s.print();
            System.out.println();
        }
    }
}