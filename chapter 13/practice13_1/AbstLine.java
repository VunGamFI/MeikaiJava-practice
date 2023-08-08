package practice13_1;

public abstract class AbstLine extends Shape{
    private int length;

    public AbstLine(int length){
        setLength(length);
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return length;
    }

    public String tostring(){
        return "AbstLine(length: " + length + ")";
    }
}
