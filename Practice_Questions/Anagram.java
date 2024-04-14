package Practice_Questions;

import java.util.Arrays;

public class Anagram {

    public static void main(String args[])
    {
        String s="listen";
        String r= "tenlis";

        char ch[]= s.toCharArray();
        char chr[]= r.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(chr);

        String s1= new String(ch);
        String r1= new String(chr);

        if(s1.equals(r1))
        {
            System.out.println("anangram");
        }
        else{
            System.out.println("not anagram");
        }
    }
    
}
