package shop;

public class Goods extends AbstractGoods {
    String name;
    double price;

    public Goods(String n, double p) {
        this.name = n;
        this.price = p;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}