package practice13_1;

import java.util.Scanner;

class ShapeTester{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int select, length, width, height;

        System.out.print("图形的个数：");
        int num = stdIn.nextInt();

        Shape[] p = new Shape[num];

        for(int i = 0; i < num; i++){
            System.out.print((i + 1) + "号图形的种类（1 --- 点 / 2 --- 横线 / 3 --- 竖线 / 4 --- 长方形）：");
            select = stdIn.nextInt();
            switch(select){
                case 1 : p[i] = new Point();    break;
                case 2 : {
                    System.out.print("长度：");
                    length = stdIn.nextInt();
                    p[i] = new HorzLine(length);
                    break;
                }
                case 3 : {
                    System.out.print("长度：");
                    length = stdIn.nextInt();
                    p[i] = new VertLine(length);
                    break;
                }
                case 4 : {
                    System.out.print("长：");
                    width = stdIn.nextInt();
                    System.out.print("宽：");
                    height = stdIn.nextInt();
                    p[i] = new Rectangle(width, height);
                    break;
                }
            }
        }
        for(Shape s : p){
            s.print();
            System.out.println();
        }
    }
}