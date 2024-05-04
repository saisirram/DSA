import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InsertionSort {
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

        long[] sortedArray = insertionSort(array, size);

        System.out.println("After Selection SOrt: ");
        printArray(sortedArray, size);
    }

    public static long[] insertionSort(long[] array, int n) {
        for (int i = 0; i <= n - 1; i++) { // for 0 to n-1
            printArray(array, n);
            System.out.println("iteration " + (i + 1));
            for (int j = i; j > 0; j--) { // from backward check if ele to left is bigger or not if so swap it.
                if (array[j] < array[j - 1]) {
                    long temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
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
