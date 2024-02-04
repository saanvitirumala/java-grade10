
package School_Java_Projects;

public class Cinema {


    public static void main(String[] args) {
        // Declare an array to represent movies shown in theaters at various times
        String[][][] movieSchedule = {
            {{"Movie A", "Movie B"}, {"Movie C", "Movie D"}, {"Movie E", "Movie F"}},
            {{"Movie B", "Movie C"}, {"Movie D", "Movie E"}, {"Movie F", "Movie A"}},
            {{"Movie C", "Movie D"}, {"Movie E", "Movie F"}, {"Movie A", "Movie B"}},
            {{"Movie D", "Movie E"}, {"Movie F", "Movie A"}, {"Movie B", "Movie C"}},
            {{"Movie E", "Movie F"}, {"Movie A", "Movie B"}, {"Movie C", "Movie D"}},
            {{"Movie F", "Movie A"}, {"Movie B", "Movie C"}, {"Movie D", "Movie E"}},
            {{"Movie A", "Movie B"}, {"Movie C", "Movie D"}, {"Movie E", "Movie F"}},
            {{"Movie B", "Movie C"}, {"Movie D", "Movie E"}, {"Movie F", "Movie A"}}
        };

        // Display the movie schedule for each theater and time slot
        for (int theater = 0; theater < movieSchedule.length; theater++) {
            System.out.println("Theater " + (theater + 1) + " Schedule:");
            for (int time = 0; time < movieSchedule[theater].length; time++) {
                System.out.print("Time " + (time + 1) + ": ");
                for (String movie : movieSchedule[theater][time]) {
                    System.out.print(movie + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
