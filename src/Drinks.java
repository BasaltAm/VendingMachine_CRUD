public class Drinks extends Vender{
    private String name;
    private String type;

    private int ml;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }


    public void outPut(String name){
        System.out.println("음료 "+name+"가 나왔습니다");
    }

    public void stock(String name, int price){
        this.name = name;
        this.setPrice(price);
    }
}
