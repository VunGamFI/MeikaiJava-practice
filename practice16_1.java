import java.util.Scanner;

class practice16_1{
    static void test(int sw) throws Exception, RuntimeException{
        switch(sw){
            case 0 : throw new Exception("发生检查异常！！");
            case 1 : throw new RuntimeException("发生非检查异常！！");
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("sw：");
        int sw = stdIn.nextInt();

        try{
            test(sw);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}