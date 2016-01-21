/*
Page 3 and 4 implementation of Fibonacci Psuedocode found in Dasgupta textbook
*/

import java.util.*;


public class fib{
	public static int fib1(int n){
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib1(n-1)+fib1(n-2);
	}

	public static int fib2(int n){
		if(n==0)
			return 0;
		int[] fib2=new int[1000];
		fib2[0]=0;
		fib2[1]=1;
		for(int i=2; i<=n;i++){
			fib2[i]=fib2[i-1]+fib2[i-2];
		}
		return fib2[n];
	}

	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Which number of Fibonacci would you like to get? ");
		int n=scan.nextInt();
		System.out.println("Fibonacci old method: " + fib1(n));
		System.out.println("Fibonacci new method: " + fib2(n));

	}

}//end of class