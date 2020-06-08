public class Joogipudel
{

  public double maht;
  private String pudeltyyp;
  private double mass;
  private double taaraHind;
  public Jook jook;

  public Joogipudel(double maht, String pudeltyyp, double mass, double taaraHind, Jook jook)
  {
    this.maht = maht;
    this.pudeltyyp = pudeltyyp;
    this.taaraHind = taaraHind;
    this.mass = mass;
    this.jook = jook;
  }

  public double leiaKogumass()
  {
    if (this.jook == null) {
      return this.mass;
    }
    return this.maht * this.jook.erikaal + this.mass;
  }

  public double leiaOmahind()
  {

    if (this.jook == null) {
      return this.taaraHind;
    }
    return this.jook.liitriOmahind * this.maht + this.taaraHind;
  }

}