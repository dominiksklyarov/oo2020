class Main {
  public static void main(String[] args) {
    Pizza tellimus1 = new Pizza();
    tellimus1.addTopping("juust");
    tellimus1.addTopping("salaami");
    tellimus1.addDough(100);
    System.out.println("First pizza toppings: ");
    tellimus1.listToppings();

    Pizza tellimus2 = new Pizza();
    tellimus2.addTopping("salaamiass");
    tellimus2.addTopping("kana");
    tellimus2.addDough(100);
    System.out.println("Second pizza toppings: ");
    tellimus2.listToppings();
  }
}