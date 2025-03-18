import java.util.ArrayList;

public class Lecture1_2 {
        public static void main(String[] args) {

            int[] ogArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            int[] finalArray = filterEvenIndexOddValue(ogArray);
            for (int i = 0; i < finalArray.length; i++) {
                System.out.print(finalArray[i] + " ");
            }
        }

        public static int[] filterEvenIndexOddValue(int[] array) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            for (int i = 0; i < array.length; i++) {
                if (i % 2 == 0) {
                    if (array[i] % 2 != 0) {
                        arrayList.add(array[i]);
                    }
                }

            }

            int [] arrayList1 = new int[arrayList.size()];
            for (int j = 0; j < arrayList1.length; j++) {
                arrayList1[j] = arrayList.get(j);

            }
            return arrayList1;
        }


    }






