import java.util.Scanner;

public class question7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] heights = new double[10];
            System.out.println("Enter the heights of 10 babies (in cm):");
            for (int i = 0; i < 10; i++) {
                heights[i] = scanner.nextDouble();
            }
            double lowest = Double.MAX_VALUE;
            double secondLowest = Double.MAX_VALUE;

            for (int i = 0; i < 10; i++) {
                if (heights[i] < lowest) {
                    secondLowest = lowest;
                    lowest = heights[i];
                } else if (heights[i] < secondLowest && heights[i] > lowest) {
                    secondLowest = heights[i];
                }
            }

            System.out.println("The two lowest heights are: " + lowest + " cm and " + secondLowest + " cm");
        }
    }


