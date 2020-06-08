import java.util.ArrayList;
class Joogivaat
{ 
  
  private double ruumala;
  private double joogiMaht;

  public Joogivaat(double ruumala, double joogiMaht)
  {
    this.ruumala = ruumala;
    this.joogiMaht = joogiMaht;
  
  }

  public Joogipudel t2idaPudel(Joogipudel joogipudel)
  {
    if (this.joogiMaht < joogipudel.maht) {
      return null;
    }
    
    Jook uusJook = new Jook("vaadijook", 0.45, 0.8);
    joogipudel.jook = uusJook;
    this.joogiMaht = this.joogiMaht - joogipudel.maht;
    return joogipudel;
  }

  public ArrayList villiPudelitesse()
  {
    ArrayList<Joogipudel> joogipudelid = new ArrayList<Joogipudel>();
    while(this.joogiMaht >= 0.5) {
      Joogipudel joogipudel = new Joogipudel(0.5, "klaas", 0.1, 0.10, null);
      joogipudel = this.t2idaPudel(joogipudel);
      joogipudelid.add(joogipudel);
    }
    return joogipudelid;
    
  }
}