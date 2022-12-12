import java.time.LocalTime;

class Theatre extends Attarction {

    private int noOfHalls;
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
            String contact,
            int noOfHalls) {
        super(id, name, openingTime, closingTime, price, address);
        this.numberOfSeats = numberOfSeats;
        this.contact = contact;
        this.noOfHalls = noOfHalls;
    }

    // getters
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getContact() {
        return contact;
    }

    public int getNoOfHalls() {
        return noOfHalls;
    }

    // print all attributes
    public void print() {
        super.print();
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Contact: " + contact);
        System.out.println("Number of Halls: " + noOfHalls);
    }
}