package practice14_2;

public class Pet{
    private String name;
    private String masterName;

    public Pet(String name, String masterName){
        this.name = name;
        this.masterName = masterName;
    }

    public String getName() { return name; }

    public String getMasterName() { return masterName; }

    public void introduce(){
        System.out.println("■我的名字是" + name + "| ");
        System.out.println("■我的主人是" + masterName + "| ");
    }
}
