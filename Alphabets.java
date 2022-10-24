package Nest-Java-Workout;
import java.util.*;
public class Alphabets
{
    String str;
    void read()
    {
        Scanner input  = new Scanner(System.in);
        str = input.next().toUpperCase();
    }
    void calculating()
    {
        switch(str)
        {
            case "A":System.out.println("letter is vowel");
                break;
            case "E":System.out.println("letter is vowel");
                break;
            case "I":System.out.println("letter is vowel");
                break;
            case "O":System.out.println("letter is vowel");
                break;
            case "U":System.out.println("letter is vowel");
                break;
            default:System.out.println("letter is consonant");
                break;

        }
    }

    public static void main(String[] args) {

        Alphabets ob = new Alphabets();
        System.out.println("Enter a letter");
        ob.read();
        ob.calculating();
    }
}