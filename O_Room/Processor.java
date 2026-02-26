package O_Room;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RoomList roomList = new RoomList();
        int choice;

        do {
            System.out.println("1. Add Meeting Room");
            System.out.println("2. Add Bed Room");
            System.out.println("3. Update Room by ID");
            System.out.println("4. Delete Room by ID");
            System.out.println("5. Find Room by ID");
            System.out.println("6. Display All Rooms");
            System.out.println("7. Count Rooms");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    MeetingRoom mr = new MeetingRoom();
                    mr.addRoom();
                    roomList.addRoom(mr);
                    break;
                case 2:
                    BedRoom br = new BedRoom();
                    br.addRoom();
                    roomList.addRoom(br);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    roomList.updateRoomById(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    roomList.deleteRoomById(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    roomList.findRoomById(scanner.nextLine());
                    break;
                case 6:
                    roomList.displayAllRooms();
                    break;
                case 7:
                    roomList.countRooms();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}


