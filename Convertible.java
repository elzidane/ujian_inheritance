public class Convertible extends Car {
    private String roofType;

    public String getRoofType() {
        return roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    // public Convertible(double price, int numWheels, int numDoors, boolean isElectric){
    //     super(numWheels, price, numDoors, isElectric);
    //     roofType = "";
    // }

    public Convertible (int numDoors, boolean isElectric, int numWheels, double price, String rooftype){
        super(numWheels, price, numDoors, isElectric);
        this.roofType = rooftype;
    }

    @Override

    public void print(){
        super.print();
        System.out.println("rooft type: " + roofType);
    }
}
