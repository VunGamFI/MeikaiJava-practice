package practice14_2;

public class RobotPet extends Pet implements Skinnable{
    public RobotPet(String name, String masterName){
        super(name, masterName);
    }

    @Override public void introduce(){
        System.out.println("◇我是机器人。名字是" + getName() + "。");
        System.out.println("◇我的主人是" + getMasterName() + "。");
    }

    public void work(int sw){
        switch(sw){
            case 0 : System.out.println("打扫。");     break;
            case 1 : System.out.println("洗衣粉。");    break;
            case 2 : System.out.println("做饭。");     break;
        }
    }

    public void ChangeSkin(int skin){
        System.out.print("皮肤换成了");
        switch(skin){
            case BLACK : System.out.print("乌黑");    break;
            case RED : System.out.print("深红");      break;
            case GREEN : System.out.print("柳叶");    break;
            case BLUE : System.out.print("雾草");     break;
            case LEOPARD : System.out.print("豹纹");  break;
            default : System.out.print("素色");       break;
        }
        System.out.println("。");
    }
}