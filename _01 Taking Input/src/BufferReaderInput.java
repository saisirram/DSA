import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BufferReaderInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println("n: " + n);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int tokensCount = st.countTokens();
        System.out.println("Tokens Count: " + tokensCount);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < tokensCount; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        System.out.println("Basic Array: " + arrayList);

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        ArrayList<Integer> newArrayList = new ArrayList<>();
        while (st2.hasMoreTokens()) {
            newArrayList.add(Integer.parseInt(st2.nextToken()));
        }
        System.out.println("New array list with while loop: " + newArrayList);

        String stringInput = br.readLine();
        System.out.println("String Input: " + stringInput);

        float floatInput = Float.parseFloat(br.readLine());
        System.out.println("Float: " + floatInput);

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        ArrayList<Double> doubleList = new ArrayList<>();
        while (st3.hasMoreTokens()) {
            doubleList.add(Double.parseDouble(st3.nextToken()));
        }
        System.out.println("Double List: " + doubleList);
        br.close();
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
