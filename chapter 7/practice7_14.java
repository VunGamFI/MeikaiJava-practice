import java.util.Scanner;
class practice7_14 {
    static void printBits(int x){
        for(int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    //n 位以前的数字设为 0
    static int restR(int x, int pos, int n){
        int restR = x >> (pos + n - 1);
        restR <<= (pos + n - 1);
        return restR;
    }
    //pos 位以后的数字设为 0
    static int restL(int x, int pos, int n){
        int restL = x << (32 - pos + 1);
        restL >>>= (32 - pos + 1);
        return restL;
    }
    //pos 位以后的数字设为 1
    static int restM_1(int pos, int n){
        int restM_1 = 1 << 31;
        restM_1 >>= (32 - pos);
        restM_1 <<= (32 - (pos + n - 1));
        restM_1 >>>= (32 - (pos + n - 1));
        return restM_1;
    }
    //pos 到 n 位的数字取反
    static int restM_inver(int x, int pos, int n){
        int restM_inver = ~x;
        restM_inver >>= (pos - 1);
        restM_inver <<= (32 - n);
        restM_inver >>>= (32 - (pos + n - 1));
        return restM_inver;
    }

    static int setN(int x, int pos, int n){
        int moveL = restR(x, pos, n);
        int moveM = restM_1(pos, n);
        int moveR = restL(x, pos, n);
        return (moveL + moveM + moveR);
    }
    static int resetN(int x, int pos, int n){
        int moveL = restR(x, pos, n);
        int moveR = restL(x, pos, n);
        return (moveL + moveR);
    }
    static int inverseN(int x, int pos, int n){
        int moveL = restR(x, pos, n);
        int moveM = restM_inver(x, pos, n);
        int moveR = restL(x, pos, n);
        return (moveL + moveM + moveR);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int input = stdIn.nextInt();
        System.out.print("开始位数：");
        int start = stdIn.nextInt();
        System.out.print("连续位数：");
        int end = stdIn.nextInt();

        System.out.print("位构成 = ");
        printBits(input);
        System.out.print("\n设为1后的位构成 = ");
        printBits(setN(input, start, end));
        System.out.print("\n设为0后的位构成 = ");
        printBits(resetN(input, start, end));
        System.out.print("\n设为取反后的位构成 = ");
        printBits(inverseN(input, start, end));
    }
}