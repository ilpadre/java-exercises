import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
            int[] randomArray = new int[10];

            for (int i = 0; i < randomArray.length; i++) {
                randomArray[i] = (int) (Math.random() * 20 + 1);
            }

            System.out.println(Arrays.toString(randomArray));

            quickSort(randomArray, 0, randomArray.length - 1);

            System.out.println(Arrays.toString(randomArray));


        }

    public static void quickSort (int[] array, int low, int high) {

        int middle = low + (high - low) /2;
        int pivot = array[middle];

        int i = low, j = high;
        while (i <= j) {

            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap (array, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(array, low, j);
        }
        if (high > i) {
            quickSort(array, i, high);
        }
    }

    public static void swap (int[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}
