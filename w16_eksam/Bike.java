class Bike extends Vehicle
{

  private int wheelCount;

  public Bike(int wheelCount, int speed)
  {
    super(speed);
    // mootorrattal võib olla 2 ratast, kuid ka 3 või isegi rohkem.
    this.wheelCount = wheelCount;
  
  }

  // kirjutame umber pidurisusteemi kuna ratas saab pidurdada nii eesmiste kui ka tagumiste piduritega
  public void brake(String brakes)
  {
    // milliste piduritega pidurdab ratas
    System.out.println(brakes);
    super.brake();
  }
}