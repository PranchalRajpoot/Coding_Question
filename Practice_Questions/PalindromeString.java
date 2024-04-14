package Practice_Questions;

public class PalindromeString {

    public static void main(String args[])

    {
        String s= "pranchal";
        String r="";
        for(int i=s.length()-1; i>=0; i--)
        {
            r= r+ s.charAt(i);
        }

        if(r.equals(s))
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    
    }
}
