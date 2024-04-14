package Practice_Questions;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
     public static void main(String args[])
    {
        int a[]={1,1,1,2,3,4,2,3};
        
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
 
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
    
}
