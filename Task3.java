import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        int[] array3 = {1, 2, 3, 4, 5};
        int positions = 3;
        System.out.print(Arrays.toString(rotateArray(array3,positions)));

    }

    public static int[] rotateArray(int[] array, int positions) {
        int[] rotatedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i + positions > array.length - 1) {
                rotatedArray[i + positions - array.length] = array[i];
            } else {
                rotatedArray[i + positions] = array[i];
            }
        }
        return rotatedArray;

    }

}



