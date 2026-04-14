
/**
 * Represents a hiking trip with details about the hike name, distance, and date.
 */
public class Hike {

    // instant variables
    /** The name of the hike */
    /** The name of the hike */
    private String hikeName;
    /** The distance of the hike in miles */
    private double numMiles;
    /** The date the hike took place */
    private String date;

    /**
     * Constructs a Hike object with the specified details.
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

    // Getters
    /**
     * Returns the name of the hike.
     * @return the hike name
     */
    public String getHikeName()
    {
        return hikeName;
    }

    /**
     * Returns the distance of the hike in miles.
     * @return the number of miles
     */
    public double getNumMiles()
    {
        return numMiles;
    }

    /**
     * Returns the date the hike took place.
     * @return the hike date
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Returns a string representation of the hike.
     * @return a formatted string with hike details
     */
    @Override
    public String toString()
    {
        return "Hike: " + hikeName +
                ", Miles: " + numMiles +
               ", Date: " + date;
    }

    }
