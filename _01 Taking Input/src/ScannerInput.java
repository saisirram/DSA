import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/*
* Note:
* If you are taking a string input after nextInt() or nextDouble() or nextFloat() or any nextXXX()
* then you should do sc.nextLine() (which will give you new line char as String)
* and then sc.nextLine() will you give you the actual string.
* */
public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("N: " + n);
        // basic way
        List<Integer> basicArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            basicArray.add(sc.nextInt());
        }
        System.out.println("Basic array: " + basicArray);

        sc.nextLine(); // check note

        //better and faster way
        String nextLineArray = sc.nextLine();
        System.out.println("Next line array: " + nextLineArray);
        List<Integer> arrayWithStreams = Arrays.stream(nextLineArray.split(" ")).map(Integer::parseInt).toList();
        System.out.println("Array with Streams: " + arrayWithStreams);

        //Taking String as Input
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        //Taking floating point input
        float percentage = sc.nextFloat();
        System.out.println("Float: " + percentage);

        sc.nextLine(); // check note

        //Taking floating point array as input
        String nextLineFloatArray = sc.nextLine();
        List<Double> doubleArray = Arrays.stream(nextLineFloatArray.split(" "))
                .map(Double::parseDouble).toList();
        System.out.println("Double Array: " + doubleArray);
        sc.close();
    }
}

/*
 * Input to take
 * 5
 * 1 2 3 4 5
 * 6 7 8 9 10
 * Sai Sriram Vundavalli String Input
 * 3.4
 * 33.6 55.7 89.2
 * */
