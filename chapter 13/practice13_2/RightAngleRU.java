package practice13_2;

public class RightAngleRU extends RTTriangle{
    public RightAngleRU(int width) { super(width); }

    public void draw(){
        for(int i = getWidth() - 1; i >= 0 ; i--){
            for(int j = getWidth(); j >= 0; j--){
                if(j - i > 0)
                    System.out.print(" ");
                else
                    System.out.print('*');
            }System.out.println();
        }
    }

    public String toString(){
        return "RTTriangleRU(width: " + getWidth() + ")";
    }
}