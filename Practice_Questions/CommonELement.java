package Practice_Questions;

public class CommonELement {

    public static void main(String args[])
    {
        int[] a1={1,2,6,3,5};
        int[] a2= {1,8,7,0,5};

        for(int i=0; i<a1.length; i++)
        {
            for(int j=0; j<a2.length; j++)
            {

                if(a1[i]==a2[j])
                {
                    System.out.println(a1[i]);
                }
            }
        }
    }
    
}
