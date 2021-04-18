import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // call the method here
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        countAreaOfParallelogram(b, h);
        
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}