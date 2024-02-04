package School_Java_Projects;

import java.util.Scanner;
import javax.sound.sampled.Clip;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.Random;

public class LoopPractice {

    public static void dispAuthor() {
        System.out.println("""
                           ***************************
                           * Loop Practice           *
                           * 11/17/23                *
                           * by: Saanvi Tirumala     *
                           * Java Block 1 B/D        *
                           ***************************
                           """);
    }

    static void playSound() {//loop 9 plays random sound

    }

    static Clip pierreSnd, ifymetroSnd, riotSnd, hoodclassSnd, bnyxSnd; //Clips to be played, one for each sound effect

    public LoopPractice() {
        //one time to riot in from disk
        //These files are saved in the project name/build/classes/sounds folder
        InputStream instr
                = getClass().getClassLoader().getResourceAsStream("sounds/pierre.wav");
        InputStream instr1
                = getClass().getClassLoader().getResourceAsStream("sounds/ifymetro.wav");
        InputStream instr2
                = getClass().getClassLoader().getResourceAsStream("sounds/riot.wav");
        InputStream instr3
                = getClass().getClassLoader().getResourceAsStream("sounds/hoodclass.wav");
        InputStream instr4
                = getClass().getClassLoader().getResourceAsStream("sounds/bnyx.wav");
        try {

            pierreSnd = AudioSystem.getClip();
            pierreSnd.open(AudioSystem.getAudioInputStream(instr));
            ifymetroSnd = AudioSystem.getClip();
            ifymetroSnd.open(AudioSystem.getAudioInputStream(instr1));
            riotSnd = AudioSystem.getClip();
            riotSnd.open(AudioSystem.getAudioInputStream(instr2));
            hoodclassSnd = AudioSystem.getClip();
            hoodclassSnd.open(AudioSystem.getAudioInputStream(instr3));
            bnyxSnd = AudioSystem.getClip();
            bnyxSnd.open(AudioSystem.getAudioInputStream(instr4));

        } catch (LineUnavailableException ex) {
            Logger.getLogger(LoopPractice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoopPractice.class.getName()).log(Level.SEVERE, null, ex);

        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(LoopPractice.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static Random r = new Random();

    public static void main(String[] args) {
        new LoopPractice();
        Scanner input = new Scanner(System.in);
        double choice;
        //loop6
        dispAuthor();
        while (true) {
            System.out.println("Enter the loop that you want: ");
            System.out.println("""
                           0 = Exit
                           1 = Loop 1
                           2 = Loop 2
                           3 = Loop 3
                           4 = Loop 4
                           5 = Loop 5
                           6 = Average
                           7 = Probability
                           9 = Plays a random sound
                           10 = Dice Roll 
                           """);
            choice = input.nextInt();

            //loop 1
            if (choice == 1) {
                int i = 1;
                while (i <= 16) {
                    System.out.println(i + "");
                    i = i + 3;
                }
            }
            //loop2
            if (choice == 2) {
                int j = 20;
                while (j >= 5) {
                    System.out.println(j + "");
                    j = j - 5;
                }
            }

            //loop 3
            if (choice == 3) {
                int a = 1;
                while (a <= 500) {
                    System.out.print("*");
                    a = a + 1;
                }
            }

            //loop 4
            if (choice == 4) {
                System.out.println("");
                System.out.println(
                        "Enter in a number:");
                int limit = input.nextInt();
                int l = 1;
                while (l <= limit) {
                    System.out.print("*");
                    l = l + 1;
                }
            }

            //loop 5    
            if (choice == 5) {
                System.out.println("");
                System.out.println("I will print a sequence of odd numbers and stop at the number you set as a limit");
                System.out.println("enter the number you wish to end at:");
                double theuserLimit = input.nextDouble();//change sc to input in java

                int m = 1;
                while (m <= theuserLimit) {
                    System.out.println(+m);
                    m = m + 2;
                }
            }
            Scanner scanner = new Scanner(System.in);
            if (choice == 6) {
                double total = 0;
                int count = 0;

                while (true) {
                    System.out.print("Enter a number (or -1 to calculate the average): ");
                    try {
                        double num = Double.parseDouble(scanner.nextLine());
                        if (num == -1) {
                            break;
                        }
                        total += num;
                        count++;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }

                scanner.close();

                if (count > 0) {
                    double average = total / count;
                    double roundedAverage = Math.round(average * 100.0) / 100.0; // Round to 2 decimal places
                    System.out.println("The average is: " + roundedAverage);
                } else {
                    System.out.println("No numbers were entered.");
                }
            }

            //loop 9
            if (choice == 9) {

                pierreSnd.setFramePosition(0);
                ifymetroSnd.setFramePosition(0);
                riotSnd.setFramePosition(0);
                hoodclassSnd.setFramePosition(0);

                //to actually play the sounds, we need to set the frame position to the start
                //piano_440Snd, tonesSnd, laserSnd; 
                int numberGen = r.nextInt(5) + 1;

                if (numberGen == 1) {
                    playSound();
                    pierreSnd.start();
                }
                
                if (numberGen == 2) {
                    playSound();
                    bnyxSnd.start();
                }

                if (numberGen == 3) {
                    playSound();
                    ifymetroSnd.start();

                }

                if (numberGen == 4) {
                    playSound();
                    riotSnd.start();
                }
                if (numberGen == 5) {
                    playSound();
                    hoodclassSnd.start();
                }

            }

            if (choice == 10) {

                System.out.print("Enter the number of rolls: ");
                int rollInput = input.nextInt();

                int side2 = 0;
                int side3 = 0;
                int side4 = 0;
                int side5 = 0;
                int side6 = 0;
                int side7 = 0;
                int side8 = 0;
                int side9 = 0;
                int side10 = 0;
                int side11 = 0;
                int side12 = 0;
                int u = 1;
                System.out.println("Roll\tFrequency");

                while (u <= rollInput) {
                    int die1 = r.nextInt(6) + 1;
                    int die2 = r.nextInt(6) + 1;
                    int dieSum = die1 + die2;

                    if (dieSum == 2) {
                        side2 = side2 + 1;
                    }
                    if (dieSum == 3) {
                        side3 = side3 + 1;
                    }
                    if (dieSum == 4) {
                        side4 = side4 + 1;
                    }
                    if (dieSum == 5) {
                        side5 = side5 + 1;
                    }
                    if (dieSum == 6) {
                        side6 = side6 + 1;
                    }
                    if (dieSum == 7) {
                        side7 = side7 + 1;
                    }
                    if (dieSum == 8) {
                        side8 = side8 + 1;
                    }
                    if (dieSum == 9) {
                        side9 = side9 + 1;
                    }
                    if (dieSum == 10) {
                        side10 = side10 + 1;
                    }
                    if (dieSum == 11) {
                        side11 = side11 + 1;
                    }
                    if (dieSum == 12) {
                        side12 = side12 + 1;
                    }
                    u = u + 1;
                }

                System.out.println("2\t" + side2);
                System.out.println("3\t" + side3);
                System.out.println("4\t" + side4);
                System.out.println("5\t" + side5);
                System.out.println("6\t" + side6);
                System.out.println("7\t" + side7);
                System.out.println("8\t" + side8);
                System.out.println("9\t" + side9);
                System.out.println("10\t" + side10);
                System.out.println("11\t" + side11);
                System.out.println("12\t" + side12);
                
                int s2 = 1;
                int s3 = 1;
                int s4 = 1;
                int s5 = 1;
                int s6 = 1;
                int s7 = 1;
                int s8 = 1;
                int s9 = 1;
                int s10 = 1;
                int s11 = 1;
                int s12 = 1;

                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ SAANVI'S HISTOGRAM $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.print("2 |");
                while (s2 <= side2) {
                    System.out.print("*");
                    s2 = s2 + 1;
                }
                System.out.println("");
                System.out.print("3  |");
                while (s3 <= side3) {
                    System.out.print("*");
                    s3 = s3 + 1;
                }
                System.out.println("");
                System.out.print("4  |");
                while (s4 <= side4) {
                    System.out.print("*");
                    s4 = s4 + 1;
                }
                System.out.println("");
                System.out.print("5  |");
                while (s5 <= side5) {
                    System.out.print("*");
                    s5 = s5 + 1;
                }
                System.out.println("");
                System.out.print("6  |");
                while (s6 <= side6) {
                    System.out.print("*");
                    s6 = s6 + 1;
                }
                System.out.println("");
                System.out.print("7  |");
                while (s7 <= side7) {
                    System.out.print("*");
                    s7 = s7 + 1;
                }
                System.out.println("");
                System.out.print("8  |");
                while (s8 <= side8) {
                    System.out.print("*");
                    s8 = s8 + 1;
                }
                System.out.println("");
                System.out.print("9 |");
                while (s9 <= side9) {
                    System.out.print("*");
                    s9 = s9 + 1;
                }
                System.out.println("");
                System.out.print("10  |");
                while (s10 <= side10) {
                    System.out.print("*");
                    s10 = s10 + 1;
                }
                System.out.println("");
                System.out.print("11 |");
                while (s11 <= side11) {
                    System.out.print("*");
                    s11 = s11 + 1;
                }
                System.out.println("");
                System.out.print("12  |");
                while (s12 <= side12) {
                    System.out.print("*");
                    s12 = s12 + 1;
                }
                System.out.println("");
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ SAANVI'S HISTOGRAM $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

            }//end of loop  10

            

            if (choice == 0) {
                break;
            }
        }

    }
}

