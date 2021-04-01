
// Write a program to demonstrate the concept of boxing and unboxing.
package lab_questions;

public class q14 {

  public static void main(String[] args)
   {
        
        int a=50;  
        Integer a2=new Integer(a);//AutoBoxing  
        Integer a3=5;//AutoBoxing  
        System.out.println(a2+" "+a3);  

        int a4=a2;  //unboxing
        System.out.println(a4);  

    }
    
}
