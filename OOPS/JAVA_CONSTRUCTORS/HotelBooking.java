package OOPS.JAVA_CONSTRUCTORS;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1: " + booking1.guestName + ", Room Type: " + booking1.roomType + ", Nights: " + booking1.nights);

        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        System.out.println("Booking 2: " + booking2.guestName + ", Room Type: " + booking2.roomType + ", Nights: " + booking2.nights);

        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 (copy of Booking 2): " + booking3.guestName + ", Room Type: " + booking3.roomType + ", Nights: " + booking3.nights);
    }
}
