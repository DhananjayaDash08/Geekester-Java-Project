package Geekster_Test;

import java.util.*;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, i, count=0;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		for(i=1 ; i<=num; i++) 
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count == 2)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not a Prime Number");
			}
	}

}
