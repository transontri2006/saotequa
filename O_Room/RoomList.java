package O_Room;

import java.util.ArrayList;

public class RoomList {
    private ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void updateRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                room.updateRoom();
                return;
            }
        }
        System.out.println("Room ID not found: " + id);
    }

    public void deleteRoomById(String id) {
        roomList.removeIf(room -> room.getId().equals(id));
    }

    public void findRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                room.displayDetails();
                return;
            }
        }
        System.out.println("Room not found.");
    }

    public void displayAllRooms() {
        if (roomList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            for (Room room : roomList) {
                room.displayDetails();
            }
        }
    }

    public void countRooms() {
        int meetingRooms = 0;
        int bedRooms = 0;
        for (Room room : roomList) {
            if (room instanceof MeetingRoom) {
                meetingRooms++;
            } else if (room instanceof BedRoom) {
                bedRooms++;
            }
        }
        System.out.println("Meeting Rooms: " + meetingRooms + ", Bed Rooms: " + bedRooms);
    }
}

