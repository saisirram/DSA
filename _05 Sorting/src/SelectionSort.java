import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort {
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

        long[] sortedArray = selectionSort(array, size);

        System.out.println("After Selection SOrt: ");
        printArray(sortedArray, size);
    }

    public static long[] selectionSort(long[] array, int size) {
        for (int i = 0; i <= size - 2; i++) {
            int minIdx = i;
            for (int j = i; j <= size - 1; j++) {
                if (array[j] < array[minIdx]) minIdx = j;
            }
            // swapping the first element of unsorted sub-array with the min element
            long temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
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
