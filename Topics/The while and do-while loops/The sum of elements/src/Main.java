import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num;
            num = sc.nextInt();
            if (num != 0) {
                sum += num;
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}