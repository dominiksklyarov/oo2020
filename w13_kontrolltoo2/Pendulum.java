import java.lang.*;
import java.util.ArrayList;

public class Pendulum
{

  private double length;
  private double vibrationPeriod;
  // teeme cog array mis hakkab koosnema kahest cogist
  ArrayList<Cog> cogs = new ArrayList<Cog>();

  public Pendulum(double length)
  {
    this.length = length;
    this.vibrationPeriod = 2 * Math.PI * Math.sqrt(this.length / 9.8);
  }

  public void print() throws Exception
  {
    int i = 0;
    // trukib lopmatuseni valja
    while (true) {
      // korrutad tuhandega kuna see on ms-ndites
      System.out.println(this.length);
      i++;
      // kui number jagub this.cog.cogCount arvuga siis ta suurendab seda 1 vorra 
      if (i % this.cogs.get(0).cogCount == 0) {
        // lisame cogile 1 juurde (ehk turni)
        this.cogs.get(0).addTurn();
      }
      if (i % this.cogs.get(1).cogCount == 0) {
        // lisame cogile 1 juurde (ehk turni)
        this.cogs.get(1).addTurn();
      }
      // prindib valja hammasrataste keerde kordused. Kui saab tais 60 minutit, siis 1h jne.
      System.out.println("minutes: " + this.cogs.get(0).turnsCount + " - hours: " + this.cogs.get(1).turnsCount);
      // vonke paus iga trukkimise vahel, korrutame tuhandega kuna siis on sekundi tapsus
      Thread.sleep((int)Math.round(this.vibrationPeriod * 1000));
    }
  }

  // lisab arraylisti uue hammasratta
  public void addCog(Cog cog)
  {
    this.cogs.add(cog);
  }


}