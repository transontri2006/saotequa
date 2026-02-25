package O_Room;

import java.util.ArrayList;

public class RoomList {
    private ArrayList<Room> list = new ArrayList<>();

    public void addRoom(Room r) {
        list.add(r);
    }

    public boolean updateRoomById(String id) {
        for (Room r : list) {
            if (r.getId().equals(id)) {
                r.updateRoom();
                return true;
            }
        }
        return false;
    }

    public boolean deleteRoomById(String id) {
        return list.removeIf(r -> r.getId().equals(id));
    }

    public Room findRoomById(String id) {
        for (Room r : list) {
            if (r.getId().equals(id)) return r;
        }
        return null;
    }

    public void displayAllRooms() {
        if (list.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Room r : list) {
            r.displayDetails();
            System.out.println("\n-----------------");
        }
    }

    public void countRooms() {
        int m = 0, b = 0;
        for (Room r : list) {
            if (r instanceof MeetingRoom) m++;
            else if (r instanceof BedRoom) b++; 
        }
        System.out.println("Meeting Rooms: " + m);
        System.out.println("Bed Rooms: " + b);
    }
}
