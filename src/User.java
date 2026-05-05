import java.util.Scanner;

/**
 * Handles user interaction and menu system.
 */
public class User {
    private Scanner input;
    private Hiker hiker;

    /**
     * Creates a User and initializes the program.
     */
    public User() {
        input = new Scanner(System.in);

        System.out.println("Welcome to the Hiking Tracker!");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        hiker = new Hiker(name, age);

        double goal = hiker.getWeeklyGoal();
        System.out.println("Based on your age, your weekly goal is " + goal + " miles.");
    }

    /**
     * Starts the menu loop.
     */
    public void start() {
        int choice = 0;

        while (choice != 6) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add a hike");
            System.out.println("2. View all hikes");
            System.out.println("3. View total miles");
            System.out.println("4. Check weekly goal");
            System.out.println("5. View favorite hikes");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                addHike();
            } else if (choice == 2) {
                viewHikes();
            } else if (choice == 3) {
                System.out.println("Total miles: " + hiker.getTotalMiles());
            } else if (choice == 4) {
                System.out.println(hiker.getWeeklyGoalFeedback());
            } else if (choice == 5) {
                viewFavoriteHikes();
            } else if (choice == 6) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }

    /**
     * Adds a new hike from user input and asks if it should be favorited.
     */
    private void addHike() {
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

        System.out.print("Would you like to add this hike to your favorites? yes/no: ");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            hiker.addFavoriteHike(hike);
            System.out.println("Hike added to favorites!");
        }
    }

    /**
     * Displays all hikes.
     */
    private void viewHikes() {
        System.out.println("Your hikes:");
        hiker.printHikes();
    }

    /**
     * Displays favorite hikes.
     */
    private void viewFavoriteHikes() {
        System.out.println("Your favorite hikes:");
        hiker.printFavoriteHikes();
    }
}
