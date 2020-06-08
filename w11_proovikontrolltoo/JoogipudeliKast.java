import java.util.ArrayList;
public class JoogipudeliKast
{

  private String kastiTyyp;
  private double kastiHind;
  private double kastiMass;
  private Integer pesadeArv;
  public ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();

  public JoogipudeliKast(String kastiTyyp, double kastiHind, double kastiMass, Integer pesadeArv)
  {
    this.kastiTyyp = kastiTyyp;
    this.kastiHind = kastiHind;
    this.kastiMass = kastiMass;
    this.pesadeArv = pesadeArv;
  }

  public boolean lisaPudel(Joogipudel joogipudel)
  {
    if (pudelid.size() >= pesadeArv) {
      return false;
    }
    this.pudelid.add(joogipudel);
    return true;
  }

  public double leiaUhineMass()
  {
    double massSum = 0.0;
    for (int i = 0; i < this.pudelid.size(); i++) {
      massSum = massSum + this.pudelid.get(i).leiaKogumass();
    }
  
    return massSum;
  }

  public double leiaUhineOmahind()
  {
    double hindSum = 0;
    for (int i = 0; i < this.pudelid.size(); i++) {
      hindSum = hindSum + this.pudelid.get(i).leiaOmahind();
    }
    return hindSum;
  }

  public int villiVaadistKasti(Joogivaat joogivaat)
  {
      ArrayList<Joogipudel> joogipudelid = joogivaat.villiPudelitesse();
      for (int i = 0; i < joogipudelid.size(); i++) {
        this.lisaPudel(joogipudelid.get(i));
      }
      return this.pudelid.size();
  }

}