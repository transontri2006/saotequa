package O_Room; 
import java.util.Scanner;

public class MeetingRoom extends Room {
    private int capacity;

    // Sử dụng Scanner chung để tối ưu bộ nhớ
    private Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        super.addRoom();        
        System.out.print("Capacity: ");
      
        if (sc.hasNextInt()) {
            capacity = sc.nextInt();
        }
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }
}
