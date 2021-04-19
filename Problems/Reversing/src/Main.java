import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        StringBuilder newNumber = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            newNumber.append(number % 10);
            number /= 10;
        }

        int newNumberInt = Integer.parseInt(newNumber.toString());

        System.out.println(newNumberInt);
    }
}