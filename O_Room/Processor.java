package O_Room;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RoomList roomList = new RoomList();
        int next;

        do {

            System.out.println("\n===== ROOM MANAGEMENT =====");
            System.out.println("0. Exit program");
            System.out.println("1. Add a room");
            System.out.println("2. Update a room");
            System.out.println("3. Find room by id");
            System.out.println("4. Delete a room");
            System.out.println("5. Display all rooms");
            System.out.println("6. Count each room individually");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {

                case 0:
                    System.out.println("Exit program");
                    break;

                case 1:
                    System.out.print("Enter MeetingRoom(1) / BedRoom(2): ");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    if (type == 1) {
                        MeetingRoom m = new MeetingRoom();
                        m.addRoom();
                        roomList.addRoom(m);
                    } else if (type == 2) {
                        BedRoom b = new BedRoom();
                        b.addRoom();
                        roomList.addRoom(b);
                    } else {
                        System.out.println("Invalid type!");
                    }

                    System.out.println("Success");
                    break;

                case 2:
                    System.out.print("Enter id to update: ");
                    roomList.updateRoom(scanner.nextLine());
                    break;

                case 3:
                    System.out.print("Enter id to find: ");
                    roomList.findRoomById(scanner.nextLine());
                    break;

                case 4:
                    System.out.print("Enter id to delete: ");
                    roomList.deleteRoom(scanner.nextLine());
                    break;

                case 5:
                    System.out.println("All rooms:");
                    roomList.displayAllRooms();
                    break;

                case 6:
                    roomList.countRooms();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Continue? 1 Yes / 0 No: ");
            next = scanner.nextInt();
            scanner.nextLine();

        } while (next != 0);

        scanner.close();
    }
}