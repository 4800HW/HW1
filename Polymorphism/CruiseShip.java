package Polymorphism;

public class CruiseShip extends Ship {

    private int maxNumOfPassengers;

    public CruiseShip(String shipName, String yearBuilt, int maxNumOfPassengers) {
        super(shipName, yearBuilt);
        this.maxNumOfPassengers = maxNumOfPassengers;
    }

    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    public void setMaxNumOfPassengers(int maxNumOfPassengers) {
        this.maxNumOfPassengers = maxNumOfPassengers;
    }
    
    @Override
    public void printInfo()
    {
        System.out.println("Ship name: " + super.getShipName() + "\nMax Number of Passengers: " + maxNumOfPassengers + "\n");
    }
}
