package practice14_2;

public class PetTester{
    public static void main(String[] args){
        Pet[] a = {
                new Pet("Kurt", "艾一"),
                new RobotPet("R2D2", "卢克"),
                new RobotPet("L2D2", "辛文"),
        };

        for(int i = 0; i < a.length; i++){
            a[i].introduce();
        }
        RobotPet robot = new RobotPet("755U", "卫辛");
        robot.ChangeSkin(Skinnable.GREEN);
    }
}