import java.util.Scanner;

public class VendingMachine{
    Vender vender = new Vender();
    Scanner sc = new Scanner(System.in);
    int inputMoney = 0;
    int leftMoney =0;
    static int changeMoney = 0;
    Drinks drink = new Drinks();
    Drinks drinks1 = new Drinks();
    public void process(){
        while(true){
            menuUi();
            inputMoneyCondition();
        }
    }
    public void menu1(){
        drink.setAll("콜라",150,"탄산 음료",900);
        functionLogic();
    }
    public void menu2(){
        drink.setAll("환타",150, "탄산 음료", 700);
        functionLogic();
    }

    public void menu3(){
        drink.setAll("미란다",150,"탄산 음료",600);
        functionLogic();
    }
    public void menu4(){
        drink.setAll("오로나민C", 150, "탄산 음료", 500);
        functionLogic();
    }

    public void menu5(){
        drink.setAll("2%",500,"이온 음료", 1500);
        functionLogic();
    }

    public void menu6(){
        drink.setAll("가스 활명수",150, "자양 강장제", 500);
        functionLogic();
    }
    private void inputMoneyCondition(){
        vender.input();
        inputMoney = sc.nextInt();
        if(inputMoney<=1000) {
            vender.selectMenu();
            int selectMenu = sc.nextInt();
            switch (selectMenu) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                case 3:
                    menu3();
                    break;
                case 4:
                    menu4();
                    break;
                case 5:
                    menu5();
                    break;
                case 6:
                    menu6();
                    break;
            }
            }else{
            vender.wrong();
            return;
        }
    }
    private void functionLogic() {
        if(inputMoney > drink.getPrice()){
            leftMoney = inputMoney- drink.getPrice();
            String name = drink.getName();
            drink.outPut(name);
            vender.giveBack(leftMoney);
            //TODO: 잔돈을 반환 하시겠습니까?
            changeMoney += leftMoney;


        }else if(inputMoney< drink.getPrice()){
            changeMoney += inputMoney;
        }else{
            String name = drink.getName();
            drink.outPut(name);
        }
    }


        public static void menuUi(){
            System.out.println("------------------------------------------");
            System.out.println("----              ----                ----");
            System.out.println("콜라                환타                미란다");
            System.out.println(" 1                  2                   3");
            System.out.println("900                700                 600");
            System.out.println("----              ----                ----");
            System.out.println("------------------------------------------");
            System.out.println("----              ----                ----");
            System.out.println("오로나민C            2%               가스활명수");
            System.out.println(" 4                  5                    6");
            System.out.println("500               1500                  500");
            System.out.println("----              ----                ----");
            System.out.println("------------------------------------------");

        }
    public static void main(String[] args) {
        VendingMachine main = new VendingMachine();
        main.process();



    }
}
