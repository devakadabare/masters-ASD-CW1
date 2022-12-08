import java.time.LocalTime;

class Theatre extends Attarction {

    private int numberOfSeats;
    private String contact;

    // create constructor
    public Theatre(
            int id,
            String name,
            LocalTime openingTime,
            LocalTime closingTime,
            double price,
            int numberOfSeats,
            String address,
            String contact) {
        super(id, name, openingTime, closingTime, price, address);
        this.numberOfSeats = numberOfSeats;
        this.contact = contact;
    }

    // getters
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getContact() {
        return contact;
    }
}