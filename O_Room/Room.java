package O_Room;

import java.util.Scanner;

public abstract class Room implements IRoom {
    private String id;
    private String name;
    private double baseCost;
    protected Scanner sc = new Scanner(System.in);

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public void addRoom() {
        System.out.print("Input ID: ");
        id = sc.nextLine();

        System.out.print("Input Name: ");
        name = sc.nextLine();

        System.out.print("Input Base Cost: ");
        baseCost = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void updateRoom() {
        System.out.print("New Name: ");
        name = sc.nextLine();

        System.out.print("New Base Cost: ");
        baseCost = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public void displayDetails() {
        System.out.print("ID: " + id +
                         ", Name: " + name +
                         ", Base Cost: " + baseCost);
    }
}



