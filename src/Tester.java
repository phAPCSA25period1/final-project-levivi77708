/**
 * Tester class for the Hike class.
 * Creates sample Hike objects and tests their toString() method.
 */
public class Tester {
    /**
     * Main method to run tests on Hike objects.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        // create Hike objects manually
        Hike hike1 = new Hike("Torrey Pines Trail", 3.5, "04/10/2026");
        Hike hike2 = new Hike("Cowles Mountain", 5.0, "04/11/2026");
        Hike hike3 = new Hike("Sunset Cliffs Walk", 2.0, "04/12/2026");

        // print them to test toString()
        System.out.println(hike1);
        System.out.println(hike2);
        System.out.println(hike3);

    }

}
