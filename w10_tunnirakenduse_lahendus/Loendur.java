class Loendur implements Runnable {
    private int count;

    Loendur(int count) {
       this.count = count;
    }
    
    public void run() {
       try {
          for(int i = 0; i < this.count; i++) {
            // naitab iga threadi klassi counterit
             System.out.println("Thread counter:" + i);
             Thread.sleep(500);
          }
       } catch (InterruptedException e) {
         // kui thread katkestatakse
          System.out.println("Interrupted");
       }
    }
 }