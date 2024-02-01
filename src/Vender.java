public class Vender {

    private int price;
    private int change;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getChange() {
        return change;
    }

    public int setChange(int change) {
        this.change = change;
        return change;
    }

    public void input(){
        System.out.println("돈을 넣어 주세요.");
    }

    public void inputResult(){
        System.out.println("입력된 잔액은: "+price+"원 입니다.");
    }

    public void giveBack(int change){
        System.out.println("잔돈: "+change);
    }

    public void selectMenu(){
        System.out.println("메뉴를 선택해주세요.");
    }

}
