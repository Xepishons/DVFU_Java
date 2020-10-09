import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Solution {
    public static Stream<Double> average(int count, Stream<String> data) {
        ArrayList<String> Arr = (ArrayList<String>) data.collect(Collectors.toList());
        ArrayList<Double> result = new ArrayList<>();
        int j = 0;
        double k = 0;

        for (String s : Arr) {
            if (j == count - 1) {
                j = 0;
                result.add(((k + Double.parseDouble(s.split(" ")[1])) / count));
                k = 0;
            } else {
                j++;
                k += Double.parseDouble(s.split(" ")[1]);
            }
        }
        return result.stream();
    }

    public static Stream<String> max(int n, Stream<String> lines) {
        ArrayList<String> Arr = (ArrayList<String>) lines.collect(Collectors.toList());
        ArrayList<String> result = new ArrayList<>();
        TreeSet<Integer> votes = new TreeSet<>();
        for (String s : Arr) votes.add(Integer.parseInt(s.split(" ")[1]));

        int vote = 0;
        for (int i = 0; i < n; i++) vote = votes.pollLast();

        for (String s : Arr) if (Integer.parseInt(s.split(" ")[1]) == vote) result.add(s.split(" ")[0]);

        Collections.sort(result);
        return result.stream();
    }

    public static Optional<BigInteger> dot(Stream<Long> a, Stream<Long> b) {
        List<Long> A = a.collect(Collectors.toList());
        List<Long> B = b.collect(Collectors.toList());
        BigInteger result = BigInteger.valueOf(0);
        for(int i=0; i<A.size();i++){
            result = result.add(BigInteger.valueOf(A.get(i)).multiply(BigInteger.valueOf(B.get(i))));
        }
        return Optional.of(result);
    }

//    public static void main(String args[]) {
//        List<String> A = Arrays.asList("Bron 99", "Li 123", "Abel 101", "John 224", "Fred 322", "Jonathan 123");
//        average(2, A.stream()).forEach(System.out::println);
//
//        List<String> B = Arrays.asList("Bron 1", "Li 8", "Abel 3", "John 6", "Fred 8", "Jonathan 9","Fred 8");
//        max(2, B.stream()).forEach(System.out::println);
//
//        List<Long> C1 = Arrays.asList(4L, (long) -2);
//        List<Long> C2 = Arrays.asList(1L, 2L);
//        dot(C1.stream(), C2.stream());
//    }
}