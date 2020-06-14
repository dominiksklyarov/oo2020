public class Main {
 
    public static void main(String args[]) {
      // alustame esimese loenduriga
      new Thread(new Loendur(15)).start();
      // alustame teise loenduriga
      new Thread(new Loendur(44)).start();

      Loendur loendur1 = new Loendur(5);
      new Thread(loendur1).start();
      new Thread(loendur1).start();
   }   
}