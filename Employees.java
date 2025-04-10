import java.util.Scanner;
import java.util.UUID;

public class Employees extends ShowRoom implements Main.utility {

    private Scanner scan = new Scanner(System.in);

    String emp_id;
    String emp_name;
    int emp_age;
    String emp_department;

    @Override
    public void get_details() {
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Age: " + emp_age);
        System.out.println("Department: " + emp_department);
        System.out.println("Showroom Name: " + showRoom_name);
    }

    @Override
    public void set_details() {
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);

        System.out.println("\n\t*** Enter Employee Information ***\n");
        System.out.print("Employee Name: ");
        emp_name = scan.nextLine();
        System.out.print("Employee Age: ");
        emp_age = scan.nextInt();
        scan.nextLine();
        System.out.print("Employee Department: ");
        emp_department = scan.nextLine();
        System.out.print("Showroom Name: ");
        showRoom_name = scan.nextLine();
    }
}
