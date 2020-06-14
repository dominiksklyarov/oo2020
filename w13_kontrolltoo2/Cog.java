public class Cog {

  public int cogCount;
  public int turnsCount = 0;


  public Cog(int cogCount) {
    //hammasrataste arv
    this.cogCount = cogCount;
  }

  // lisab hamasrattale uhe poorde
  public void addTurn()
  {
    this.turnsCount++;
  }
}