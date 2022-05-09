import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {

    public static void main(String[] args) {
        System.out.println("Enters strings one at a time. " +
                "Enter an empty string and the size of the list will be returned: ");
        getSizeOfList(getUserInput());
    }

    public static ArrayList<String> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInputs = new ArrayList<String>();
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            } else {
                userInputs.add(userInput);
            }
        }

        return userInputs;
    }

    public static void getSizeOfList(ArrayList<String> userInputStrings) {
        System.out.println("The total amount of items in the list is: " +
                userInputStrings.size());
    }

}
