// Cars.java
// Represents a car entity, extending from showroom for association

import java.util.Scanner;

public class Cars extends ShowRoom implements Main.utility {

    private Scanner scan = new Scanner(System.in);

    // Car attributes
    String car_name;
    String car_color;
    String fuel_type;
    int price;
    String car_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println("Car Name: " + car_name);
        System.out.println("Color: " + car_color);
        System.out.println("Fuel Type: " + fuel_type);
        System.out.println("Price: " + price);
        System.out.println("Car Type: " + car_type);
        System.out.println("Transmission: " + car_transmission);
    }

    @Override
    public void set_details() {
        System.out.println("\n\t*** Enter Car Details ***\n");
        System.out.print("Name: ");
        car_name = scan.nextLine();
        System.out.print("Color: ");
        car_color = scan.nextLine();
        System.out.print("Fuel Type: ");
        fuel_type = scan.nextLine();
        System.out.print("Price: ");
        price = scan.nextInt();
        scan.nextLine();
        System.out.print("Car Type: ");
        car_type = scan.nextLine();
        System.out.print("Transmission: ");
        car_transmission = scan.nextLine();
    }
}
