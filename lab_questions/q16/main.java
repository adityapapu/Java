package lab_questions.q16;

import lab_questions.q16.Fibonacci;
import java.util.Scanner;

public class main {
    public static void main(String[] args)
    {
        Fibonacci fib=new Fibonacci();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n=sc.nextInt();
        fib.PrintFibonacciSeries(n);

    }
    
}
