package O_Room;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomList list = new RoomList();
        
        while (true) {
            System.out.println("1. Add Meeting Room");
            System.out.println("2. Add Bed Room");
            System.out.println("3. Update Room");
            System.out.println("4. Delete Room");
            System.out.println("5. Find Room");
            System.out.println("6. Display All");
            System.out.println("7. Count");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            
            int c = sc.nextInt(); 
            sc.nextLine(); // Quét sạch bộ nhớ đệm

            switch (c) {
                case 1:
                    MeetingRoom m = new MeetingRoom();
                    m.addRoom(); // BẮT BUỘC phải gọi hàm nhập dữ liệu
                    list.addRoom(m);
                    break;
                case 2:
                    Bedroom b = new Bedroom();
                    b.addRoom(); // BẮT BUỘC phải gọi hàm nhập dữ liệu
                    list.addRoom(b);
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    // Vì hàm updateRoom trong RoomList trả về void, ta gọi trực tiếp
                    list.updateRoom(sc.nextLine()); 
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    list.deleteRoom(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    list.findRoomById(sc.nextLine());
                    break;
                case 6: 
                    list.displayAllRooms(); 
                    break;
                case 7: 
                    list.countRooms(); 
                    break;
                case 0: 
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
