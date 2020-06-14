public class Vehicle
{
  private Engine engine;
  private Gearbox gearbox;
  public int speed;

  public Vehicle(int speed) {
    this.speed = speed;
  }

  public void setEngine(Engine engine)
  {
    this.engine = engine;
  }

  public Engine getEngine()
  {
    return this.engine;
  }

  public void setGearbox(Gearbox gearbox)
  {
    this.gearbox = gearbox;
  }

  public Gearbox getGearbox()
  {
    return this.gearbox;
  }

  public void accelerate()
  {
    this.speed++;
  }

  public void brake()
  {
    // kui kiirus on ule nulli siis votame maha kiirust, aga mitte nii, et ta tagurdama hakkaks
    if (this.speed > 0) {
      this.speed--;
    }
  }

}