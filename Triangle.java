package Nest-Java-Workout;
import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner ip =new Scanner(System.in);
        System.out.println("enter the input");
        int num=ip.nextInt();
        int i, j;
        for(i = 1; i <= num; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}

