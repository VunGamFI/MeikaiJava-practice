package practice13_3;

public class handTest{
    public static void main(String[] args){
        Player[] p = new Player[2];

        p[0] = new Human();
        p[1] = new Computer();


        p[0].handing();
        p[1].handing();
    }
}