import java.util.ArrayList;

public class Hiker {
    private String name;
    private int age;
    private ArrayList<Hike> hikes;

    public Hiker(String n, int a)
    {
        name = n;
        age = a;
        hikes = new ArrayList<Hike>();
    }

    public void addHike(Hike h)
    {
        hikes.add(h);
    }

    public double getTotalMiles()
    {
        double total = 0.0;

        for (int i = 0; i < hikes.size(); i++ )
        {
            total += hikes.get(i).getNumMiles();
        }
        return total;
    }
}
