import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.print(checkHit(x1, y1, x2, y2));

    }

    private static String checkHit(int x1, int y1, int x2, int y2) {
        String hit = "NO";
        hit = x1 == x2 || y1 == y2 ? "YES" : hit;
        if ("YES".equals(hit)) {
            return hit;
        }

        for (int i = 0; i < 8; i++) {
            hit = x1 + i == x2 && y1 + i == y2
                    || x1 - i == x2 && y1 - i == y2
                    || x1 + i == x2 && y1 - i == y2
                    || x1 - i == x2 && y1 + i == y2 ? "YES" : hit;
        }

        return hit;
    }
}