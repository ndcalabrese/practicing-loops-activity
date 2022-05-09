import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    public static void main(String[] args) {
        // Create list in main method
        ArrayList<Integer> listOfInts = getIntList();

        getSumOfInts(listOfInts);

    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);

        return Integer.parseInt(scanner.nextLine());
    }

    public static ArrayList<Integer> getIntList() {
        System.out.println("Enters integers one at a time. " +
                "Enter a \"0\" when finished: ");
        ArrayList<Integer> userInputs = new ArrayList<Integer>();

        while (true) {
            int userInput = getUserInput();
            if (userInput != 0) {
                userInputs.add(userInput);
            } else {
                System.out.println("Done entering integers into the list");
                break;
            }

        }

        return userInputs;
    }

    public static void getSumOfInts(ArrayList<Integer> listOfInts) {
        int sum = 0;
        for (Integer number: listOfInts) {
            sum += number;
        }
        if (listOfInts.size() == 0) {
            System.out.println("List of numbers is empty.");
        } else if (listOfInts.size() == 1) {
            System.out.println(listOfInts.get(0) + " is the only number in the list.");
        } else {
            // Determine the last number of the list
            int finalNumber = listOfInts.get(listOfInts.size() - 1);
            // Remove the last number from the list and store the value
            listOfInts.remove(listOfInts.size() - 1);
            // Convert the array list to a string
            String list = listOfInts.toString();
            // Replace the unsightly braces in the string
            list = list.replace("[", "")
                            .replace("]", "");
            System.out.println(list + ", and " + finalNumber + " were the items in the list." +
                    "\nThe sum of that list is: " + sum);
        }
    }

}
