package practice13_3;

public class handTest{
    public static void main(String[] args){
        Player[] p = new Player[2];

        p[0] = new Human();
        p[1] = new Computer();

        System.out.print("人的手势：");
        p[0].handing();
        System.out.println();
        System.out.print("机器人的手势：");
        p[1].handing();
    }
}