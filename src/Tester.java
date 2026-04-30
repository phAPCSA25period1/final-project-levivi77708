/**
 * Tester class for launching the hiking tracker application.
 * It creates a User instance and starts the interactive menu.
 */
public class Tester
{
    /**
     * Main entry point for the application.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        User user = new User();
        user.start();
    }
}
