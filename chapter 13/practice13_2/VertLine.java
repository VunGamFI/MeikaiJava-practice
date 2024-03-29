package practice13_2;

public class VertLine extends AbstLine{
    public VertLine(int length) { super(length); }

    public String toString(){
        return "VertLine(length: " + getLength() + ")";
    }

    public void draw(){
        for(int i = 1; i <= getLength(); i++)
            System.out.println('|');
    }
}