import java.util.Scanner;

public class Main {
    Vender vender = new Vender();
    Scanner sc = new Scanner(System.in);
    int inputMoney = 0;
    int leftMoney =0;
    int changeMoney = 0;
    Drinks drink = new Drinks();
    public void process(){
        while(true){
            menuUi();
            vender.input();
            inputMoney = sc.nextInt();
            vender.selectMenu();
            int selectMenu = sc.nextInt();
            switch (selectMenu){
                case 1:
                    menu1();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }

        }

    }
    public void menu1(){
        drink.setAll("콜라",150,"탄산 음료",900);
        if(inputMoney > drink.getPrice()){
            leftMoney = inputMoney- drink.getPrice();
            vender.giveBack(leftMoney);
            String name = drink.getName();
            drink.outPut(name);
            //TODO: 잔돈을 반환 하시겠습니까?
            changeMoney += leftMoney;

        }else if(inputMoney< drink.getPrice()){
            changeMoney += inputMoney;
        }else{

        }
    }
        public static void menuUi(){
            System.out.println("------------------------------------------");
            System.out.println("----              ----                ----");
            System.out.println("콜라                환타                미란다");
            System.out.println(" 1                  2                   3");
            System.out.println("----              ----                ----");
            System.out.println("------------------------------------------");
            System.out.println("----              ----                ----");
            System.out.println("오로나민씨            2%               가스활명수");
            System.out.println(" 4                  5                    6");
            System.out.println("----              ----                ----");
            System.out.println("------------------------------------------");

        }
    public static void main(String[] args) {
        Main main = new Main();
        main.process();



    }
}
