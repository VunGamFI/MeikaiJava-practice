class Id{
    static int counter = 0;
    private int id;
    public Id(){
        id = ++counter;
    }
    public int getId(){
        return id;
    }
    static int getMaxID(){
        return counter;
    }
}

public class practice10_1{
    public static void main(String[] args){
        Id a = new Id();
        Id b = new Id();
        Id c = new Id();

        System.out.println("a的标识编号：" + a.getId());
        System.out.println("b的标识编号：" + b.getId());

        System.out.println("Id.counter = " + Id.counter);
        System.out.println("a.counter = " + a.counter);
        System.out.println("b.counter = " + b.counter);

        System.out.println("最后赋值的标识编号为：" + Id.getMaxID());
    }
}