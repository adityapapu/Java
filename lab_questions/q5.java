// 5. To find the sum of any number of integers interactively, i.e., entering every number from the
// keyboard, whereas the total number of integers is given as a command line argument 


package lab_questions;
import java.util.Scanner;

public class q5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter "+args[0]+" numbers to calculate sum: ");
        for(int i=0;i<Integer.parseInt(args[0]);i++)
            sum+=sc.nextInt();
        System.out.println("Sum ="+sum);
    }
}
