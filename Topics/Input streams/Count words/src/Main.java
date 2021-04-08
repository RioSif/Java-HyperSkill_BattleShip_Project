import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String[] words = reader.readLine().trim().split("\\s+");
        System.out.println(words[0].equals("") ? 0 : words.length);
    }
}
