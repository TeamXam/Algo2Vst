import java.util.Arrays;
import java.util.Random;

public class VstSort {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] array = new int[1000000];
        Random rnd = new Random();
        for (int r = 0; r < array.length; r++){
            array[r] = rnd.nextInt(999);


            for (int k = 1; k < array.length; k++) {
                int newElement = array[k];
                int location = k - 1;
                while (location >= 0 && array[location] > newElement) {
                    array[location + 1] = array[location];
                    location--;
                }
                array[location + 1] = newElement;
            }
        }
        //System.out.println(Arrays.toString(array));
        long timeSpent = System.currentTimeMillis();
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
    }
}
