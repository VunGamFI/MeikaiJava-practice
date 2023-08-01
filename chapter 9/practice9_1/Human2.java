package practice9_1;
class Human2{
    private String name;
    private String gender;
    private int height;
    private int weight;
    private int year;
    private int month;
    private int date;

    Human2(String name, String gender, int height, int weight, int year, int month, int date){
        this.name = name;   this.gender = gender;
        this.height = height;   this.weight = weight;
        this.year = year;   this.month = month; this.date = date;
    }

    //获取名字、性别、身高、体重、年、月、日
    String getName() { return name; }
    String getGender() { return gender; }
    int getHeight() { return height; }
    int getWeight() { return weight; }
    int getYear() { return year; }
    int getMonth() { return month; }
    int getDate() { return date; }

    //设置名字、性别、身高、体重、年、月、日
    void setName(String name) { this.name = name; }
    void setGender(String gender) { this.gender = gender; }
    void setHeight(int height) { this.height = height; }
    void setWeight(int weight) { this.weight = weight; }
    void setYear(int year) { this.year = year; }
    void setMonth(int month) { this.month = month; }
    void setDate(int date) { this.date = date; }

    void set(String name, String gender, int height, int weight, int year, int month, int date){
        this.name = name;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.year = year;
        this.month = month;
        this.date = date;
    }

    //计算星期
    int dayOfWeek(){
        int y = year;
        int m = month;
        if(m == 1 || m == 2){
            y--;
            m += 12;
        }
        return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
    }
}
