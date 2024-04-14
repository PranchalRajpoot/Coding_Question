// package Practice_Questions;

// public class FibonacciNumber {
//     public static void main(String args[]) {
//         // int a = 0;
//         // int b = 1;
//         // System.out.print(a + " " + b);
//         // for (int i = 2; i < 10; i++) {            simple fibonacci series.

//         //     int c=a+b;
//         //     a=b;
//         //     b=c;
//         //     System.out.print(" " + c);
//         // }


//         // int arr[]= new int[10];
//         //  arr[0]=0;
//         //  arr[1]=1;                                       array fibonacci number
//         //  System.out.print( arr[0]  + "  " +  arr[1]);
//         //  for(int i=2; i<10; i++)
//         //  {
//         //     arr[i]= arr[i-1]+ arr[i-2];
//         //     System.out.print( arr[i] + "  ");

//         //  }
//         //  for (int i = 2; i < 10; i++) {
//         //     System.out.print( arr[i] + "  ");
//         // }



//      // check wheather number is fibonacci or not

//      int a=0;
//      int b=1;
//      int n=35;
//      while(b<n)
//      {
//         int c=a+b;
//         a=b; 
//         b=c;

//             if(c==n||n==0||n==1)
//             {
//                 System.out.println("fibonacci number");

//             }
//             else{
//                 System.out.println("not");
//             }
//      }


//     }

// }


package Practice_Questions;

public class FibonacciNumber {
    public static void main(String args[]) {

        int a = 0;
        int b = 1;
        int n = 35;
        boolean isFibonacci = false;

        while (b < n) {
            int c = a + b;
            a = b;
            b = c;

            if (c == n || n == 0 || n == 1) {
                isFibonacci = true;
                break; // exit the loop since we already determined it's a Fibonacci number
            }
        }

        if (isFibonacci) {
            System.out.println(n + " is a Fibonacci number.");
        } else {
            System.out.println(n + " is not a Fibonacci number.");
        }
    }
}
