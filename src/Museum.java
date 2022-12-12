import java.time.LocalTime;

class Museum extends Attarction {
    private String museumType;
    private String contact;

    // create constructor
    public Museum(
            int id,
            String name,
            LocalTime openingTime,
            LocalTime closingTime,
            double price,
            String museumType,
            String address,
            String contact) {
        super(id, name, openingTime, closingTime, price, address);
        
        this.museumType = museumType;
        this.contact = contact;
    }

    // getters
    public String getMuseumType() {
        return museumType;
    }

    public String getContact() {
        return contact;
    }

    // print all attributes
    public void print() {
        super.print();
        System.out.println("Museum Type: " + museumType);
        System.out.println("Contact: " + contact);
    }
}