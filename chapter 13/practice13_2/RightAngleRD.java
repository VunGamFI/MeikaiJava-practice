package practice13_2;

public class RightAngleRD extends RTTriangle{
    public RightAngleRD(int width) { super(width); }

    public void draw(){
        for(int i = 0; i < getWidth(); i++){
            for(int j = getWidth() - 1; j >= 0; j--){
                if(j - i > 0)
                    System.out.print(" ");
                else
                    System.out.print('*');
            }System.out.println();
        }
    }

    public String toString(){
        return "RTTriangleRD(width: " + getWidth() + ")";
    }
}