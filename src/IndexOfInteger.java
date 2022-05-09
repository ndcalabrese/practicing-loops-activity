import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {

    public static void main(String[] args) {
        getIndexOfInteger(getIntList());

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

    public static void getIndexOfInteger(ArrayList<Integer> userInts) {
        System.out.println("What number are you looking for in the list?");
        int searchInt = getUserInput();
        boolean matchExists = false;

        for (int i = 0; i < userInts.size(); i++) {
            if (userInts.get(i) == searchInt) {
                matchExists = true;
                System.out.println(searchInt + " is at index " + i);
                i++;
            }
        }

        if (!matchExists) {
            System.out.println(searchInt + " is not present in the list");
        }

    }

}
