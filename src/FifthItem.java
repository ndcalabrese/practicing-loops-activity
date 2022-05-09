import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {

    public static void main(String[] args) {
        System.out.println("Enters strings one at a time. " +
                        "Enter an empty string and the fifth string will be returned: ");
        getFifthString(getUserInput());
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

    public static void getFifthString(ArrayList<String> userInputStrings) {
        if (userInputStrings.size() > 4) {
            System.out.println("The fifth item in the list is: " +
                    userInputStrings.get(4));
        } else {
            System.out.println("Can't return fifth list item. List is too short.");
        }

    }

}
