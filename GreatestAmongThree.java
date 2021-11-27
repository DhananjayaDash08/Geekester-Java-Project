package Geekster_Test;

import java.util.*;

public class GreatestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println(num1);
		}
		else if(num2 > num3) 
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num3);
		}

	}

}
