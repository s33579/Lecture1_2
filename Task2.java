import java.util.ArrayList;

public class Task2 {
    public  static void main(String[] args) {

    int[] array4 = {1,2,4,4,4,11,2};
    System.out.println(findDominant(array4));
    }

    public static int findDominant(int[] array) {

        int result = -1;
        int dominant = 1;
        int count;

        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > dominant) {
                dominant = count;
                result = array[i];
            }

        }
        return result;


        }
    }


