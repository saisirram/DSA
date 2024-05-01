import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReverseAnArrayUsingRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> array = new ArrayList<>();
        while (st.hasMoreTokens()) {
            array.add(Long.valueOf(st.nextToken()));
        }
        System.out.println("Reverse an array using two pointer recursive Approach: ");
        System.out.println("Initial Array Before reversing: " + array);
        System.out.println("Array After reversing: " + reverseAnArrayUsingTwoPointers(array, 0, size - 1));

        System.out.println("Reverse an array using One pointer recursive Approach: ");
        System.out.println("Initial Array Before reversing: " + array);
        System.out.println("Array After reversing: " + reverseAnArrayUsingOnePointer(array, 0));

    }

    public static ArrayList<Long> reverseAnArrayUsingTwoPointers(ArrayList<Long> array, int start, int end) {
        if (start >= end) {
            return array;
        }
        array.set(start, array.get(start) ^ array.get(end));
        array.set(end, array.get(start) ^ array.get(end));
        array.set(start, array.get(start) ^ array.get(end));
//        long temp = array.get(start);
//        array.set(start, array.get(end));
//        array.set(end, temp);

        return reverseAnArrayUsingTwoPointers(array, start + 1, end - 1);
    }

    public static ArrayList<Long> reverseAnArrayUsingOnePointer(ArrayList<Long> array, int i) {
        int n = array.size();
        if (i >= n / 2) { // if the start is more than the half af the array
            return array;
        }
        array.set(i, array.get(i) ^ array.get(n - i - 1));
        array.set(n - i - 1, array.get(i) ^ array.get(n - i - 1));
        array.set(i, array.get(i) ^ array.get(n - i - 1));
        return reverseAnArrayUsingOnePointer(array, i + 1);
    }
}
