/**
 * Tester class for creating and printing sample Hike objects.
 */
public class Tester
{
    /**
     * Main entry point for the tester.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Hike hike1 = new Hike("Torrey Pines Trail", 3.5, "04/10/2026");
        Hike hike2 = new Hike("Cowles Mountain", 5.0, "04/11/2026");
        Hike hike3 = new Hike("Sunset Cliffs Walk", 2.0, "04/12/2026");

        Hiker hiker = new Hiker("Vivi", 17);

        hiker.addHike(hike1);
        hiker.addHike(hike2);
        hiker.addHike(hike3);



        System.out.println("Hikes:");
        hiker.printHikes();

        System.out.println();
        System.out.println("Total Miles: " + hiker.getTotalMiles());


    }
}
