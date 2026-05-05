import java.util.ArrayList;

/**
 * Represents a hiker with a name, age, list of hikes, and favorite hikes.
 */
public class Hiker {
    private String name;
    private int age;
    private ArrayList<Hike> hikes;
    private ArrayList<Hike> favoriteHikes;

    /**
     * Creates a Hiker object.
     *
     * @param n the hiker's name
     * @param a the hiker's age
     */
    public Hiker(String n, int a) {
        name = n;
        age = a;
        hikes = new ArrayList<Hike>();
        favoriteHikes = new ArrayList<Hike>();
    }

    /**
     * Adds a hike to the hiker's list.
     *
     * @param h the hike being added
     */
    public void addHike(Hike h) {
        hikes.add(h);
    }

    /**
     * Adds a hike to the favorite hikes list.
     *
     * @param h the hike being added to favorites
     */
    public void addFavoriteHike(Hike h) {
        favoriteHikes.add(h);
    }

    /**
     * Calculates total miles from all hikes.
     *
     * @return total miles walked
     */
    public double getTotalMiles() {
        double total = 0.0;

        for (int i = 0; i < hikes.size(); i++) {
            total += hikes.get(i).getNumMiles();
        }

        return total;
    }

    /**
     * Prints all hikes.
     */
    public void printHikes() {
        if (hikes.size() == 0) {
            System.out.println("No hikes have been added yet.");
        } else {
            for (int i = 0; i < hikes.size(); i++) {
                System.out.println(hikes.get(i));
            }
        }
    }

    /**
     * Prints all favorite hikes.
     */
    public void printFavoriteHikes() {
        if (favoriteHikes.size() == 0) {
            System.out.println("No favorite hikes have been added yet.");
        } else {
            for (int i = 0; i < favoriteHikes.size(); i++) {
                System.out.println(favoriteHikes.get(i));
            }
        }
    }

    /**
     * Determines the weekly mileage goal based on age.
     *
     * @return the weekly goal in miles
     */
    public double getWeeklyGoal() {
        if (age < 18) {
            return 6.0;
        } else if (age <= 40) {
            return 8.0;
        } else {
            return 5.0;
        }
    }

    /**
     * Provides feedback on whether the user met their goal.
     *
     * @return feedback message
     */
    public String getWeeklyGoalFeedback() {
        double totalMiles = getTotalMiles();
        double goal = getWeeklyGoal();

        if (totalMiles >= goal) {
            return "Your weekly goal is " + goal + " miles. You met your goal!";
        } else {
            return "Your weekly goal is " + goal + " miles. You have walked "
                    + totalMiles + " miles and need "
                    + (goal - totalMiles) + " more miles.";
        }
    }
}
