import java.util.Scanner;

class RangeError extends RuntimeException{
    RangeError(int n) { super("超出范围的数值：" + n); }
}

class ParameterRangeError extends RangeError{
    ParameterRangeError(int n) { super(n); }
}

class ResultRangeError extends RangeError{
    ResultRangeError(int n) { super(n); }
}

public class practice16_2{
    static boolean isValid(int n){
        return n >= 0 && n <= 9;
    }

    static int add(int a, int b) throws ParameterRangeError, RangeError{
        if(!isValid(a)) throw new ParameterRangeError(a);
        if(!isValid(b)) throw new ParameterRangeError(b);
        int result = a + b;
        if(!isValid(result)) throw new ResultRangeError(result);
        return result;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("整数a：");   int a = stdIn.nextInt();
        System.out.print("整数b：");   int b = stdIn.nextInt();

        try{
            System.out.println("它们的和为" + add(a, b) + "。");
        }catch(ParameterRangeError | ResultRangeError e){
            if(!isValid(a)|| !isValid(b))
                System.out.println("加数超出范围。" + e.getMessage());
            else if(!isValid(a + b))
                System.out.println("计算结果超出范围。" + e.toString());
        }
    }
}