package lab_questions;

import java.util.Scanner;

class MyException extends Exception {  
    MyException(String s) {  
        super(s);  
    }  
    public String toString() {  
        return (" " + getMessage());  
    }  
}  
class ThrowClass {  
    int age;  
    ThrowClass(int age) throws MyException {  
        this.age = age;  
    }  
    void getAge(int age) throws MyException {  
        if (age < 18) {  
            throw new MyException("Invalid Age");  
        } else {  
            this.age = age;  
        }  
    }  
}  
public class q20 {  
  
    public static void main(String[] args) {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int a =sc.nextInt();
        try {  
            ThrowClass t = new ThrowClass(a);  
            t.getAge(a);  
            System.out.println(t.age);  
        } catch (MyException me) {  
            System.out.println(me);  
        }  
    }  
}  