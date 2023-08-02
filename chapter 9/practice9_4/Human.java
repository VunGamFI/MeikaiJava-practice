package practice9_4;
public class Human {
    private String name;
    private int height;
    private int weight;
    private Day birthday;

    public Human(String name, int height, int weight, Day birthday){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = new Day(birthday);
    }

    public String getName() {   return name;    }
    public int getHeight() {   return height;  }
    public int getWeight() {   return weight;  }
    public Day getBirthday(){
        return new Day(birthday);
    }

    public void humaninfo(){
        System.out.println("名字：" + name);
        System.out.println("身高：" + height + "cm");
        System.out.println("体重：" + weight + "kg");
    }
}