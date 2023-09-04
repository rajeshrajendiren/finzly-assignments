class Room {
    private int roomId;
    private String roomType;
    private boolean isAvailable;

    public Room(int roomId, String roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isAvailable = true;
    }

    // Getter methods for roomId, roomType, and isAvailable
    public int getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void reserveRoom() {
        isAvailable = false;
    }

    // Method to release the room
    public void releaseRoom() {
        isAvailable = true;
    }
}
