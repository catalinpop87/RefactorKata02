public class TennisGamePlay implements TennisGame{
  private static final String LOVE_ALL = "Love-All";
  private static final String FIFTEEN_ALL = "Fifteen-All";
  private static final String THIRTY_ALL = "Thirty-All";
  private static final String DEUCE = "Deuce";
  private static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
  private static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
  private static final String WIN_FOR_PLAYER_1 = "Win for player1";
  private static final String WIN_FOR_PLAYER_2 = "Win for player2";
  private static final String LOVE = "Love";
  private static final String FIFTEEN = "Fifteen";
  private static final String THIRTY = "Thirty";
  private static final String FORTY = "Forty";

  private Player player1;
  private Player player2;

  public TennisGamePlay(Player player1, Player player2) {
    this.player1 = player1;
    this.player2 = player2;
  }

  @Override
  public void wonPoint(Player player) {
    if(player.getName().equals("player1")){
      this.player1.wonPoint();
    }else{
      this.player2.wonPoint();
    }
  }

  @Override
  public String getScore() {
    if (player1.getScore().equals(player2.getScore())) {
      return equalsScoreMessage();
    } else if (player1.getScore() > 3 || player2.getScore() > 3) {
      return moreThreeScoreMessage();
    } else {
      return getScoreMessage(player1).concat("-").concat(getScoreMessage(player2));
    }
  }

  private String getScoreMessage(Player player) {
    switch (player.getScore()) {
      case 0:
        return LOVE;
      case 1:
        return FIFTEEN;
      case 2:
        return THIRTY;
      default:
        return FORTY;
    }
  }

  private String moreThreeScoreMessage() {
    int minusResult = player1.getScore() - player2.getScore();
    if (minusResult == 1) return ADVANTAGE_PLAYER_1;
    else if (minusResult == -1) return ADVANTAGE_PLAYER_2;
    else if (minusResult >= 2) return WIN_FOR_PLAYER_1;
    else return WIN_FOR_PLAYER_2;
  }

  private String equalsScoreMessage() {
    switch (player1.getScore()) {
      case 0:
        return LOVE_ALL;
      case 1:
        return FIFTEEN_ALL;
      case 2:
        return THIRTY_ALL;
      default:
        return DEUCE;
    }
  }

  public Player getPlayer1() {
    return player1;
  }

  public void setPlayer1(Player player1) {
    this.player1 = player1;
  }

  public Player getPlayer2() {
    return player2;
  }

  public void setPlayer2(Player player2) {
    this.player2 = player2;
  }
}
