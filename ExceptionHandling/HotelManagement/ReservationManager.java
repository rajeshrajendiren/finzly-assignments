import java.util.ArrayList;
import java.util.List;
class ReservationManager {
    private List<Reservation> reservations;
    private int nextReservationId;

    public ReservationManager() {
        reservations = new ArrayList<>();
        nextReservationId = 1;
    }

    // Create a new reservation
    public void makeReservation(Guest guest, String reservationType) throws InvalidReservationException {
        if (reservationType.isEmpty()) {
            throw new InvalidReservationException("Reservation type cannot be empty.");
        }

        Reservation reservation = new Reservation(nextReservationId++, guest, reservationType);
        reservations.add(reservation);
    }
}
