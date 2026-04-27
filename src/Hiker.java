import java.util.ArrayList;

/**
 * Stores information about a hiker and the collection of hikes they have completed.
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
     * Adds a hike to this hiker's record.
     * @param h the hike to add
     */
    public void addHike(Hike h)
    {
        hikes.add(h);
    }

    /**
     * Computes the total miles from all recorded hikes.
     * @return the total miles hiked
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
     * Prints each hike in the hiker's record.
     */
    public void printHikes()
    {
        for (int i = 0; i < hikes.size(); i++)
        {
            System.out.println(hikes.get(i));
        }
    }
}
