package lab_questions;

import java.util.Scanner;
public class q15_A {
    public String TakeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        return name;
    }
}
