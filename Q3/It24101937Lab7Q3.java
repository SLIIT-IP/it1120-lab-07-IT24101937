import java.util.Scanner;
public class It24101937Lab7Q3 {
    public static void main(String[] args) {
        
        int i = 0;
        char modeOfPayment;
        double finalPayment = 0;

        Scanner Keyboard = new Scanner(System.in);

        for (i=1; i<=5; i=i+1)
        {
            System.out.println("Customer " + i);
            System.out.println("Enter the bill ammount: ");
            double bill = Keyboard.nextDouble();
            System.out.println("Enter the mode of payment:");
            modeOfPayment = Keyboard.next().charAt(0);

            if (modeOfPayment == 'c' || modeOfPayment == 'C')
            {
                finalPayment = bill* 0.05;
                System.out.println("The discount is" +" "+ (bill- finalPayment));
                System.out.println("The final payment is: " + finalPayment);
            }
            else if (modeOfPayment == 'o' || modeOfPayment == 'O')
            {
                System.out.println("The final payment is: " + bill);
            }
            else
            {
                System.out.println("Invalid mode of payment");
                //break;
            }

        }



    }  
}
    