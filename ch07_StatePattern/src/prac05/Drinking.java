package prac05;

public class Drinking {
    private int price;
    private int stock;

    public Drinking(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public void dispense() {
        this.stock--;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}
