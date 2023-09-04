class Reservation {
    private int reservationId;
    private Guest guest;
    private String reservationType;

    public Reservation(int reservationId, Guest guest, String reservationType) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.reservationType = reservationType;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public String getReservationType() {
        return reservationType;
    }
}