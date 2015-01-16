/* The following exercises are adapted from:
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through 
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education.
 * ISBN: 978-0-13-285583-9
 */
package assign2.pkg2014f;

import java.util.Scanner;

/**
 * @author <Jay Joshi>
 */
public class Assign22014F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* =============================== *
         * DO NOT CHANGE THIS METHOD       *
         * Make changes in the sub-methods *
         * named for each exercise.        *
         * =============================== */
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Which exercise would you like to run? [4,9,10,12,16] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 4:
                    doExercise4();
                    break;
                case 9:
                    doExercise9();
                    break;
                case 10:
                    doExercise10();
                    break;
                case 12:
                    doExercise12();
                    break;
                case 16:
                    doExercise16();
                    break;
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
    }

    /* Exercise #4
     * Write a program that displays the following pattern:
     *     *
     *    ***
     *   *****
     *  *******
     *   *****
     *    ***
     *     *
     *
     * - Gaddis pg. 106
     */
    public static void doExercise4() {
        // TODO: Complete Exercise #4 Below
        
        System.out.println("   *  ");
        System.out.println("  *** ");
        System.out.println(" ***** ");
        System.out.println("******* ");
        System.out.println(" ***** ");
        System.out.println("  ***  ");
        System.out.println("   *   ");
    }

    /* Exercise #9
     * A car's miles-per-gallon (MPG) can be calculated 
     * with the following formula:
     *   MPG = Miles Driven / Gallons of Gas Used
     * Write a program that asks the user for the number 
     * of miles driven and the gallons of gas used. It 
     * should calculate the car's miles-per-gallon and 
     * display the result on the screen.
     *
     * - Gaddis pg. 106-7
     */
    public static void doExercise9() {
        // TODO: Complete Exercise #9 Below

        Scanner miles = new Scanner(System.in);
        
        System.out.println("Enter Miles Driven: ");
        double MilesDriven = miles.nextDouble();
        
        System.out.println("Enter Gallons Of Gas Used: ");
        double GallonsofGasUsed = miles.nextDouble();
        
        double MPG = MilesDriven / GallonsofGasUsed;
        
        System.out.println("car's miles-per-gallons are: " + MPG);
            
    }

    /* Exercise #10
     * Write a program that asks the user to enter three 
     * test scores. The program should display each test 
     * score, as well as the average of the scores.
     *
     * - Gaddis pg. 107
     */
    public static void doExercise10() {
        // TODO: Complete Exercise #10 Below
        
        System.out.println("Enter three test scores: ");
        Scanner score = new Scanner(System.in);
        
        double score1 = score.nextDouble();
        double score2 = score.nextDouble();
        double score3 = score.nextDouble();
        
        System.out.println("First Test Score is: " + score1 + 
                "\nSecond Test Score is: " + score2 + 
                "\nThird Test Score is: " + score3 );
        
        Double avg = (score1 + score2 + score3)/3;
        
        System.out.println("Average of scores is: " + avg);
    }

    /* Exercise #12
     * Write a program that asks the user to enter the name 
     * of his or her favourite city. Use a String variable 
     * to store the input. The program should display the 
     * following:
     * - The number of characters in the city name
     * - The name of the city in all uppercase letters
     * - The name of the city in all lowercase letters
     * - The first character in the name of the city
     *
     * - Gaddis pg. 107
     */
    public static void doExercise12() {
        // TODO: Complete Exercise #12 Below
        
        System.out.println("Enter Name your Favourite City: ");
        
        Scanner city = new Scanner(System.in);
        String cityName = city.nextLine();

        
        System.out.println("The number of charaters in city name is: " + cityName.length() );
        System.out.println("The name of the city in uppercase letters is: " + cityName.toUpperCase());
        System.out.println("The name of the city in lowercase letters is: " + cityName.toLowerCase());
        System.out.println("The First Character in the name of city is: " + cityName.charAt(0));
        
    }

    /* Exercise #16
     * Write a program that plays a word game with the 
     * user. The program should ask the user to enter 
     * the following:
     * - His or her name
     * - His or her age
     * - The name of a city
     * - The name of a college
     * - A profession
     * - A type of animal
     * - A pet's name
     * After the user has entered these items, the program 
     * should display the following story, inserting the 
     * user's input into appropriate locations:
     *
     * There once was a person named NAME who lived in CITY. At the age of AGE,
     * NAME went to college at COLLEGE. NAME graduated and went to work as a
     * PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both
     * lived happily ever after.
     *
     * - Gaddis pg. 108
     */
    public static void doExercise16() {
        // TODO: Complete Exercise #16 Below
        
        Scanner details = new Scanner(System.in);
        
        System.out.println("Enter your Name: ");
        String name = details.nextLine();
        
        System.out.println("Enter your Age: ");
        int age = details.nextInt();
        
        details.nextLine();
        System.out.println("Enter your city: ");
        String city = details.nextLine();
        
        System.out.println("Enter your college: ");
        String college = details.nextLine();
        
        System.out.println("Enter your Profession: ");
        String profession = details.nextLine();
        
        System.out.println("Enter Type of Animal: ");
        String animal = details.nextLine();
        
        System.out.println("Enter Pet's Name: ");
        String pet = details.nextLine();
             
        
        
        System.out.println("There once was a person named "+ name + " who lived in " + city +". At the age of "+ age +",\n"
         + name  + " went to college at " + college + ". " + name + " graduated and went to work as a\n"
         + profession  +". Then," + name + " adopted a(n) " + animal + " named " + pet+ ". They both\n" +
        "lived happily ever after.");
    }
}
