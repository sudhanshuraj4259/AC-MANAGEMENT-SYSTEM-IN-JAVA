import java.util.*;

class Customer {
    private String name;
    private int id;
    private String date;
    private String location;
    private long contact;
    private ArrayList<String> appointment_placed;

    public Customer(String name, int id, long contact, String location) {
        this.name = name;
        this.id = id;
        this.contact = contact;
        this.location = location;
        this.appointment_placed = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public long getContact() {
        return contact;
    }

    public void Place_appointment(String order) {
        appointment_placed().add(order);
    }

    public ArrayList<String> appointment_placed() {
        return appointment_placed;
    }
}

public class AC_ManagementSystem {
    private ArrayList<Customer> cust;

    public AC_ManagementSystem() {
        cust = new ArrayList<Customer>();
    }

    public static void main(String[] args) {
        AC_ManagementSystem obj = new AC_ManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** AC SERVICING MANAGEMENT SYSTEM ***");
            System.out.println("1. Add new customer");
            System.out.println("2. List customers");
            System.out.println("3. Appointment Booking");
            System.out.println("4. List todays appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.add_Customer();
                    break;
                case 2:
                    obj.list_customer();
                    break;
                case 3:
                    obj.book_appointment();
                    break;
                case 4:
                    obj.Total_appointment_placed();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void add_Customer() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID of customer: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name of customer: ");
        String name = sc.nextLine();

        System.out.print("Enter contact of customer: ");
        long contact = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter location of customer: ");
        String location = sc.nextLine();

        Customer customers = new Customer(name, id, contact, location);
        cust.add(customers);

        System.out.println("customer added successfully");

    }

    public void list_customer() {
        if (cust.isEmpty()) {
            System.out.println("No servicemen in the system");
            return;
        } else {

            System.out.println("List of customer:");
            for (Customer cus : cust) {
                System.out.println("ID: " + cus.getId());
                System.out.println("Name: " + cus.getName());
                System.out.println("contact: " + cus.getContact());
                System.out.println("Location: " + cus.getLocation());
            }
        }
    }

    public void book_appointment() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter servicemen ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        // sc.close();

        Customer supplier = findsupplier_ById(id);
        if (supplier == null) {
            System.out.println("Sservicemen with ID " + id + " not found");
            return;
        }

        System.out.print("enter service details for servicemen: ");
        String order = sc.nextLine();
        supplier.Place_appointment(order);

        System.out.println("Appointment successfully placed to the servicemen!");

    }

    private Customer findsupplier_ById(int id) {
        for (Customer s : cust) {
            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    public void Total_appointment_placed() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID of servicemen: ");
        int id = sc.nextInt();
        sc.nextLine();
        // sc.close();

        Customer custom = findsupplier_ById(id);
        if (custom == null) {
            System.out.println("customer with ID " + id + " not found");
            return;
        }

        ArrayList<String> Place_app = custom.appointment_placed();
        if (Place_app.isEmpty()) {
            System.out.println("No order placed to the servicemen ID:: " + id);
            return;
        } else {

            System.out.println("Number of order placed to the servicemen ID ::" + id);
            for (String o : Place_app) {
                System.out.println(o);
            }
        }

    }

}