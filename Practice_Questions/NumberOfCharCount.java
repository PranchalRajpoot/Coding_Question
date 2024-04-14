package Practice_Questions;

import java.util.HashMap;
import java.util.Map;

public class NumberOfCharCount {
    public static void main(String args[])
    {
        String s="aaabbcc";
        s.toLowerCase();
        HashMap<Character,Integer>hp= new HashMap<>();
        char[] ch= s.toCharArray();
       for(char c : ch)
       {
        if(hp.containsKey(c))
        {
            hp.put(c, hp.get(c)+1);
        }
        else{
            hp.put(c,1);
        }
       }

       for (Map.Entry entry : hp.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
    
}
