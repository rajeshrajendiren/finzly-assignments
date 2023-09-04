import java.util.HashMap;
import java.util.Map;
class RoomManager {
    private Map<Integer, Room> rooms;

    public RoomManager() {
        rooms = new HashMap<>();
    }

    // Add a room to the manager
    public void addRoom(Room room) {
        rooms.put(room.getRoomId(), room);
    }

    // Get room by roomId
    public Room getRoomById(int roomId) throws RoomNotFoundException {
        Room room = rooms.get(roomId);
        if (room == null) {
            throw new RoomNotFoundException("Room not found with ID: " + roomId);
        }
        return room;
    }

    public boolean isRoomAvailable(int roomId) throws RoomNotFoundException {
        Room room = getRoomById(roomId);
        return room.isAvailable();
    }
}