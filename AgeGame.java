package Geekster_Test;

import java.util.Scanner;

public class AgeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age= sc.nextInt();
		if(age<0)
		{
			System.out.println("Invalid age");
		}
		else if(age>=0 && age<=5)
		{
			System.out.println("Baby");
		}
		else if(age>5 && age<=10)
		{
			System.out.println("Toddler");
		}
		else if(age>10 && age<=18)
		{
			System.out.println("Teenaged");
		}
		else if(age>18 && age<=25)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Grown Old");
		}

	}

}
