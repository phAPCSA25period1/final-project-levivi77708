import java.util.ArrayList;

/**
 * Represents a hiker with a name, age, and list of hikes.
 */
public class Hiker
{
    /** The hiker's name. */
    private String name;
    /** The hiker's age. */
    private int age;
    /** The list of hikes completed by the hiker. */
    private ArrayList<Hike> hikes;

    /**
     * Constructs a Hiker with a name and age.
     * @param n the hiker's name
     * @param a the hiker's age
     */
    public Hiker(String n, int a)
    {
        name = n;
        age = a;
        hikes = new ArrayList<Hike>();
    }

    /**
     * Adds a hike to the hiker's list.
     *
     * @param h the hike being added
     */
    public void addHike(Hike h)
    {
        hikes.add(h);
    }

    /**
     * Calculates the total miles from all hikes.
     *
     * @return the total number of miles
     */
    public double getTotalMiles()
    {
        double total = 0.0;

        for (int i = 0; i < hikes.size(); i++)
        {
            total += hikes.get(i).getNumMiles();
        }

        return total;
    }

    /**
     * Prints all hikes in the hiker's list.
     */
    public void printHikes()
    {
        if (hikes.size() == 0)
        {
            System.out.println("No hikes have been added yet.");
        }
        else
        {
            for (int i = 0; i < hikes.size(); i++)
            {
                System.out.println(hikes.get(i));
            }
        }
    }

    /**
     * Checks if the hiker met a weekly hiking/walking goal based on age.
     *
     * @return feedback about whether the weekly goal was met
     */
    public String getWeeklyGoalFeedback()
    {
        double totalMiles = getTotalMiles();

        if (age < 18)
        {
            if (totalMiles >= 6)
            {
                return "You met your weekly goal. This is a healthy amount of hiking/walking for your age.";
            }
            else
            {
                return "You did not meet your weekly goal yet. Try to reach at least 6 miles this week.";
            }
        }
        else if (age <= 40)
        {
            if (totalMiles >= 8)
            {
                return "You met your weekly goal. This is a healthy amount of hiking/walking for your age.";
            }
            else
            {
                return "You did not meet your weekly goal yet. Try to reach at least 8 miles this week.";
            }
        }
        else
        {
            if (totalMiles >= 5)
            {
                return "You met your weekly goal. This is a healthy amount of hiking/walking for your age.";
            }
            else
            {
                return "You did not meet your weekly goal yet. Try to reach at least 5 miles this week.";
            }
        }
    }
}
