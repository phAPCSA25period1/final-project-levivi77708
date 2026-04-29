import java.util.Scanner;

/**
 * Handles user interaction for the hiking tracker application.
 * It reads user input, creates a Hiker profile, and allows adding or viewing hikes.
 */
public class User
{
    /** Scanner used to read input from the console. */
    private Scanner input;
    /** The hiker profile created from the user's name and age. */
    private Hiker hiker;

    /**
     * Constructs a User and prompts for the hiker's name and age.
     */
    public User()
    {
        input = new Scanner(System.in);

        System.out.println("Welcome to the Hiking Tracker!");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        hiker = new Hiker(name, age);
    }

    /**
     * Starts the main user menu loop and processes user choices.
     */
    public void start()
    {
        int choice = 0;

        while (choice != 3)
        {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add a hike");
            System.out.println("2. View all hikes");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1)
            {
                addHike();
            }
            else if (choice == 2)
            {
                viewHikes();
            }
            else if (choice == 3)
            {
                System.out.println("Goodbye!");
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }
    }

    /**
     * Reads hike details from the user and adds a new hike to the hiker's record.
     */
    private void addHike()
    {
        System.out.print("Enter hike name: ");
        String name = input.nextLine();

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();
        input.nextLine();

        System.out.print("Enter date: ");
        String date = input.nextLine();

        Hike hike = new Hike(name, miles, date);
        hiker.addHike(hike);

        System.out.println("Hike added!");
    }

    /**
     * Displays all hikes recorded for the current hiker.
     */
    private void viewHikes()
    {
        System.out.println("Your hikes:");
        hiker.printHikes();
    }
}
