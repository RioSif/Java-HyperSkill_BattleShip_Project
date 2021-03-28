import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String shape = sc.nextLine();
        double a;
        double b;
        double c;
        double r;
        double floorage;

        switch (shape) {
            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double s = (a + b + c) / 2;
                floorage = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                floorage = a * b;
                break;
            case "circle":
                r = sc.nextDouble();
                floorage = 3.14 * Math.pow(r, 2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + shape);
        }

        System.out.println(floorage);
    }
}