import java.io.InputStream;

class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;

        int i;

        while ((i = inputStream.read()) != -1) {
            if (i != 10) {
                System.out.print(i);
            }
        }

    }
}
    int p;
//    int words = 0;
//
//        while ((p = reader.read()) != -1) {
//                int temp = 0;
//                words = (p == 32 && temp != 32) ? words + 1 : words;
//                temp = p;
//                }
//
//                System.out.println(words > 0 ? words + 1 : 0);
//
//                reader.close();