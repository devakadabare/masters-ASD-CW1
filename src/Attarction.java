import java.time.LocalTime;

public class Attarction {
    private int id;
    private String name;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private double price;
    private String currency = "GBP";
    private String address;

    // create constructor
    public Attarction(
            int id,
            String name,
            LocalTime openingTime,
            LocalTime closingTime,
            double price,
            String address) {
        this.id = id;
        this.name = name;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }

    public String getAddress() {
        return address;
    }

}
