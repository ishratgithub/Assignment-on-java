import java.util.HashMap;
import java.util.Map;

public class question10 {
        public static void main(String[] args) {
            int[] numbers = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};
            Map<Integer, Integer> countMap = new HashMap<>();
            for (int number : numbers) {
                countMap.put(number, countMap.getOrDefault(number, 0) + 1);
            }
            System.out.print("Numbers that are not duplicates: ");
            for (int number : numbers) {
                if (countMap.get(number) == 1) {
                    System.out.print(number + " ");
                }
            }
        }
    }


