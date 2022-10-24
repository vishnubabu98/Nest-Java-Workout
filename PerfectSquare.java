package Nest-Java-Workout;
import java.lang.Math;
import java.util.*;
public class PerfectSquare
{
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the lower limit and upper limit");
        int low = input.nextInt();
        int high = input.nextInt();


        int low_sqrt= (int) Math.floor(Math.sqrt(low));
        int high_sqrt = (int)  Math.floor(Math.sqrt(high));

        System.out.println("Perfect Square Number from "+low+" to  "+high+"is");

        for(int i=low_sqrt;i<=high_sqrt;i++)
        {
            System.out.println( (int)Math.pow(i,2)+" ");
        }

    }
}
