public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("ram", "123-456-7890");
        Guest guest2 = new Guest("raju", "987-654-3210");

        Room room1 = new Room(101, "Standard");
        Room room2 = new Room(201, "Deluxe");
        Room room3 = new Room(301, "Suite");

        RoomManager roomManager = new RoomManager();
        roomManager.addRoom(room1);
        roomManager.addRoom(room2);
        roomManager.addRoom(room3);

        ReservationManager reservationManager = new ReservationManager();

        try {
            reservationManager.makeReservation(guest1, "Room");
            room1.reserveRoom();
            System.out.println("Reservation made for " + guest1.getName() + " in " + room1.getRoomType() + " room.");
        } catch (InvalidReservationException e) {
            System.err.println("Error: " + e.getMessage());
        }

        // Example: Check room availability
        try {
            boolean isAvailable = roomManager.isRoomAvailable(101);
            System.out.println("Room 101 is available: " + isAvailable);
        } catch (RoomNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}