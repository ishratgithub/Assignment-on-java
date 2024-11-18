public class question1 {
        public static void main(String[] args) {
            double[] numbers = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
            double A = 3.75;
            boolean status = false;
            int i;
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i] == A) {
                    //System.out.println("Found"+(i+1));
                    status = true;
                    break;
                }
            }

            if (status) {
                System.out.println("2nd heighest score is found at " + (i + 1)+" position");
            } else {
                System.out.println("Not Found");
            }
        }
    }


