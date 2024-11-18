public class question2 {
        public static void main(String[] args) {
            double []numbers ={3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

            for(int i=0; i< numbers.length; i++){
                for(int j=i+1; j< numbers.length; j++){
                    if(numbers[i]<numbers[j]){
                        double temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            System.out.println("After Sorting: ");
            for(int i=0; i<numbers.length; i++){
                System.out.println(numbers[i]+" ");
            }
        }
    }


