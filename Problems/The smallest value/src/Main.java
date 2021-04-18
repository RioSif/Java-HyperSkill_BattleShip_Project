import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = 0;
        long f = 1;
        while (f <= m) {
            n++;
            f *= n;
        }
        System.out.println(n);
    }
}
