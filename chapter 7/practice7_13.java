import java.util.Scanner;
class practice7_13{
    static void printBits(int x){
        for(int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    static int set(int x, int pos){
        int restL = 1 << 31;
        restL >>= pos - 1;
        restL >>>= 32 - pos;
        return (reset(x, pos) + restL);
    }
    static int reset(int x, int pos){
        int rest_0 = x >> pos;
        rest_0 <<= pos;
        return rest_0;
    }
    static int inverse(int x, int pos){
        int rest_inver = ~x;
        rest_inver <<= 32 - pos;
        rest_inver >>>= 32 - pos;
        return(reset(x, pos) + rest_inver);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int input = stdIn.nextInt();
        System.out.print("更改位数：");
        int change = stdIn.nextInt();

        System.out.print("位构成：");
        printBits(input);
        System.out.print("\n设为1后的位构成 = ");
        printBits(set(input, change));
        System.out.print("\n设为0后的位构成 = ");
        printBits(reset(input, change));
        System.out.print("\n取反后的位构成 = ");
        printBits(inverse(input, change));
    }
}