
public class Hike {

    // instant variables
    private String hikeName;
    private double numMiles;
    private String date;

    // constructor
    public Hike(String name, double miles, String hikeDate)
    {
        hikeName = name;
        numMiles = miles;
        date = hikeDate;
    }

    //getters
    public String getHikeName()
    {
        return hikeName;
    }

    public double getNumMiles()
    {
        return numMiles;
    }

    public String getDate()
    {
        return date;
    }

    //toString method
    public String toString()
    {
        return "Hike: " + hikeName +
                ", Miles: " + numMiles +
               ", Date: " + date;
    }

    }
