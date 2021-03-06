import java.util.Scanner;

public class Main {

    public static String prepareFullName(String firstName, String lastName) {
        // write your code here
        String fullName;
        if (firstName == null && lastName == null) {
            fullName = " ";
        } else if (firstName == null) {
            fullName = lastName;
        } else if (lastName == null) {
            fullName = firstName;
        } else {
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        firstName = "null".equals(firstName) ? null : firstName;

        String lastName = scanner.nextLine();
        lastName = "null".equals(lastName) ? null : lastName;

        System.out.println(prepareFullName(firstName, lastName));
    }
}