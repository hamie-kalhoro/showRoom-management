import java.util.Scanner;

public class ShowRoom implements Main.utility {

    private Scanner scan = new Scanner(System.in);

    protected String showRoom_name;
    protected String showRoom_address;
    protected int no_of_employees;
    protected int total_cars;
    protected String manager_Name;

    @Override
    public void get_details() {
        System.out.println("Showroom NAME: " + showRoom_name);
        System.out.println("Showroom ADDRESS: " + showRoom_address);
        System.out.println("Showroom NO_EMPLOYEES: " + no_of_employees);
        System.out.println("Showroom CARS_STOCK: " + total_cars);
        System.out.println("Showroom MANAGER_NAME: " + manager_Name);
    }

    @Override
    public void set_details() {
        System.out.println("\n\t*** Enter Showroom details ***\n");
        System.out.print("Name: ");
        showRoom_name = scan.nextLine();
        System.out.print("Address: ");
        showRoom_address = scan.nextLine();
        System.out.print("Number of Employees: ");
        no_of_employees = scan.nextInt();
        System.out.print("Cars: ");
        total_cars = scan.nextInt();
        scan.nextLine(); // consume leftover newline
        System.out.print("Manager Name: ");
        manager_Name = scan.nextLine();
    }
}
