package lab_questions;

// Java program to demonstrate getPriority() and
// setPriority()
import java.lang.*;

class q21 extends Thread {
	public void run()
	{
		System.out.println("Inside run method");
	}

	public static void main(String[] args)
	{
		q21 t1 = new q21();
		q21 t2 = new q21();
		q21 t3 = new q21();

		// Default 5
		System.out.println("t1 thread priority : "
						+ t1.getPriority());
		
		// Default 5
		System.out.println("t2 thread priority : "
						+ t2.getPriority());
		
		// Default 5
		System.out.println("t3 thread priority : "
						+ t3.getPriority());

		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		// t3.setPriority(21); will throw
		// IllegalArgumentException
		
		// 2
		System.out.println("t1 thread priority : "
						+ t1.getPriority());
		
		// 5
		System.out.println("t2 thread priority : "
						+ t2.getPriority());
		
		// 8
		System.out.println("t3 thread priority : "
						+ t3.getPriority());

		// Main thread
		
		// Displays the name of
		// currently executing Thread
		System.out.println(
			"Currently Executing Thread : "
			+ Thread.currentThread()
				.getName());
		
		System.out.println(
			"Main thread priority : "
			+ Thread.currentThread().getPriority());

		// Main thread priority is set to 10
		Thread.currentThread().setPriority(10);
		System.out.println(
			"Main thread priority : "
			+ Thread.currentThread().getPriority());
	}
}

