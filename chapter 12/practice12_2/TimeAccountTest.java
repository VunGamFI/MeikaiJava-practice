package practice12_2;

class TimeAccountTest{
    public static void main(String[] args){
        Account adachi = new Account("足立幸一", "123456", 1000);
        TimeAccount nakata = new TimeAccount("中田真二", "654321", 800, 500);
        TimeAccount test = new TimeAccount("测试", "275121", 600, 900);

        switch(TimeAccount.compBalance(adachi, nakata)){
            case 0: System.out.println("两个人的存款一样多。");   break;
            case 1: System.out.println(adachi.getName() + "的存款多。");   break;
            case -1: System.out.println(nakata.getName() + "的存款多。");   break;
        }

        switch(TimeAccount.compBalance(nakata, test)){
            case 0: System.out.println("两个人的存款一样多。");   break;
            case 1: System.out.println(nakata.getName() + "的存款多。");   break;
            case -1: System.out.println(test.getName() + "的存款多。");   break;
        }
    }
}