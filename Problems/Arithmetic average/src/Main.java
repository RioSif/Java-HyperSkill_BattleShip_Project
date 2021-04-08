import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int count = 0;

        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0) {
                    sum += i;
                    count++;
                }
            }
        } else {
            for (int i = b; i <= a; i++) {
                if (i % 3 == 0) {
                    sum += i;
                    count++;
                }
            }
        }

        System.out.println((float) sum / count);

    }
}
