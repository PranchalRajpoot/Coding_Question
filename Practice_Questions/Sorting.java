package Practice_Questions;

public class Sorting {

    public static void main(String args[])

    {
        //ACSENDING ORDER
        int arr[]=  {2,1,0,4,6,7};

        int temp=0;
    //    for(int i=0; i<arr.length; i++)
    //    {
    //     for(int j=i+1;j<arr.length; j++)
    //     {
    //         if(arr[j]<arr[i])
    //         {
    //             temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    //    }



    //DESECNDING ORDER
    for(int i=0; i<arr.length; i++)
    {
        for(int j=i+1; j<arr.length;j++)
        {
            if(arr[j]>arr[i])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

       for(int i=0; i<arr.length; i++)
       {
        System.out.print(" "+ arr[i]);
       }

    }
}
