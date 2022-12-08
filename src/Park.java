import java.time.LocalTime;

public class Park extends Attarction {
    private int ageLimit;
    private static double price = 0;

    public Park(
            int id,
            String name,
            LocalTime openingTime,
            LocalTime closingTime,
            String address,
            int ageLimit) {
        super(id, name, openingTime, closingTime, price, address);
        this.ageLimit = ageLimit;
    }

    // getter for ageLimit
    public int getAgeLimit() {
        return ageLimit;
    }

}
