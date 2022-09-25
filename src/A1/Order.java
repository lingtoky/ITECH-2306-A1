package A1;

public class Order {
    private String dishName;
    private double dishPrice;
    private int per;

    public Order() {
    }

    public Order(String dishName, double dishPrice, int per) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.per = per;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }
}
