package practice11_1;
import practice11_1.id.DateId;
class DateIdTester{
    public static void main(String[] args){
        DateId a = new DateId();
        DateId b = new DateId();
        DateId c = new DateId();

        System.out.println("a的标识编号：" + a.getId());
        System.out.println("b的标识编号：" + b.getId());
        System.out.println("c的标识编号：" + c.getId());
    }
}