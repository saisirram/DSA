import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        long[] array = new long[size];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            array[i] = Long.parseLong(st.nextToken());
            i++;
        }
        br.close();

        System.out.println("Initial Array Before Sorting: ");
        printArray(array, size);

        long[] sortedArray = bubbleSort(array, size);

        System.out.println("After Selection SOrt: ");
        printArray(sortedArray, size);
    }

    public static long[] bubbleSort(long[] array, int size) {
        for (int i = 0; i <= size - 1; i++) {
            System.out.println("iteration " + (i + 1));
            int didSwap = 0;
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) { // compare the adjacent elements (at jth and j + 1th index)
                    // if first element is greater than second swap them
                    long temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    didSwap = 1;
                }
            }
            // in best case(already sorted array) there is no point of iterating it again and again.
            // At any point at the first iteration or in between the iterations no swap is happened then just break it the array is already sorted
            if (didSwap == 0) {
                break;
            }
        }
        return array;
    }

    public static void printArray(long[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
