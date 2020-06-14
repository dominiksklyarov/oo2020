class Car extends Vehicle
{
  private String type;
  private int seats;
  private String color;

  public Car(String type, int seats, String color, int speed)
  {
    super(speed);
    this.type = type;
    this.seats = seats;
    this.color = color;
  }

  public void reverse()
  {
    if (this.speed == 0) {
      this.speed--;
    }
  }

}