package GQTCodes;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
		for(int i=0; i<=n-1; ++i)
		    {
		        // for T character
		        for(int j=0; j<=n-1; ++j )
		        {
		            if(i==0 || j==n/2)
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.print(" \t");
		        // for H character
		        for(int j=0; j<=n-1; ++j )
		        {
		            if(j==0 || j==n-1 || i==n/2)
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.print(" \t");
		        System.out.print(" ");
		        // for U character
		        for(int j=0; j<=n-1; ++j )
		        {
		            if(((j==0 || j==n-1) && i!=n-1) || (i==n-1 && j!=0 && j!=n-1))
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.print(" \t");
		        //for L character
		        for(int j=0; j<=n-1; ++j )
		        {
		            if((j==0 || i==n-1)) 
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.print(" \t");
		        // for A character
		        for(int j=0; j<=n-1; ++j )
		        {
		            if(j==0 && i!=0 || (j==n-1 && i!=0) || i==n/2 || (i==0 && j!=0 && j!=n-1))
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.print(" \t");
		        //for S character
		        for(int j=0; j<=n-1; ++j )
		        {
		            if((i==0 && j!=0) || (i==n/2 && j!=0 && j!=n-1) || (i==n-1 && j!=n-1) || (j==0 && i!=0 && i<n/2) || (j==n-1 && i>n/2 && i!=n-1))
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.print(" \t");
		        //for I character
		        for(int j=0; j<=n-1; ++j )
		        {
		            if(i==0 || i==n-1 || j==n/2)
		            {
		                System.out.print("*");
		            }
		            else
		            {
		                System.out.print(" ");
		            }
		        }
		        System.out.print(" \t");
		        System.out.println();
		    }
	}
}

