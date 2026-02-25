package O_Room
 import java.util.Scanner;

public abstract class Room implements IRoom {
    private String id;
    private String name;
    private double baseCost;

    protected Scanner sc = new Scanner(System.in);

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }


    @Override
    public void addRoom() {
        System.out.print("ID: ");
        id = sc.nextLine();
        inputInfo(); 
    }


    public void inputInfo() {
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Base cost: ");
        baseCost = sc.nextDouble();
        sc.nextLine(); // Dọn dẹp bộ nhớ đệm
    }

    @Override
    public void updateRoom() {
        System.out.println("Updating info for Room ID: " + id);
        inputInfo();
    }

    @Override
    public void displayDetails() {
        System.out.print(id + " | " + name + " | " + baseCost); 
    }
}   

