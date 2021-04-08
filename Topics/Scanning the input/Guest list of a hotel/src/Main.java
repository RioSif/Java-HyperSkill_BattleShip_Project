//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            sum++;
            String[] str = sc.nextLine().split(" ");
            if (sum == 4) {
                for (int i = str.length - 1; i >= 0; i--) {
                    System.out.println(str[i]);
                }
                break;
            }
        }
    }
}