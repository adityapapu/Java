package lab_questions;

public class q9 {

    static void func(double a) {
        System.out.println("double-arg");
    }
    static void func(int a) {
        System.out.println("int-arg");
    }
    public static void main(String[] args) {
        func(2); // Exact match is found because 2 is an integer data type. So, output is int-arg. 
        func(1.5f); // Exact match is found because 1.5f is an float data type. So, output is double-arg. 
    }
}