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
     * Constructs a Hiker with a given name and age.
     * Initializes empty lists for hikes and favorite hikes.
     *
     * @param n the name of the hiker
     * @param a the age of the hiker
     */
    public Hiker(String n, int a) {
        name = n;
        age = a;
        hikes = new ArrayList<Hike>();
        favoriteHikes = new ArrayList<Hike>();
    }

    /**
     * Adds a hike to the hiker's list of hikes.
     *
     * @param h the hike to add
     */
    public void addHike(Hike h) {
        hikes.add(h);
    }

    /**
     * Adds a hike to the hiker's list of favorite hikes.
     *
     * @param h the hike to add to favorites
     */
    public void addFavoriteHike(Hike h) {
        favoriteHikes.add(h);
    }

    /**
     * Calculates the total miles walked across all hikes.
     *
     * @return the sum of miles from all hikes
     */
    public double getTotalMiles() {
        double total = 0.0;

        for (int i = 0; i < hikes.size(); i++) {
            total += hikes.get(i).getNumMiles();
        }

        return total;
    }

    /**
     * Prints all hikes in the hiker's list.
     * If no hikes exist, prints a message indicating that.
     */
    public void printHikes() {
        if (hikes.size() == 0) {
            System.out.println("No hikes have been added yet.");
        } else {
            for (int i = 0; i < hikes.size(); i++) {
                System.out.println((i + 1) + ". " + hikes.get(i));
            }
        }
    }

    /**
     * Prints all favorite hikes in the hiker's list.
     * If no favorite hikes exist, prints a message indicating that.
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
     * Returns the weekly hiking goal in miles based on the hiker's age.
     * Age < 18: 6 miles
     * Age 18-40: 8 miles
     * Age > 40: 5 miles
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
     * Returns feedback on whether the hiker has met their weekly goal.
     *
     * @return a string indicating if the goal was met or how many miles are
     *         remaining
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

    /**
     * Calculates the percentage of the weekly goal that has been achieved.
     *
     * @return the goal completion percentage
     */
    public double getGoalPercentage() {
        return (getTotalMiles() / getWeeklyGoal()) * 100;
    }

    /**
     * Removes a hike from the hiker's list by its position number.
     * Also removes the hike from favorites if it exists there.
     *
     * @param number the 1-based position number of the hike to remove
     * @return true if the hike was successfully removed, false if the number is
     *         invalid
     */
    public boolean removeHike(int number) {
        int index = number - 1;

        if (index >= 0 && index < hikes.size()) {
            Hike removed = hikes.remove(index);
            favoriteHikes.remove(removed);
            return true;
        }

        return false;
    }
}
