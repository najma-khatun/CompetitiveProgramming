import java.util.Scanner;

public class Mario_and_Bullet {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	   Scanner sc= new Scanner(System.in);
	   int T=sc.nextInt();
	   for(int i=0;i<T;i++)
	   {
	       int X= sc.nextInt();
	       int Y= sc.nextInt();
	       int Z= sc.nextInt();
	        if(Y/X<Z)
	        System.out.println(Z-(Y/X));
	        else
	        System.out.println(0);
	       
	       
	   }
       sc.close();
	}
}
