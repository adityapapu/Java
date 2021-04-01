//To find the factorial of a given number.

package lab_questions;
import java.util.Scanner;
public class q2 {
    static int fac(int n){
		int ans =1;
		for(int i=1; i<=n; i++){
			ans = ans*i;
		}
		return ans;
	}
    public static void main( String args[] ) {
        int f = 5;
        Scanner sc=new Scanner(System.in);
		System.out.println(fac(f));

    }   
}
