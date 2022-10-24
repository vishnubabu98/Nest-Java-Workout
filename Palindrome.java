package Nest-Java-Workout;
public class Palindrome
{
    String str;
    Palindrome(String str)
    {
        this.str = str;
    }
    void matching()
    {
        int limit = str.length();
        String reverse ="",temp=str;
        for(int i =limit-1;i>=0;i--)
        {
            reverse = reverse+str.charAt(i);
        }

        if(temp.equalsIgnoreCase(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }

    public static void main(String[] args) {

        Palindrome ob = new Palindrome("Amma");
        ob.matching();
    }
}