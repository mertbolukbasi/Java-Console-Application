import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String ORANGE = "\u001B[38;5;208m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[30m";
    public static final String BLUE = "\u001B[34m";

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
                "\n" + RESET);
    }

    /*
        [A] Primary School
        [B] Secondary School
        [C] High School
        [D] University
        [E] Terminate
    */
    private static void mainMenu(Scanner input) {
        int userChoice = 0;
        do {
            System.out.println("**********************************");
            System.out.println("Select an option:");
            System.out.println("1-) Primary School");
            System.out.println("2-) Secondary School");
            System.out.println("3-) High School");
            System.out.println("4-) University");
            System.out.println("5-) Terminate");
            System.out.println("**********************************");
            System.out.print("Your choice: ");

            if (input.hasNextInt()) {
                userChoice = input.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.println("\n-> Primary School menu is loading...");
                        subMenuOptionA(input);
                        break;
                    case 2:
                        System.out.println("\n-> Secondary School menu is loading...");
                        subMenuOptionB(input);
                        break;
                    case 3:
                        System.out.println("\n-> High School menu is loading...");
                        subMenuOptionC(input);
                        break;
                    case 4:
                        System.out.println("\n-> University is loading...");
                        connectFourGame(input);
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("\n❌ Please enter a number between 1 and 5.\n");
                        break;
                }
            } else {
                System.out.println("\n❌ Please enter a number between 1 and 5.\n");
                input.nextLine();
                userChoice = 0;
            }

        } while (userChoice != 5);

        System.out.println("\n👋 End of the program. See you!");
        input.nextLine();
    }

    /*
        Option A Task 1 -  Age and Zodiac Sign Detection
    */

    // Age and Zodiac Sign Detection, Reverse the Words, and Return to Main Menu.
    private static void subMenuOptionA(Scanner input) {}

    // Main function of Option A Task 1. Print age and zodiac.
    private static void ageAndZodiacSignDetection() {}

    // Get date of birth from user with using java.util.Scanner.
    private static int getDay(Scanner input) { return 0; }
    private static int getMonth(Scanner input) { return 0; }
    private static int getYear(Scanner input) { return 0; }

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
    private static String getTextInput(Scanner input) { return ""; }

    // After get input from user, create reverse form and return it.
    private static String createReverseOutput() { return ""; }

    // If input length >=2, it can be reversed.
    private static boolean isReversed() { return true; }


    /*
        Option B Task 1 - Prime Numbers
    */

    // Prime Numbers, Step by step Evaluation of Expression, and Return to Main Menu.
    private static void subMenuOptionB(Scanner input) {}

    // Main function of Option B Task 1. Print first and last 3 prime numbers.
    private static void primeNumbers() {}

    // Get prime number from user with using java.util.Scanner.
    private static int getPrimeNumberInput(Scanner input) { return 0; }

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
    private static String getExpressionInput(Scanner input) { return ""; }

    // Check valid expression or not.
    private static boolean isValidExpression() { return false; }

    private static int calculateExpression(String expression) { return 0; }


    /*
        Option C Task 1 - Statistical Information about an Array
    */

    // Statistical Information about an Array, Distance between Two Arrays, and Return to Main Menu.
    private static void subMenuOptionC(Scanner input) {}

    // Main function of Option C Task 1. Print all calculations.
    private static void statisticalInformation() {}

    private static int arraySize(Scanner input) { return 1; }
    private static ArrayList<Integer> getElement(Scanner input) { return new ArrayList<>(); }

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
    private static int getDimension(Scanner input) { return 0; }

    // Check entered dimension is valid or not.
    private static boolean isValidDimension() { return false; }

    private static int calculateManhattanDistance() { return 0; }
    private static int calculateEuclideanDistance() { return 0; }
    private static int calculateCosineSimilarity() { return 0; }


    /*
        Option D - Connect Four Game
    */

    // Main function of Option D.
    private static void connectFourGame(Scanner input) {
        int row;
        int col;

        int userChoice = 1;
        System.out.println(connectFourGameText);
        System.out.println("Welcome to Connect Four Game!");
        System.out.println("WRITE EXPLANATION FOR THIS GAME TODO!");
        do {
            System.out.println("[1] Start the game");
            System.out.println("[9] Return main menu");
            System.out.print("Your choice: ");
            if (input.hasNextInt()) {
                userChoice = input.nextInt();
                if(userChoice == 9) mainMenu(input);
                if(userChoice != 1 && userChoice != 9) System.out.println("\n❌ Please enter a number 1 or 9.\n");
            } else {
                System.out.println("\n❌ Please enter a number 1 or 9.\n");
                input.nextLine();
            }
        } while(userChoice != 1 && userChoice != 9);

        int gameMode = getGameMode(input);
        int selectedBoard = getSelectedBoard(input);
        String player1Name = "Player1";
        String player2Name = "Player2";
        do {
            if(player1Name.equals(player2Name)) System.out.println("\n❌ Player name's cannot be same.\n");
            player1Name = getPlayerName(input, 1);
            player2Name = getPlayerName(input, 2);
        } while(player1Name.equals(player2Name));


        if (selectedBoard == 1) {
            row = 5;
            col = 4;
        } else if (selectedBoard == 2) {
            row = 6;
            col = 5;
        } else if (selectedBoard == 3) {
            row = 7;
            col = 6;
        } else {
            row = 5;
            col = 4;
        }

        int[][] player1Disc =  new int[row][col];
        int[][] player2Disc = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                player1Disc[i][j] = 0;
                player2Disc[i][j] = 0;
            }
        }

        drawBoard(row, col, player1Disc, player2Disc);

        boolean isWorking = true;
        while(isWorking) {
            System.out.println(player1Name + "\n" + "Select column which you want to put your disc");
            int selectedColumn1 = getColumn(input, col);
            player1Disc = putDisc(row, selectedColumn1, 1, player1Disc, player2Disc);
            drawBoard(row, col, player1Disc, player2Disc);

            System.out.println(player2Name + "\n" + "Select column which you want to put your disc");
            int selectedColumn2 = getColumn(input, col);
            player2Disc = putDisc(row, selectedColumn2, 2, player1Disc, player2Disc);
            drawBoard(row, col, player1Disc, player2Disc);

        }
    }

    private static int getSelectedBoard(Scanner input) {
        int userChoice;

        while (true) {
            System.out.println("Select board which you want to play");
            System.out.println("[1] 5x4 (5 row, 4 column)");
            System.out.println("[2] 6x5 (6 row, 5 column)");
            System.out.println("[3] 7x6 (7 row, 6 column)");
            System.out.print("Your choice: ");

            if (input.hasNextInt()) {
                userChoice = input.nextInt();

                if (userChoice >= 1 && userChoice <= 3) {
                    input.nextLine();
                    return userChoice;
                } else {
                    System.out.println("\n❌ Please enter a number between 1 and 5.\n");
                    input.nextLine();
                }
            } else {
                System.out.println("\n❌ Please enter a number between 1 and 5.\n");
                input.nextLine();
            }
        }
    }
    private static int getGameMode(Scanner input) {
        int userChoice;

        while (true) {
            System.out.println("Select game mode");
            System.out.println("[1] Singleplayer - Fight with computer");
            System.out.println("[2] Multiplayer - Play with two-players");
            System.out.print("Your choice: ");

            if (input.hasNextInt()) {
                userChoice = input.nextInt();

                if (userChoice >= 1 && userChoice <= 3) {
                    input.nextLine();
                    return userChoice;
                } else {
                    System.out.println("\n❌ Please enter a number 1 or 2.\n");
                    input.nextLine();
                }
            } else {
                System.out.println("\n❌ Please enter a number 1 or 2.\n");
                input.nextLine();
            }
        }
    }
    private static void drawBoard(int rows, int columns, int[][] player1Discs, int[][] player2Discs) {
        for(int i = 1; i < columns+1; i++) {
            System.out.print("    " + i + "   ");
        }
        for(int j = 0; j < rows; j++) {
            System.out.print("\n");
            for(int i = 0; i < columns; i++) System.out.print("  ━━━━━━");
            System.out.print("\n");
            System.out.print(j+1 + "┃");
            for(int i = 0; i < columns; i++) {

                if(player1Discs[j][i] == 1) System.out.print("  " + BLUE + "⚪" + RESET + "   ┃");
                else if(player2Discs[j][i] == 1) System.out.print("  " + YELLOW + "⚪" + RESET + "   ┃");
                else System.out.print("       ┃");
            }
        }
        System.out.print("\n");
        for(int i = 0; i < columns; i++) System.out.print("  ━━━━━━");
        System.out.println("\n");
    }
    private static String getPlayerName(Scanner input, int playerNumber) {
        String playerName = "Player" + playerNumber;
        boolean isWorking = true;

        while (isWorking) {
            System.out.print("Player " + playerNumber + " name: ");
            String username = input.nextLine();

            if(username.isEmpty()) {
                System.out.println("Player " + playerNumber + ": " + playerName);
                return playerName;
            }
            else if (!username.trim().isEmpty()) {
                playerName = username.trim();
                isWorking = false;
            } else {
                System.out.println("\n❌ Please enter a valid username.\n");
            }
        }
        System.out.println("Player " + playerNumber + ": " + playerName);
        return playerName;
    }
    private static int[][] putDisc(int row, int column, int playerNumber, int[][] player1Discs, int[][] player2Discs) {

        for(int i = row - 1; i >= 0; i--) {
            if(player1Discs[i][column] == 0 && player2Discs[i][column] == 0) {
                if(playerNumber == 1) {
                    player1Discs[i][column] = 1;
                    break;
                }
                else {
                    player2Discs[i][column] = 1;
                    break;
                }
            }
        }
        if(playerNumber == 1) return player1Discs;
        else return player2Discs;
    }
    private static int getColumn(Scanner input, int column) {

        int enteredColumn = -1;
        do {
            System.out.print("Enter column number: ");
            if(input.hasNextInt()) {
                enteredColumn = input.nextInt() - 1;
                input.nextLine();
            }
            else {
                System.out.println("\n❌ Please enter a number between 1 and " + column +".\n");
                input.nextLine();
            }
        } while(enteredColumn < 0 || enteredColumn > column);

        return enteredColumn;
    }

    // TODO
    private static boolean checkWinner(int[][] playerDisc) { return false; }
    private static boolean checkHorizontal(int[][] playerDiscs, int row, int col) { return false; }
    private static boolean checkVertical(int[][] playerDiscs, int row, int col) { return false; }
    private static boolean checkPositiveDiagonal(int[][] playerDiscs, int row, int col) { return false; }
    private static boolean checkNegativeDiagonal(int[][] playerDiscs, int row, int col) { return false; }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        welcomeMessage();
        mainMenu(input);
        input.close();
    }

    private static final String connectFourGameText = """
            
            
             ██████╗ ██████╗ ███╗   ██╗███╗   ██╗███████╗ ██████╗████████╗    ███████╗ ██████╗ ██╗   ██╗██████╗      ██████╗  █████╗ ███╗   ███╗███████╗
            ██╔════╝██╔═══██╗████╗  ██║████╗  ██║██╔════╝██╔════╝╚══██╔══╝    ██╔════╝██╔═══██╗██║   ██║██╔══██╗    ██╔════╝ ██╔══██╗████╗ ████║██╔════╝
            ██║     ██║   ██║██╔██╗ ██║██╔██╗ ██║█████╗  ██║        ██║       █████╗  ██║   ██║██║   ██║██████╔╝    ██║  ███╗███████║██╔████╔██║█████╗ \s
            ██║     ██║   ██║██║╚██╗██║██║╚██╗██║██╔══╝  ██║        ██║       ██╔══╝  ██║   ██║██║   ██║██╔══██╗    ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝ \s
            ╚██████╗╚██████╔╝██║ ╚████║██║ ╚████║███████╗╚██████╗   ██║       ██║     ╚██████╔╝╚██████╔╝██║  ██║    ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗
             ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝  ╚═══╝╚══════╝ ╚═════╝   ╚═╝       ╚═╝      ╚═════╝  ╚═════╝ ╚═╝  ╚═╝     ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝
            
            """;

}