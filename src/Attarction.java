import java.time.LocalTime;

public class Attarction {
    private int id;
    private String name;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private double ticketPrice;
    private String address;

    // create constructor
    public Attarction(
            int id,
            String name,
            LocalTime openingTime,
            LocalTime closingTime,
            double ticketPrice,
            String address
    ) {
        this.id = id;
        this.name = name;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.ticketPrice = ticketPrice;
        this.address = address;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getAddress() {
        return address;
    }

}
