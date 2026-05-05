import java.util.Scanner;

/**
 * Handles user input and menu options for the hiking tracker.
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
     * Starts the menu loop for the program.
     */
    public void start()
    {
        int choice = 0;

        while (choice != 5)
        {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add a hike");
            System.out.println("2. View all hikes");
            System.out.println("3. View total miles");
            System.out.println("4. Check weekly goal");
            System.out.println("5. Quit");
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
                System.out.println("Total miles this week: " + hiker.getTotalMiles());
            }
            else if (choice == 4)
            {
                System.out.println(hiker.getWeeklyGoalFeedback());
            }
            else if (choice == 5)
            {
                System.out.println("Goodbye!");
            }
            else
            {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
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
