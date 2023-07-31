package practice8_1;
class Human{
    private String name;
    private int height;
    private int weight;
    Human(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    void humaninfo(){
        System.out.println("名字：" + name);
        System.out.println("身高：" + height + "cm");
        System.out.println("体重：" + weight + "kg");
    }
    String getName() {   return name;    }
    int getHeight() {   return height;  }
    int getWeight() {   return weight;  }
}