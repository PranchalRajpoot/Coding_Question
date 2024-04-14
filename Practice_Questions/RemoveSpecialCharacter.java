package Practice_Questions;

public class RemoveSpecialCharacter {
    public static void main(String args[])
    {
        String s="pra%nc*ha)l";
        String r="";

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)>64&&s.charAt(i)<121)
            {
                r= r+s.charAt(i);

            }
        }
        System.out.println(r);
    }
    
}
