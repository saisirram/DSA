import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ArrayFrequencyMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long size = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Long> array = new ArrayList<>();
        //Taking array input
        while (st.hasMoreTokens()) {
            array.add(Long.parseLong(st.nextToken()));
        }

        //pre-computing the frequency map
        HashMap<Long, Long> frequencies = getFrequencies(array);

        // retrieving the results
        for (Map.Entry<Long, Long> frequency : frequencies.entrySet()) {
            System.out.println(frequency.getKey() + " -> " + frequency.getValue());
        }
    }

    public static HashMap<Long, Long> getFrequencies(ArrayList<Long> array) {
        HashMap<Long, Long> frequencies = new HashMap<>();
        for (long num : array) {
            if (frequencies.containsKey(num)) {
                frequencies.put(num, frequencies.get(num) + 1);
            } else {
                frequencies.put(num, 1L);
            }
        }
        return frequencies;
    }
}
