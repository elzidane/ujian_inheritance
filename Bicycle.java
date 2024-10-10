
public class Bicycle extends Vehicel{
    private String bikeType;

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    // public Bicycle(int numWheels, double price, String bikeType1){
    //     super();
    //     bikeType = "";
    // }

    public Bicycle(int numWheels, double price, String bikeType){
        super(numWheels, price);
        this.bikeType = bikeType;
    }

    @Override

    public void print(){
        super.print();
        System.out.println("bike type: " + bikeType);
    }
}
