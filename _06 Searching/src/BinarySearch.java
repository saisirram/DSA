import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinarySearch {
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
        long target = Long.parseLong(br.readLine());
        br.close();
        int idx = binarySearchIterative(array, target);
        System.out.println("Iterative Approach.");
        if (idx != -1) {
            System.out.println("Target: " + target + " is at: " + idx);
        } else {
            System.out.println("element is not present");
        }

        System.out.println("Recursive Approach.");
        int targetIdx = binarySearchRecursive(array, 0, size-1, target);
        if (targetIdx != -1) {
            System.out.println("Target: " + target + " is at: " + targetIdx);
        } else {
            System.out.println("element is not present");
        }
    }

    public static int binarySearchIterative(long[] array, long target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) { // if mid is target return
                return mid;
            } else if (array[mid] > target) { // target is in left half (0 to mid -1)
                high = mid - 1;
            } else { //  target is in right half (mid+1 to high)
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(long[] array, int low, int high, long target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binarySearchRecursive(array, low, mid - 1, target);
        } else {
            return binarySearchRecursive(array, mid + 1, high, target);
        }
    }
}
