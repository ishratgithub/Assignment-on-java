public class question4 {
        public static void main(String[] args) {
            int[] numbers = {80, 63, 85, 45, 69, 41, 74, 20, 34, 52};
            int max = numbers[0];
            int min = numbers[0];
            System.out.println("Array is: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
            System.out.println("Maximum number is: " + max);
            System.out.println("Minimum number is: " + min);

        }
    }


