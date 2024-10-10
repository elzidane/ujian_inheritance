public class Vehicel {
    private int numWheels;
    private double price;

    public double pakaidiskon(double presentasiDiskon){
        return price - (price * presentasiDiskon / 100);
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicel(){
        numWheels = 0;
        price = 0;
    }

    public Vehicel(int numWheels, double price){
        this.numWheels = numWheels;
        this.price = price;
    }

    public void print(){
        System.out.println("number wheels: " + numWheels);
        System.out.println("Price: " + price);
    }
}
