package O_Room;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void updateRoom(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                room.updateRoom();
                return;
            }
        }
        System.out.println("Not found id: " + id);
    }

    public void deleteRoom(String id) {

        if (roomList.isEmpty()) {
            System.out.println("0 room");
            return;
        }

        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getId().equals(id)) {
                roomList.remove(i);
                return;
            }
        }

        System.out.println("Not found id: " + id);
    }

    public void findRoomById(String id) {
        for (Room room : roomList) {
            if (room.getId().equals(id)) {
                room.displayDetails();
                return;
            }
        }

        System.out.println("Not found id: " + id);
    }

    public void displayAllRooms() {
        if (roomList.isEmpty()) {
            System.out.println("No rooms available.");
            return;
        }

        for (Room room : roomList) {
            room.displayDetails();
        }
    }

    public void countRooms() {
        int numberOfMeetingRoom = 0;
        int numberOfBedRoom = 0;

        for (Room room : roomList) {
            if (room instanceof MeetingRoom) {
                numberOfMeetingRoom++;
            } else if (room instanceof BedRoom) {
                numberOfBedRoom++;
            }
        }

        System.out.println("MeetingRoom: " + numberOfMeetingRoom);
        System.out.println("BedRoom: " + numberOfBedRoom);
    }
}