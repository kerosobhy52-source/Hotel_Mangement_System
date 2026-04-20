import java.util.ArrayList;
import java.time.LocalDate;

public class HotelDatabase {


    public static ArrayList<Guest> guests = new ArrayList<>();
    public static ArrayList<Room> rooms = new ArrayList<>();
    public static ArrayList<Reservation> reservations = new ArrayList<>();
    public static ArrayList<Invoice> invoices = new ArrayList<>();
    public static ArrayList<RoomType> roomTypes = new ArrayList<>();
    public static ArrayList<Amenity> amenities = new ArrayList<>();

    static {
        initializeData();
    }


    private static void initializeData() {


        RoomType single = new RoomType("Single", 500, 1);
        RoomType doubleRoom = new RoomType("Double", 800, 2);
        RoomType suite = new RoomType("Suite", 1500, 4);

        roomTypes.add(single);
        roomTypes.add(doubleRoom);
        roomTypes.add(suite);


        Amenity wifi = new Amenity("WiFi");
        Amenity tv = new Amenity("TV");
        Amenity minibar = new Amenity("Mini-bar");

        amenities.add(wifi);
        amenities.add(tv);
        amenities.add(minibar);


        Room r1 = new Room(101, single);
        r1.addAmenity(wifi);
        r1.addAmenity(tv);

        Room r2 = new Room(102, doubleRoom);
        r2.addAmenity(wifi);
        r2.addAmenity(tv);
        r2.addAmenity(minibar);

        Room r3 = new Room(201, suite);
        r3.addAmenity(wifi);
        r3.addAmenity(tv);
        r3.addAmenity(minibar);

        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);


        Guest g1 = new Guest("ahmed", "Pass@123",
                LocalDate.of(2000, 5, 10),
                5000, "Cairo", Gender.MALE, "Suite");

        Guest g2 = new Guest("sara", "Sara@123",
                LocalDate.of(1998, 8, 20),
                3000, "Alex", Gender.FEMALE, "Double");

        guests.add(g1);
        guests.add(g2);

        Reservation res1 = new Reservation(
                g1, r1,
                LocalDate.now().plusDays(1),
                LocalDate.now().plusDays(4)
        );

        reservations.add(res1);


        Invoice inv1 = new Invoice(res1);
        inv1.addPayment(500, PaymentMethod.CASH);

        invoices.add(inv1);
    }
}