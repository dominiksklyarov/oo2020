import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Variant03
 */
public class Variant03 {

    public static void main(String[] args) throws IOException{
        /* esimene ulesanne */
        float time1;
        float time2;
        float speed1;
        float speed2;
        int distance;
        distance = 2;
        speed1 = 4;
        speed2 = 8;
        calculateAverage(distance, speed1, speed2);

        /* Teine ulesanne */
        int[] speeds = {1, 15, 30, 45, 50};
        calculateAverageFromArray(speeds);

        /* Kolmas Ulesanne */
        Scanner file = new Scanner(new File("speeds.txt"));
        String line = null;
        int sum = 0;
        int count = 0;
        float avgFromFile = 0;
        while (file.hasNextLine()) {
            line = file.nextLine();
            String[] vals = line.split(" ");
            for (int i = 0; i < vals.length; i++) {
                avgFromFile = avgFromFile + 1 / (float)Integer.valueOf(vals[i].trim());
                count++;
            }
        }
        float avgFromFileFinal = avgFromFile / count;
        PrintWriter writer = new PrintWriter("averagespeeds.txt", "UTF-8");
        writer.println(avgFromFileFinal);
        writer.close();

    }

    /* Esimene ulesanne */
    public static void calculateAverage(int distance, float speed1, float speed2 ){
        float time1; 
        float time2;
        time1 = distance / speed1;
        time2 = distance / speed2;
        float average = (time1 + time2) / 2;
        System.out.println("The time for first was " + time1 + ",and the time for second was " + time2);
        System.out.println("The average time was " + average);
    }

    /* Teine ulesanne */
    public static void calculateAverageFromArray(int[] speeds){
        System.out.println("The length of the array is: " + speeds.length);
        float ArrTime = 0;
        float avgArrTime = 0;
        for(int i=0; i < speeds.length; i++){
            ArrTime = ArrTime + 1 / (float)speeds[i];
        }
        avgArrTime = ArrTime / speeds.length;
        System.out.println("The avgArrTime is: " + avgArrTime);
    }
}