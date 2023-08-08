package practice13_2;

public class RightAngleLU extends RTTriangle{
    public RightAngleLU(int width) { super(width); }

    public void draw(){
        for(int i = 0; i < getWidth(); i++){
            for(int j = 0; j < getWidth() - i; j++){
                System.out.print('*');
            }System.out.println();
        }
    }

    public String toString(){
        return "RTTriangleLU(width: " + getWidth() + ")";
    }
}