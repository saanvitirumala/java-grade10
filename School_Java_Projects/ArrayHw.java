package School_Java_Projects;

import java.util.Scanner;

/**
 *
 * @author saanv
 */
public class ArrayHw {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double choice;
        while (true) {
            System.out.println("Enter the Array that you want: ");
            System.out.println("""
                           0 = Exit
                           7 = Class, Location, Teacher 
                           8 = Theater
                           9 = Solar System Distances
                           10 = Fast Food    
                           """);
            choice = input.nextInt();

            if (choice == 7) {

                String[] classNames = {"Java", "DDE", "Geometry"};
                String[] locations = {"Room 129", "Room 136", "Room 202"};
                String[] teachers = {"Mr. Hanley", "Mr. Nagy", "Ms. Ploof"};

                // Loop through the arrays simultaneously
                for (int i = 0; i < classNames.length; i++) {
                    // Print class name, location, and teacher for each index
                    System.out.println("Class Name: " + classNames[i]);
                    System.out.println("Location: " + locations[i]);
                    System.out.println("Teacher: " + teachers[i]);
                    System.out.println(); // Add an empty line for clarity
                }

                String[] movies = {"Movie A", "Movie B", "Movie C", "Movie D", "Movie E"};

                // Create a 2D array to represent the schedule (8 theaters x 10 show times)
                String[][] schedule = new String[8][10];

                // Assign movies to theaters for certain show times using loops
                for (int theater = 0; theater < 8; theater++) {
                    for (int showTime = 0; showTime < 10; showTime++) {
                        // Assign 5 movies to at least 3 different theaters
                        if (theater < 3) {
                            schedule[theater][showTime] = movies[showTime % 5];
                        } else if (theater >= 3 && theater < 6) {
                            schedule[theater][showTime] = movies[(showTime + 1) % 5];
                        } else {
                            schedule[theater][showTime] = movies[(showTime + 2) % 5];
                        }
                    }
                }
            }

            if (choice == 8) {

                // Define movies
                String[] movies = {"FNAF MOVIE", "MARVEL MOVIE", "SCREAM MOVIE", "SAUSAGE PARTY MOVIE", "DOCUMENTARY MOVIE"};

                // Create a 2D array to represent the schedule (8 theaters x 10 show times)
                String[][] schedule = new String[8][10];

                // Assign movies to theaters for certain show times using loops
                for (int theater = 0; theater < 8; theater++) {
                    for (int showTime = 0; showTime < 10; showTime++) {
                        // Assign 5 movies to at least 3 different theaters
                        if (theater < 3) {
                            schedule[theater][showTime] = movies[showTime % 5];
                        } else if (theater >= 3 && theater < 6) {
                            schedule[theater][showTime] = movies[(showTime + 1) % 5];
                        } else {
                            schedule[theater][showTime] = movies[(showTime + 2) % 5];
                        }
                    }
                }

                // Display the schedule
                System.out.println("Cinema Schedule:");
                for (int theater = 0; theater < 8; theater++) {
                    System.out.println("Theater " + (theater + 1) + ":");
                    for (int showTime = 0; showTime < 10; showTime++) {
                        System.out.println("Show Time " + (showTime + 1) + ": " + schedule[theater][showTime]);
                    }
                    System.out.println(); // Empty line for clarity
                }
            }

            if (choice == 9) {

                String[] planetNames = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

                // Distances of the planets from the sun (in millions of kilometers)
                double[] distancesFromSun = {57.9, 108.2, 149.6, 227.9, 778.6, 1433.5, 2872.5, 4495.1};

                // Displaying the names of the planets and their distances from the sun
                System.out.println("Solar System Planets and their Distances from the Sun:");
                for (int i = 0; i < planetNames.length; i++) {
                    System.out.println(planetNames[i] + ": " + distancesFromSun[i] + " million km from the Sun");
                }
            }

            if (choice == 10) {

                // Array to store item descriptions and prices as sub-arrays
                String[][] menu = {
                    {"Cheeseburger", "4.99"},
                    {"French Fries", "2.49"},
                    {"Soda", "1.50"},
                    {"Chicken Nuggets", "5.99"},
                    {"Ice Cream", "1.99"}
                };

                // Array to store the customer's order
                int[] order = new int[5]; // Array to store the quantity of each item ordered
                double total = 0;

                Scanner scanner = new Scanner(System.in);

                // Display the menu
                System.out.println("Menu:");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println((i + 1) + ". " + menu[i][0] + " - $" + menu[i][1]);
                }

                // Take the order from the customer
                System.out.println("Enter the quantity of each item you'd like to order (Enter 0 for items you don't want):");
                for (int i = 0; i < menu.length; i++) {
                    System.out.print(menu[i][0] + ": ");
                    order[i] = scanner.nextInt();
                }

                // Calculate the total cost of the order
                for (int i = 0; i < menu.length; i++) {
                    total += order[i] * Double.parseDouble(menu[i][1]);
                }

                // Display the order details and total cost
                System.out.println("\nYour Order:");
                for (int i = 0; i < menu.length; i++) {
                    if (order[i] > 0) {
                        System.out.println(menu[i][0] + " - Quantity: " + order[i] + " - Total Price: $" + (order[i] * Double.parseDouble(menu[i][1])));
                    }
                }
                System.out.println("\nTotal: $" + total);
            }
            if (choice == 0) {
                break;
            }
        }

    }

}




