package org.johnsonland.fibonacci.big;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFibonacci {

	public static void main(String[] args) {
		System.out.println("Hello fib! Enter the proposed length of Fibonacci series:");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
	
		// get user input for a
		int a = reader.nextInt();
		 BigInteger b = new BigInteger("0");
	     BigInteger c = new BigInteger("1");
		 BigInteger d = new BigInteger("0");
		System.out.println(b);
		System.out.println(c);
		while (a > 0){
			d = b.add(c);
			b = c;
			c = d;
			System.out.println(d);
			a--;
		}
		
	}

}