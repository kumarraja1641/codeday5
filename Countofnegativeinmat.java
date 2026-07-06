import java.util.*;
public class Countofnegativeinmat
{
   static Scanner sc=new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("enter size of rows and columns");
        int k=sc.nextInt();
        int l=sc.nextInt();
        int[][] nums=new int[k][l];

        System.out.println("enter the elemnts in matrix");
        for(int i=0;i<k;i++)
        {
            for(int j=0;j<l;j++)
            {
                nums[i][j]=sc.nextInt();
            }
        }

        int m1=countNegatives(nums);
        System.out.println(m1);

    }
    public static int countNegatives(int[][] grid)
    {
        int max=0;
        for(int i=0;i<grid.length;i++)
        {
            int c=0;
            for(int j=0;j<grid[i].length;j++)
            {
                int l=0,r=grid[i].length-1;
                while(l<=r)
                {
                    int mid=l+(r-l)/2;
                    if(grid[i][mid]>=0)
                    {
                        l=mid+1;
                    }
                    else
                    {
                        r=mid-1;

                    }
                    c=grid[i].length-l;
                }
               
            }
             
                max=max+c;
        }
        return max;
        
    }
}