package practice13_2;

public abstract class RTTriangle extends Shape{
    private int width;

    public RTTriangle(int width){
        this.width = width;
    }

    public int getWidth() { return width; }


    public String toString(){
        return "RTTriangle(width: " + width + ")";
    }
}
