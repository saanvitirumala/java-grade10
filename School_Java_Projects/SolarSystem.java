package School_Java_Projects;


public class SolarSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Parallel arrays for planet names and distances from the sun
        String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] distancesFromSun = {0.39, 0.72, 1.00, 1.52, 5.20, 9.58, 19.22, 30.05}; // in AU (Astronomical Units)

        // Accessing and printing the information
        System.out.println("Planet Names and their Distances from the Sun:");
        for (int i = 0; i < planetNames.length; i++) {
            System.out.println(planetNames[i] + ": " + distancesFromSun[i] + " AU");
        }
    }
}
