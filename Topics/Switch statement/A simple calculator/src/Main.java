import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long firstnumber = sc.nextLong();
        String op = sc.next();
        long secondnumber = sc.nextLong();

        switch (op) {
            case "+" :
                System.out.println(firstnumber + secondnumber);
                break;
            case "-" :
                System.out.println(firstnumber - secondnumber);
                break;
            case "/" :
                if (secondnumber != 0) {
                    System.out.println(firstnumber / secondnumber);
                    break;
                } else {
                    System.out.println("Division by 0!");
                    break;
                }
            case "*" :
                System.out.println(firstnumber * secondnumber);
                break;
            default:
                System.out.println("Unknown operator");
                break;

        }
    }
}
