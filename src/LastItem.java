import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {

    public static void main(String[] args) {
        System.out.println("Enters strings one at a time. " +
                "Enter an empty string and the last string will be returned: ");
        getLastListItem(getUserInput());
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

    public static void getLastListItem(ArrayList<String> userInputStrings) {
        if (userInputStrings.size() > 0) {
            System.out.println("The last item in the list is: " +
                    userInputStrings.get(userInputStrings.size() - 1));
        } else {
            System.out.println("Can't return last item. List is empty.");
        }
    }

}
