import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RoomList list = new RoomList();

        while (true) {

            System.out.println("1.Add Meeting");
            System.out.println("2.Add Bed");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Find");
            System.out.println("6.Display");
            System.out.println("7.Count");
            System.out.println("0.Exit");
            System.out.print("Choose: ");

            if (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.println("Enter number!");
                continue;
            }

            int c = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (c) {

                case 1:
                    MeetingRoom m = new MeetingRoom();
                    m.addRoom();
                    list.addRoom(m);
                    break;

                case 2:
                    BedRoom b = new BedRoom();
                    b.addRoom();
                    list.addRoom(b);
                    break;

                case 3:
                    System.out.print("ID: ");
                    if (!list.updateRoomById(sc.nextLine()))
                        System.out.println("Not found");
                    break;

                case 4:
                    System.out.print("ID: ");
                    if (!list.deleteRoomById(sc.nextLine()))
                        System.out.println("Not found");
                    break;

                case 5:
                    System.out.print("ID: ");
                    Room r = list.findRoomById(sc.nextLine());
                    if (r != null) r.displayDetails();
                    else System.out.println("Not found");
                    break;

                case 6:
                    list.displayAllRooms();
                    break;

                case 7:
                    list.countRooms();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
