package lab_questions.q16;

public class Fibonacci
{
	public void PrintFibonacciSeries(int n)
	{
	    int  t1 = 0, t2 = 1;
        System.out.print("Fibonacci Series of First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

	}
}