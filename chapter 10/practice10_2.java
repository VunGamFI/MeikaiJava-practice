import java.util.Scanner;
class ExId{
    static int counter = 0;
    static int n = 1;
    private int id;
    public ExId(){
        id = counter + n;
        counter = id;
    }
    public static void setN(int n){
        ExId.n = n;
    }

    public int getId(){
        return id;
    }
    static int getMaxID(){
        return counter;
    }
}

public class practice10_2{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        ExId a = new ExId();
        ExId b = new ExId();
        ExId c = new ExId();

        System.out.print("递增值：");
        int n = stdIn.nextInt();

        ExId.setN(n);

        ExId d = new ExId();
        ExId e = new ExId();
        ExId f = new ExId();
        ExId g = new ExId();

        System.out.println("a的标识编号：" + a.getId());
        System.out.println("b的标识编号：" + b.getId());
        System.out.println("c的标识编号：" + c.getId());
        System.out.println("d的标识编号：" + d.getId());
        System.out.println("e的标识编号：" + e.getId());
        System.out.println("f的标识编号：" + f.getId());
        System.out.println("g的标识编号：" + g.getId());

        System.out.println("Id.counter = " + ExId.counter);
        System.out.println("a.counter = " + a.counter);
        System.out.println("b.counter = " + b.counter);

        System.out.println("最后赋值的标识编号为：" + ExId.getMaxID());
    }
}