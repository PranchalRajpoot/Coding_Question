package Practice_Questions;

public class PalindromeNumber {
    public static void main(String args[])
    {
        int n=4434;
        int temp, r;
        int sum=0;
            temp=n;    
            while(n>0){    
             r=n%10;  //getting remainder  
             sum=(sum*10)+r;    
             n=n/10;    
            }  
            if(temp==sum)  
            {
             System.out.println("palindrome number ");   
            } 
            else    
            {
             System.out.println("not palindrome");    
            }
          }  
        
    
}
