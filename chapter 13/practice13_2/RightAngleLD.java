package practice13_2;

public class RightAngleLD extends RTTriangle{
    public RightAngleLD(int width) { super(width); }

    public void draw(){
        for(int i = getWidth() - 1; i >= 0; i--){
            for(int j = 0; j < getWidth() - i; j++){
                System.out.print('*');
            }System.out.println();
        }
    }

    public String toString(){
        return "RTTriangleLD(width: " + getWidth() + ")";
    }
}