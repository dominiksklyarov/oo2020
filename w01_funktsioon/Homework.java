import java.util.Random;
import java.util.Scanner;

/**
 * Homework
 */
public class Homework {

    /*
     * WAS MADE FOR EXERCISE 4 public static void calculateRingUmbermoot() { Scanner
     * in = new Scanner(System.in); System.out.println("Sisesta ringi raadius: ");
     * int raadius = in.nextInt(); double ringiUmbermoot = 2 * Math.PI * raadius;
     * System.out.println("Ringi umbermoot on: " + ringiUmbermoot); }
     * 
     * public static void calculateRingPindala() { Scanner in = new
     * Scanner(System.in); System.out.println("Sisesta ringi raadius: "); int
     * raadius = in.nextInt(); double ringiRaadius = Math.PI * Math.pow(raadius, 2);
     * System.out.println("Ringi pindala on: " + ringiRaadius); }
     * 
     * public static void calculateRuuduUmbermoot() { Scanner in = new
     * Scanner(System.in); System.out.println("Sisesta ruudu uks kulg: "); int kulg
     * = in.nextInt(); double ruuduUmbermoot = 4 * kulg;
     * System.out.println("Ruudu umbermoot on: " + ruuduUmbermoot); }
     * 
     * public static void calculateRuuduPindala() { Scanner in = new
     * Scanner(System.in); System.out.println("Sisesta ruudu kulg: "); int kulg =
     * in.nextInt(); double ruuduPindala = Math.pow(kulg, 2);
     * System.out.println("Ruudu pindala on: " + ruuduPindala); }
     */

    /*
     * USED FOR EX 5 public static void celsiusToFahrenHeit(int arv) { double
     * fahrenHeitAnswer = arv * 1.8 + 32;
     * System.out.println("Celsius to Fahrenheit is " + fahrenHeitAnswer); }
     * 
     * public static void fahrenHeitToCelsius(int arv) { double celsiusAnswer = (arv
     * - 32) / 1.8; System.out.println("Fahrenheit to celsius is " + celsiusAnswer);
     * }
     */
     
     public static void bubbleSort(int[]arr){
         int n = arr.length;
         int m = 0;
         for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap elements
                    m = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = m;
                }

            }
        }
     }

     public static int[] generateRandomArray(int size) {
        int arr[] = new int[size];
        int lowArr = 10;
        int maxArr = 10000;
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int randint = r.nextInt((maxArr - lowArr) + 1) + lowArr;
            arr[i] = randint;
        }
        return arr;
    }

    public static void main(String[] args) {
        /* Exercise 1. */
        /*
         * int number1 = 2; int number2 = 2;
         * 
         * if(number1 < number2) {
         * System.out.println("Number 1 is smaller than number 2"); } else if (number1 >
         * number2) { System.out.println("Number 1 is higher than number 2"); } else {
         * System.out.println("The numbers are equal"); }
         */

        /* Exercise 2 */
        /*
         * int[] arr = { 3, 6, 15, 10 }; int i;
         * 
         * int max = 0;
         * 
         * for( i = 0; i<arr.length; i++) { if(arr[i] > max) { max = arr[i]; } }
         * System.out.println(max);
         */

        /* Exercise 3 */
        /*
         * int num = 5; for (int i = 1; i <= 10; ++i) {
         * System.out.printf("%d * %d = %d \n", num, i, num * i); }
         */

        /* Exercise 4 */

        /*
         * int answer;
         * 
         * System.out.println("Kas soovid ringi tegeleda ringi [1] voi ruuduga [2]?");
         * Scanner in = new Scanner(System.in); answer = in.nextInt();
         * 
         * if (answer == 1) {
         * 
         * System.out.
         * println("Kas soovid ringi tegeleda ringi umbermooduga[1] voi pindalaga [2]?"
         * ); answer = in.nextInt(); if (answer == 1) {
         * 
         * calculateRingUmbermoot(); } else {
         * 
         * calculateRingPindala(); } } else if (answer == 2) {
         * 
         * System.out.
         * println("Kas soovid ruudu tegeleda ringi umbermooduga [1] voi pindalaga [2]?"
         * ); answer = in.nextInt(); if (answer == 1) {
         * 
         * calculateRuuduUmbermoot(); } else {
         * 
         * calculateRuuduPindala(); } }
         */

        /*
         * Exercise 5. Koostada programm, mis teisendab Celsius -> Fahrenheit ja ka
         * vastupidisielt. Arvud ümardada kümnendikeni. Kasutada abifunktsioone.
         */

        /*
         * System.out.println("Kas soovid arvutada cel to far voi vastupidi [1 voi 2]");
         * Scanner ans = new Scanner(System.in); int answer = ans.nextInt(); if (answer
         * == 1 ) { System.out.println("Sisesta celsius"); int cel = ans.nextInt();
         * celsiusToFahrenHeit(cel); } else { System.out.println("Sisesta fahren"); int
         * far = ans.nextInt(); fahrenHeitToCelsius(far); }
         */

        /*
         * Exercise 6. Koostada programm, mis sorteerib int array, kasutades Bubble
         * sorti. Programm peab töötama eri suuruste arraydega (10 - 1000). Programm
         * prindib alguses välja sorteerimata array ja kui array on sorteeritud printima
         * selle välja. Ka peab olema välja prinditud programmi loopide arv.
         */


        int arr[] = generateRandomArray(5);
        bubbleSort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }




    }
}