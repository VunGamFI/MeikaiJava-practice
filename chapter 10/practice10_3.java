class MinMax {
    public static int min;
    public static int max;

    public static int Min(int a, int b) {
        min = a;
        if (a > b) {
            min = b;
        }
        return min;
    }
    public static int Max(int a, int b) {
        max = b;
        if (a > b)
            max = a;
        return max;
    }
    public static int Min(int a, int b, int c) {
        min = a;
        if (min > b)
            min = b;
        if (min > c)
            min = c;
        return min;
    }
    public static int Max(int a, int b, int c) {
        max = a;
        if (max < b)
            max = b;
        if (max < c)
            max = c;
        return max;
    }
    public static int Min(int[] a) {
        min = a[0];
        for (int i = 1; i < a.length; i++)
            if (min > a[i])
                min = a[i];
        return min;
    }
    public static int Max(int[] a) {
        max = a[0];
        for (int i = 1; i < a.length; i++)
            if (max < a[i])
                max = a[i];
        return max;
    }
}

public class practice10_3{
    public static void main(String[] args){
        int a = 100, b = 97, c = 171;
        int[] test = {1, 2, 0, 9, 19, 3};

        System.out.println("a、b中最大值是" + MinMax.Max(a, b));
        System.out.println("a、b中最小值是" + MinMax.Min(a, b));
        System.out.println("a、b、c中最大值是" + MinMax.Max(a, b, c));
        System.out.println("a、b、c中最小值是" + MinMax.Min(a, b, c));
        System.out.println("数组中最大值是" + MinMax.Max(test));
        System.out.println("数组中最小值是" + MinMax.Min(test));
    }
}