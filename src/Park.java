import java.time.LocalTime;

public class Park extends Attarction {
    private int ageLimit;
    private static double ticketPrice = 0;


    
    public Park(
        int id, 
        String name, 
        LocalTime openingTime, 
        LocalTime closingTime, 
        String address, 
        int ageLimit
    ) {
        super(id, name, openingTime, closingTime, ticketPrice, address);
        this.ageLimit = ageLimit;
    }

    // getter for ageLimit
    public int getAgeLimit() {
        return ageLimit;
    }

}
