public class Player {
  String name;
  Integer score;

  public Player(String name) {
    this.name = name;
    this.score = 0;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void wonPoint(){
    this.score ++;
  }
}
