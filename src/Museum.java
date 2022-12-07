import java.time.LocalTime;

class Museum extends Attarction {
    private String museumType;

    // create constructor
    public Museum(
        int id, 
        String name, 
        LocalTime openingTime, 
        LocalTime closingTime, 
        double ticketPrice,
        String museumType, 
        String address
    ) {
        super(id, name, openingTime, closingTime, ticketPrice, address);
        // if there is no ticketPrice set ticketPrice to 0
        if (ticketPrice == 0) {
            ticketPrice = 0;
        }

        this.museumType = museumType;
    }

    // getter for museumType
    public String getMuseumType() {
        return museumType;
    }

}