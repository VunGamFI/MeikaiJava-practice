import java.util.Random;
class practice6_11{
    public static void main(String[] args){
        Random rand = new Random();

        System.out.print("元素个数：");
        int total = rand.nextInt(10) + 1;
        System.out.println(total);

        int[] a = new int[total];

        for(int j = 0; j < total; j++){
            a[j] = rand.nextInt(10) + 1;
        }

        int i;
        Outer:
        for(i = 0; i < total; i++){
            int j = 0;
            for(; j < total; j++){
                if(a[i] == a[j] && i != j){
                    a[j] = rand.nextInt(10) + 1;
                    i = 0;
                    continue Outer;
                }
            }
        }

        System.out.print("该数组的元素为{ ");
        for(int j = 0; j < total; j++)
            System.out.print(a[j] + " ");
        System.out.println("}");
    }
}