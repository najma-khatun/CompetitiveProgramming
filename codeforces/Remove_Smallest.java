import java.util.*;
public class Remove_Smallest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++)
        {
            int n=sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            boolean flag=true;
            for(int j=0;j<n-1;j++)
            {
                if(arr[j+1]-arr[j]>1)
                {
                    flag=false;
                }
            }
            if(flag)
            System.out.println("YES");
            else
            System.out.println("NO");
        }
        sc.close();
    }
}
