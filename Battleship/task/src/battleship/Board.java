package battleship;

public class Board {

    public Board() {
        drawBoard();
    }

    private void drawBoard() {
        System.out.print("  ");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + " ");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("");
            System.out.print(String.valueOf((char)(i + 65)) + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print("~ ");
            }
        }
    }




}
