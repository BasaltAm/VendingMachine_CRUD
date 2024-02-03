public class Drinks extends Vender{
    private String name;
    private String type;

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
    public void stock(String name, int price){
        this.name = name;
        this.setPrice(price);
    }
}
