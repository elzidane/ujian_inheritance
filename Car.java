public class Car extends Vehicel{
    private int numDoors;
    private boolean isElectric;


    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    // public Car(){
    //     super();
    //     numDoors = 0;
    //     isElectric = true;
    // }

    public Car(int numWheels, double price, int numDoors, boolean isElectric){
        super(numWheels, price);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    @Override

    public void print(){
        super.print();
        System.out.println("Number doors: " + numDoors);
        System.out.println("is electric: " + isElectric);
    }
}
