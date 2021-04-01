// 1. To find the sum of any number of integers entered as command line arguments. 
package lab_questions;
public class q1 {
    public static void main( String args[] ) {
        int num=0;
        for(int i=0; i<args.length; i++){
           num+= Integer.parseInt(args[i]);
        }
        
          System.out.println("The sum is " + num);
           }
    
}
