package lab_questions;

public class q19 {
    public static void main(String args[])
	{
		// Main try block
		try {

			// initializing array
			int a[] = { 10,20,30,40};

			// trying to print element at index 5
			System.out.println(a[5]);

			// try-block2 inside another try block
			try 
            {

				// performing division by zero
				int x = a[2] / 0;
			}
			catch (ArithmeticException e2) {
				System.out.println("division by zero is not possible");
			}
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println("Element at such index does not exists");
		}
	}
	// end of main method
}

