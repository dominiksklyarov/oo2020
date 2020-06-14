public class Main {
  public static void main( String[] args ) {
    // auto tuup, istmete arv, auto varv, auto kiirus
    Car car = new Car("coupe", 5, "red", 50);
    // mootori maht, tsilindrite arv, mootori tuup, kutusetuup
    Engine engine1 = new Engine(1.8, 4, "L4", "petrol");
    car.setEngine(engine1);
    // mitu kaiku, automatic
    Gearbox gearbox1 = new Gearbox(5, "automatic");
    car.setGearbox(gearbox1);
    car.accelerate();
    System.out.println(car.speed);

    // mitu ratast, mis kiirus
    Bike bike = new Bike(3, 45);
    // mootori maht, tsilindrite arv, mootori tuup, kutusetuup
    Engine bikeEngine = new Engine(0.2, 1, "L1", "petrol");
    bike.setEngine(bikeEngine);
    // mitu kaiku, manuaal
    Gearbox bikeGearbox = new Gearbox(4, "manual");
    bike.setGearbox(bikeGearbox);
    System.out.println(bike.getEngine().size);
    // utleme, et ratas pidurdab eesmiste piduritega
    bike.brake("front");
    System.out.println(bike.speed);
    // utleme, et ratas pidurdab tagumiste piduritega
    bike.brake("back");
    System.out.println(bike.speed);
 }
}