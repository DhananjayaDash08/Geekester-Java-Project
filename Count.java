package Geekster_Test;

import java.util.*;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0, num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num!=0)
		{
		  num = num/10;
		  count= count+1;
		}
		System.out.println(count);

	}

}
