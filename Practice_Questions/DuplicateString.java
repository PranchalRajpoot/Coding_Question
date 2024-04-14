package Practice_Questions;

public class DuplicateString {

    public static void main(String args[])
    {
        String s= " my name is pranchal";
        char ch[]= s.toCharArray();
        for(int i=0; i<ch.length; i++)
        {
            for(int j=i+1; j<ch.length; j++)
            {
                if(ch[i]==ch[j])
                {
                    System.out.print(ch[i]);
                    break;
                }
            }
        }


    }
    
}
