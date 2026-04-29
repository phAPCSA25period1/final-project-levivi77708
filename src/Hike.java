/**
 * Represents a single hiking trip with a name, distance, and date.
 */
public class Hike
{
    /** The name of the hike. */
    private String hikeName;
    /** The number of miles completed on the hike. */
    private double numMiles;
    /** The date when the hike occurred. */
    private String date;
    /** favorite hike */
    private String favoriteHike;

    /**
     * Constructs a Hike using the provided details.
     * @param name the name of the hike
     * @param miles the distance of the hike in miles
     * @param hikeDate the date the hike took place
     */
    public Hike(String name, double miles, String hikeDate)
    {
        hikeName = name;
        numMiles = miles;
        date = hikeDate;
    }

    /**
     * Returns the hike name.
     * @return the name of the hike
     */
    public String getHikeName()
    {
        return hikeName;
    }

    /**
     * Returns the number of miles for the hike.
     * @return the hike distance in miles
     */
    public double getNumMiles()
    {
        return numMiles;
    }

    /**
     * Returns the date of the hike.
     * @return the hike date
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Returns a formatted string representing this hike.
     * @return a string with hike details
     */
    @Override
    public String toString()
    {
        return "Hike: " + hikeName + ", Miles: " + numMiles + ", Date: " + date;
    }
}
