package Nest-Java-Workout;
import java.util.Scanner;
public class Fibanocci
{

    static int l;

    static int fib(int n)
    {
        if (n <= 1)
            return n;
        else
            return (fib(n-1)+fib(n-2));
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the limit");
        l = input.nextInt();

        if (l<=1)

            System.out.println("please enter a valid input");
        else
        {
            for (int i = 1; i <= l; i++) {
                System.out.print(fib(i) +" ");
            }

        }


    }
}