import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DistinctRandomNumberFromList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }
        List<Integer> distinct = new ArrayList<>();
        distinct.addAll(numbers.stream().distinct().collect(Collectors.toList()));
        Collections.shuffle(distinct);
        System.out.println(distinct);
    }
}
