import java.util.Scanner;

public class It24101937Lab7Q1B {
    public static void main(String[] args) {
        Scanner keybaord = new Scanner(System.in);
        
        int count = 1;
        int total = 0;
        double avg = 0.0;
        int i = 1;
        // int studentNUm= 1;
        // int stuCount = 1;
        for (i = 1; i<=3; i++)
        {
            System.out.println("Student" + i);
            for (count = 0; count < 4; count=count+1)
            {
                System.out.print("Enter the marks of subject:");
                int subject = keybaord.nextInt();
                total = total + subject;
                //count = count + 1;
                
            }
            avg = total/4;
            System.out.println("The average marks is: " + avg);
            if (avg >= 75 && avg <= 100)
            {
                System.out.println("The grade is Distinction");
            }
            else if (avg >= 74 && avg >= 50)
            {
                System.out.println("The grade is Credit");
            }
            else 
            {
                System.out.println("The grade is fail");
            }
        }

            
            
        
            


    }
    
}
