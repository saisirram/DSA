import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort {
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

        System.out.println("Sorted Array: ");
        quickSort(array, 0, size - 1);
        printArray(array, size);
    }

    public static void quickSort(long[] array, int low, int high) {
        if (low < high) {
            int partitionIdx = getPartitionIdx(array, low, high);
            quickSort(array, low, partitionIdx - 1);
            quickSort(array, partitionIdx + 1, high);
        }
    }

    public static int getPartitionIdx(long[] array, int low, int high) {
        int pivotIdx = low;
        int i = low;
        int j = high;
        // i should not exceed the j
        while (i < j) {
            //get the first element greater than pivot from i
            while (array[i] <= array[pivotIdx] && i <= high - 1) {
                i++;
            }
            //get the first element smaller than pivot from j
            while (array[j] > array[pivotIdx] && j >= low + 1) {
                j--;
            }
            // if you find a pair the greatest and smallest element then swap them
            if (i < j) {
                long temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //Any point if i crosses j, that means there is no larger ele on its right and no smaller ele on its left.
        //then you Swap the low with the j. this make your pivot to stay in its correct place
        long temp = array[low];
        array[low] = array[j];
        array[j] = temp;
        return j;
    }

    public static void printArray(long[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
