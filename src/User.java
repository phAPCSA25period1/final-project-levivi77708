import java.util.Scanner;

/**
 * Handles user interaction and menu system.
 */
public class User {
    private Scanner input;
    private Hiker hiker;

    /**
     * Constructs a User and initializes the hiking tracker.
     * Prompts for the user's name and age, then creates a Hiker object.
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
     * Starts the interactive menu system for the hiking tracker.
     * Displays menu options and processes user selections until exit.
     */
    public void start() {
        int choice = 0;

        while (choice != 8) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Add a hike");
            System.out.println("2. View all hikes");
            System.out.println("3. View total miles");
            System.out.println("4. Check weekly goal");
            System.out.println("5. View favorite hikes");
            System.out.println("6. View goal progress");
            System.out.println("7. Remove a hike");
            System.out.println("8. Quit");
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
                System.out.println("You are " + hiker.getGoalPercentage()
                        + "% of the way to your weekly goal.");
            } else if (choice == 7) {
                removeHike();
            } else if (choice == 8) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }

    /**
     * Prompts the user to enter hike details and adds a new hike to the hiker's
     * list.
     * Allows the user to optionally add the hike to their favorites.
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
     * Displays all hikes in the hiker's list.
     */
    private void viewHikes() {
        System.out.println("Your hikes:");
        hiker.printHikes();
    }

    /**
     * Displays all favorite hikes in the hiker's list.
     */
    private void viewFavoriteHikes() {
        System.out.println("Your favorite hikes:");
        hiker.printFavoriteHikes();
    }

    /**
     * Prompts the user to select and remove a hike from their list.
     * Displays all hikes and asks for the number of the hike to remove.
     */
    private void removeHike() {
        System.out.println("Choose a hike to remove:");
        hiker.printHikes();

        System.out.print("Enter the hike number: ");
        int number = input.nextInt();
        input.nextLine();

        if (hiker.removeHike(number)) {
            System.out.println("Hike removed.");
        } else {
            System.out.println("Invalid hike number.");
        }
    }
}
