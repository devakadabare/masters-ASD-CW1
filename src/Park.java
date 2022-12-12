import java.time.LocalTime;

public class Park extends Attarction {
    private int ageLimit;
    private double area;
    private static double price = 0;
    

    public Park(
            int id,
            String name,
            LocalTime openingTime,
            LocalTime closingTime,
            String address,
            int ageLimit,
            double area
            ) {
        super(id, name, openingTime, closingTime, price, address);
        this.ageLimit = ageLimit;
        this.area = area;
    }

    // getters
    public int getAgeLimit() {
        return ageLimit;
    }

    public double getArea() {
        return area;
    }

    //print all attributes
    public void print(){
        super.print();
        System.out.println("Age Limit: " + ageLimit);
        System.out.println("Area: " + area);
    }

}
