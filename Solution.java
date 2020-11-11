package lab01.exercise01;

import java.util.Scanner;

public class Solution {
   public static int SumOfCube(int number)
   {
	   int rem=0;
	   int sum=0,cube;
	   while(number>0)
	   {
	   rem=number%10;
	   cube=rem*rem*rem;
	   sum=sum+cube;
	   number=number/10;
	   }
	   return sum;
   }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = s.nextInt();
		
		int result = SumOfCube(number);
		System.out.println("Result: "+result);

	}

}
