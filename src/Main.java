import java.util.ArrayList;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String ORANGE = "\u001B[38;5;208m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[30m";

    private static void welcomeMessage() {
        System.out.print("\n" + RED +
                "\n" +
                "┌──────────────────────────────────────────────────────────────────────────┐\n" +
                "│                                                                          │\n" +
                "│                                                                          │\n" +
                "│      __      __          ___                                             │\n" +
                "│     /\\ \\  __/\\ \\        /\\_ \\                                            │\n" +
                "│     \\ \\ \\/\\ \\ \\ \\     __\\//\\ \\     ___    ___     ___ ___      __        │\n" +
                "│      \\ \\ \\ \\ \\ \\ \\  /'__`\\\\ \\ \\   /'___\\ / __`\\ /' __` __`\\  /'__`\\      │\n" +
                "│       \\ \\ \\_/ \\_\\ \\/\\  __/ \\_\\ \\_/\\ \\__//\\ \\L\\ \\/\\ \\/\\ \\/\\ \\/\\  __/      │\n" +
                "│        \\ `\\___x___/\\ \\____\\/\\____\\ \\____\\ \\____/\\ \\_\\ \\_\\ \\_\\ \\____\\     │\n" +
                "│         '\\/__//__/  \\/____/\\/____/\\/____/\\/___/  \\/_/\\/_/\\/_/\\/____/     │\n" +
                "│                                                                          │\n" +
                "│                                                                          │\n" +
                "└──────────────────────────────────────────────────────────────────────────┘\n" +
                "\n" + RESET);

        String ferris = ORANGE + """
                _~^~^~_
            \\) /  """ + WHITE + " o o" + ORANGE + """
                  \\ (/
             '_   """ + BLACK + "-" + ORANGE + """
                   _'
               \\_)--(_/
            """ + RESET;

        System.out.print("\nRust's mascot, Ferris, says hello!\n");
        System.out.print(ferris);

        System.out.print("\n" + YELLOW +
                "\n" +
                "░▀█▀░█▀▀░█▀█░█▄█░░░█░░░█▀▀░█▀█░█▀▄░█▀▀░█▀▄░░░░\n" +
                "░░█░░█▀▀░█▀█░█░█░░░█░░░█▀▀░█▀█░█░█░█▀▀░█▀▄░░▀░ Mert Bölükbaşı\n" +
                "░░▀░░▀▀▀░▀░▀░▀░▀░░░▀▀▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░░▀░\n" +
                "\n");

        System.out.print("\n" +
                "\n" +
                "░▀█▀░█▀▀░█▀█░█▄█░░░█▄█░█▀▀░█▄█░█▀▄░█▀▀░█▀▄░█▀▀░░░░ Oğuzhan Aydın\n" +
                "░░█░░█▀▀░█▀█░█░█░░░█░█░█▀▀░█░█░█▀▄░█▀▀░█▀▄░▀▀█░░▀░ Ege Usuğ\n" +
                "░░▀░░▀▀▀░▀░▀░▀░▀░░░▀░▀░▀▀▀░▀░▀░▀▀░░▀▀▀░▀░▀░▀▀▀░░▀░ Yiğit Emre Ünlüçerçi\n" +
                "\n");
    }

    /*
        [A] Primary School
        [B] Secondary School
        [C] High School
        [D] University
        [E] Terminate
    */
    private static void mainMenu() {}

    /*
        Option A Task 1 -  Age and Zodiac Sign Detection
    */

    // Age and Zodiac Sign Detection, Reverse the Words, and Return to Main Menu.
    private static void subMenuOptionA() {}

    // Main function of Option A Task 1. Print age and zodiac.
    private static void ageAndZodiacSignDetection() {}

    // Get date of birth from user with using java.util.Scanner.
    private static int getDay() { return 0; }
    private static int getMonth() { return 0; }
    private static int getYear() { return 0; }

    // Get current date using java.util.Calendar package.
    private static int getCurrentDay() { return 0; }
    private static int getCurrentMonth() { return 0; }
    private static int getCurrentYear() { return 0; }

    // Calculate age with parameters that are day, month and year.
    private static int calculateAge(String day, String month, String year) { return 0; }

    // Calculate zodiac with parameters that are day, month and year.
    private static String calculateZodiac(String day, String month, String year) { return ""; }

    /*
        Option A Task 2 - Reverse the Words
    */

    // Main function of Option A Task 2. Print reversed word.
    private static void reverseTheWords() {}

    // Get text input from user with using java.util.Scanner. and return it.
    private static String getTextInput() { return ""; }

    // After get input from user, create reverse form and return it.
    private static String createReverseOutput() { return ""; }

    // If input length >=2, it can be reversed.
    private static boolean isReversed() { return true; }


    /*
        Option B Task 1 - Prime Numbers
    */

    // Prime Numbers, Step by step Evaluation of Expression, and Return to Main Menu.
    private static void subMenuOptionB() {}

    // Main function of Option B Task 1. Print first and last 3 prime numbers.
    private static void primeNumbers() {}

    // Get prime number from user with using java.util.Scanner.
    private static int getPrimeNumberInput() { return 0; }

    // Create a ArrayList and push all prime numbers then return it. Do not forget print the execution time.
    private static ArrayList<Integer> sieveOfEratosthenes() { return new ArrayList<>(); }
    private static ArrayList<Integer> sieveOfSundaram() { return new ArrayList<>(); }
    private static ArrayList<Integer> sieveOfAtkin() { return new ArrayList<>(); }


    /*
        Option B Task 2 - Step-by-step Evaluation of Expression
    */

    // Main function of Option B Task 2.
    private static void evaluationOfExpression() {}

    // Get expression input from user with using java.util.Scanner.
    private static String getExpressionInput() { return ""; }

    // Check valid expression or not.
    private static boolean isValidExpression() { return false; }

    private static int calculateExpression(String expression) { return 0; }


    /*
        Option C Task 1 - Statistical Information about an Array
    */

    // Statistical Information about an Array, Distance between Two Arrays, and Return to Main Menu.
    private static void subMenuOptionC() {}

    // Main function of Option C Task 1. Print all calculations.
    private static void statisticalInformation() {}

    private static int arraySize() { return 0; }
    private static ArrayList<Integer> getElement() { return new ArrayList<>(); }

    private static double calculateMedian() { return 0.0; }
    private static double calculateArithmeticMedian() { return 0.0; }
    private static double calculateGeometricMedian() { return 0.0; }
    private static double calculateHarmonicMedian() { return 0.0; } // !!! Should be computed recursively


    /*
        Option C Task 2 - Distance between Two Arrays
    */

    // Main function of Option C Task 2. Print the all calculations.
    private static void distanceBetweenTwoArrays() {}

    // Get dimension from user with using java.util.Scanner.
    private static int getDimension() { return 0; }

    // Check entered dimension is valid or not.
    private static boolean isValidDimension() { return false; }

    private static int calculateManhattanDistance() { return 0; }
    private static int calculateEuclideanDistance() { return 0; }
    private static int calculateCosineSimilarity() { return 0; }


    /*
        Option D - Connect Four Game
    */
    // I will create functions later.

    public static void main(String[] args) {
        welcomeMessage();
    }
}