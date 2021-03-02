public class TennisGame3 implements TennisGame {

    private int p2;
    private int p1;

    private Player player1;
    private Player player2;

    private String p1N;
    private String p2N;

    public TennisGame3(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }


    public String getScore() {
        String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            s = p[p1];
            return (p1 == p2) ? s + "-All" : s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            s = p1 > p2 ? p1N : p2N;
            return ((p1 - p2) * (p1 - p2) == 1) ? "Advantage " + s : "Win for " + s;
        }
    }

    @Override
    public void wonPoint(Player player) {
        player.wonPoint();
    }

}
