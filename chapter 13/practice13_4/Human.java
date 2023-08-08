package practice13_4;

import practice13_4.Day;

/**
 * 类Human是表示人类姓名、身高、体重、生日信息的类
 * @author VunGamFI
 * @see Day
 * @see humanInfo
 */
public class Human {
    private String name;
    private int height;
    private int weight;
    private practice13_4.Day birthday;

    /**
     * 创建人类信息的构造函数
     * @param name 姓名
     * @param height 身高
     * @param weight 体重
     * @param birthday 生日，属于类类型变量
     *                 通过类Day创建实例
     *                 {    public Day() { }
     *     public Day(int year) { this.year = year; }
     *     public Day(int year, int month) { this(year); this.month = month; }
     *     public Day(int year, int month, int date) { this(year, month); this.date = date;}
     *     public Day(Day d) { this(d.year, d.month, d.date); }}
     */
    public Human(String name, int height, int weight, practice13_4.Day birthday){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = new practice13_4.Day(birthday);
    }

    /**
     * 方法getName获取姓名
     * @return 姓名
     */
    public String getName() {   return name;    }

    /**
     * 方法getHeight获取身高
     * @return 身高
     */
    public int getHeight() {   return height;  }

    /**
     * 方法getWeight获取体重
     * @return 体重
     */
    public int getWeight() {   return weight;  }

    /**
     * 方法getBirthday获取生日
     * @return 生日
     */
    public practice13_4.Day getBirthday(){
        return new Day(birthday);
    }

    /**
     * 方法humaninfo设置姓名、身高、体重、生日信息
     */
    public void humaninfo(){
        System.out.println("名字：" + name);
        System.out.println("身高：" + height + "cm");
        System.out.println("体重：" + weight + "kg");
    }
}