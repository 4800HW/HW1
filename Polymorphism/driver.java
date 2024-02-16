package Polymorphism;

public class driver {
    
    public static void main(String[] args)
    {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Ship", "1998");
        ships[1] = new CruiseShip("Cruise Ship", "1973", 500);
        ships[2] = new CargoShip("Cargo Ship", "1967", 100);

        for (int i = 0; i < ships.length; i++)
        {
            ships[i].printInfo();
        }
    }

}
