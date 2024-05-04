import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MergeSort {
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
        mergeSort(array, 0, size - 1);
        printArray(array, size);
    }

    public static void mergeSort(long[] array, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
        System.out.println("low: " + low + "High: " + high + "mid: " + mid);
        printArray(array, array.length);
    }

    public static void merge(long[] array, int low, int mid, int high) {
        int left = low; // start of hypothetical first subarray
        int right = mid + 1; // start of hypothetical second subarray
        ArrayList<Long> temp = new ArrayList<>();
        //left shouldn't exceed mid(end of 1st subarray) and right shouldn't exceed high(end of 2nd subarray)
        while (left <= mid && right <= high) {
            //check if which ele is greater and put the least ele in tem array
            if (array[left] < array[right]) {
                temp.add(array[left]);
                left++;
            } else {
                temp.add(array[right]);
                right++;
            }
        }
        // above one runs until any one of the sub array reaches end
        //if 2nd array reaches end first, then copy the remaining elements in 1st array to temp
        while (left <= mid) {
            temp.add(array[left]);
            left++;
        }

        //if 1st array reaches end first, then copy the remaining elements in 2nd array to temp
        while (right <= high) {
            temp.add(array[right]);
            right++;
        }
        System.out.println("Temporary array: " + temp);

        //copy the elements from temp to original array
        for (Long ele : temp) {
            array[low] = ele;
            low++;
        }
    }

    public static void printArray(long[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
