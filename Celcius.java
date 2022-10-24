package Nest-Java-Workout;
import java.util.Scanner;

class Celcius
{
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        float  cel,fh;
        System.out.println("Enter an input for converting Fahrenheit to celcius");
        fh = input.nextFloat();
        cel  = ((fh-32)*5)/9;
        System.out.println("Temperature in celsius is: "+cel);
    }
}