import java.util.Scanner;

public class question5 {
        public static void main(String[] args) {
            int []amt = {1000,500,100,50,20,10,5,2,1};
            Scanner input = new Scanner(System.in);
            System.out.println("Enter any amount: ");
            int amount= input.nextInt();

            int temp = amount;
            for(int i=0; i< amt.length; i++){
                System.out.println("Notes: "+amt[i]+" = "+temp/amt[i]);
                temp = temp % amt[i];
            }


        }
    }


