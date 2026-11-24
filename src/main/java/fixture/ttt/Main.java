package fixture.ttt;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        int[][] script = {{0, 0}, {1, 1}, {2, 2}, {0, 2}, {2, 0}, {1, 0}, {1, 2}, {0, 1}, {2, 1}};
        char turn = 'X';
        for (int[] m : script) {
            b.place(m[0], m[1], turn);
            if (b.winner() != ' ' || b.isDraw()) break;
            turn = turn == 'X' ? 'O' : 'X';
        }
        System.out.println("moves=" + b.moves() + " winner=" + b.winner() + " draw=" + b.isDraw());
    }
}
