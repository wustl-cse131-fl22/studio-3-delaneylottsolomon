package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		
		System.out.println("Please enter number");
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt(); 
		
		boolean[] primeNumberMax = new boolean[n+1];
		
		for (int i=2; i<n+1;++i)
		{
			primeNumberMax[i] = true;
		}
		for (int c=2; c<Math.sqrt(n); ++c)
		{
			if (primeNumberMax[c])
			{
				for (int j=c*c;j<n; j=j+c)
				{
					primeNumberMax[j]=false;
				}
			}
			
		}
				for(int h=0;h<n;++h)
				{
					if(primeNumberMax[h])
					{
					System.out.println(h + " is prime ");
					}
				}

	}

}
