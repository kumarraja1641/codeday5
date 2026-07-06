import java.util.*;
public class Peakele {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
          int k=peak(arr);
          System.out.println(k);

    }
    public static int peak(int[] arr)
    {
        int l=0,r=arr.length-1;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(arr[mid]<arr[mid+1])
                l=mid+1;
            else
                r=mid;
        }
        return r;
    }
}
