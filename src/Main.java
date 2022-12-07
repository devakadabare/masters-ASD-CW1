import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Park park = new Park(
                1,
                "Park_1",
                LocalTime.of(10, 0),
                LocalTime.of(18, 30),
                "Park_1_Address",
                18);
        Park park2 = new Park(
                2,
                "Park_2",
                LocalTime.of(9, 30),
                LocalTime.of(23, 0),
                "Park_2_Address",
                18);

        Theatre theatre = new Theatre(
                3,
                "Theatre_1",
                LocalTime.of(12, 0),
                LocalTime.of(22, 0),
                2.0,
                100,
                "Theatre_1_Address");
        Theatre theatre2 = new Theatre(
                4,
                "Theatre_2",
                LocalTime.of(11, 0),
                LocalTime.of(17, 0),
                0,
                100,
                "Theatre_2_Address");

        Museum museum = new Museum(
                5,
                "Museum_1",
                LocalTime.of(8, 0),
                LocalTime.of(18, 0),
                5.0,
                "Art",
                "Museum_1_Address");
        Museum museum2 = new Museum(
                6, "Museum_2",
                LocalTime.of(10, 0),
                LocalTime.of(20, 0),
                5.0,
                "History",
                "Museum_2_Address");

        // create list
        List<Attarction> attractionList = new ArrayList<>();
        attractionList.add(park);
        attractionList.add(park2);

        attractionList.add(theatre);
        attractionList.add(theatre2);

        attractionList.add(museum);
        attractionList.add(museum2);

        // filter
        attractionList.stream()
                .filter((attraction) -> attraction.getTicketPrice() > 1)
                .filter((attraction) -> attraction.getClosingTime().isAfter(LocalTime.of(19, 0)))
                .forEach((attraction) -> {
                    System.out.println("Id: " + attraction.getId());
                    System.out.println("Name: " + attraction.getName());
                    System.out.println("Opening Time: " + attraction.getOpeningTime());
                    System.out.println("Closing Time: " + attraction.getClosingTime());
                    System.out.println("Address: " + attraction.getAddress());

                    // get museum type
                    if (attraction instanceof Museum) {
                        Museum museum1 = (Museum) attraction;
                        System.out.println("Museum Type: " + museum1.getMuseumType());
                    }
                    // get age limit
                    if (attraction instanceof Park) {
                        Park park1 = (Park) attraction;
                        System.out.println("Age Limit: " + park1.getAgeLimit());
                    }
                    // get number of seats
                    if (attraction instanceof Theatre) {
                        Theatre theatre1 = (Theatre) attraction;
                        System.out.println("Number of Seats: " + theatre1.getNumberOfSeats());
                    }
                    System.out.println();
                });
    }

}
