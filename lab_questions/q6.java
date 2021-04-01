//Write a program that show working of different functions of String and StringBufferclasss
// like setCharAt( ), setLength( ), append( ), insert( ), concat( )and equals( ). 

package lab_questions;

public class q6 {
    
    public static void main(String[] args)
    {
        //String class
        String str1="Archana";

        //Create a StringBuffer object wit a string pass as parameter
        StringBuffer str2=new StringBuffer("Panda");


        //Replacing the character at 0th index with 'p'
        System.out.println("Before change 0th index: "+str2);
        str2.setCharAt(0,'p');
        System.out.println("After change 0th index: "+str2);

        
        System.out.println("Before setLenght(2) str2"+str2);
        //set s2 length equal to 2
        str2.setLength(2);
        System.out.println("After setLength(2) str2: "+str2);

        //Appending to str2
        str2.append("nda");
        System.out.println("After append str2: "+str2);

        //Inserts "abc" at 3
        System.out.println("before insert() str2: "+str2);
        str2.insert(3,"abc");
        System.out.println("After insert() str2: "+str2);

        //Concatenates "AKP" to str1
        System.out.println("before concat() str1: "+str1);
        str1=str1.concat("AKP");
        System.out.println("After concat() str1: "+str1);

        //Check wheather str1 equals to str2
        System.out.println("str1 equals to str2: "+str1.equals(str2));

    }
}
