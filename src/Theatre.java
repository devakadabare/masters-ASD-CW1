import java.time.LocalTime;

class Theatre extends Attarction {
    private int numberOfSeats;
    
    // create constructor
    public Theatre(
        int id, 
        String name, 
        LocalTime openingTime, 
        LocalTime closingTime, 
        double ticketPrice,
        int numberOfSeats, 
        String address
    ) {
        super(id, name, openingTime, closingTime, ticketPrice,address);
        this.numberOfSeats = numberOfSeats;
    }

     // getter for numberOfSeats
    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}