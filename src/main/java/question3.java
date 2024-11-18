import java.util.Arrays;
import java.util.Scanner;

public class question3 {
        public static void main(String[] args) {
            double[] array = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
            Arrays.sort(array);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the cgpa: ");
            double cgpa = scanner.nextDouble();
            int index = binarySearch(array, cgpa);
            if (index != -1) {
                System.out.println("Found  the cgpa at index " + index);
            } else {
                System.out.println("CGPA is not found");
            }
        }


        public static int binarySearch(double[] array, double target) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (array[mid] == target) {
                    return mid;
                }
                if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }
    }

