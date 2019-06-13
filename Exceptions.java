import java.util.*;

public class Exceptions {
    private static Scanner scanner;

    private static void pressEnterToContinue() {
        System.out.println("\r\n\tPress <ENTER> to continue...");
        scanner.nextLine();
        clearScreen();
    }

    private static void clearScreen() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception ex) {
        }
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        clearScreen();
        System.out.println(
                "\r\n\r\n\t\t\t--------------------\r\n\t\t\t|List of Exceptions|\r\n\t\t\t--------------------\r\n\r\n");
        pressEnterToContinue();

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        myList.add("Another string");
        myList.add(111);
        myList.add(123);
        myList.add("Back to string");
        myList.add("99");
        myList.add("hello world");
        myList.add(37);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch (Exception e) {
                System.out.println("\r\n\tException at index: " + i);
                System.out.println("\t" + e.getMessage());
                System.out.println("\t" + "\"" + myList.get(i) + "\"" + " is not an integer!");
            }
        }

        scanner.close();
    }

}