// Write a program to create a – “distance” class with methods where distance is computed in
// terms of feet and inches, how to create objects of a class and to see the use of this pointer

package lab_questions;

class distance
{
    private int feet;
    private double inches;
    public void setDistance(int feet,double inches)
    {
        this.feet=feet;
        this.inches=inches;
    }
    public void getDistance()
    {
        System.out.println(feet+" feet "+inches+" inches");
    }

}

public class q8 {

    public static void main(String[] arg)
    {
        distance obj=new distance();
        obj.setDistance(4, 5);
        obj.getDistance();
    }
    
}
