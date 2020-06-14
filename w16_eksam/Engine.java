public class Engine
{
  // mootori suurus
  public double size;
  // mootori tsilindrid
  public int cylinders;
  // mootori tuup, a la V8  
  public String type;
  // mootori kutusetuup
  public String gasType;

  public Engine(double size, int cylinders, String type, String gasType)
  {
    this.size = size;
    this.cylinders = cylinders;
    this.type = type;
    this.gasType = gasType;
  }

}