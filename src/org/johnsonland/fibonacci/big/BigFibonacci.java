package org.johnsonland.fibonacci.big;

import java.math.BigInteger;
import java.util.Scanner;


/**
 * The Class BigFibonacci.
 */
public class BigFibonacci {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Hello fib! Enter the proposed length of Fibonacci series:");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
	
		// get user input for a
		int i = reader.nextInt();
		 //BigInteger num1 = new BigInteger("0");
	         BigInteger num2 = new BigInteger("1");
		 BigInteger num3 ;
		System.out.println(num1);
		System.out.println(num2);
		while (i > 0){
			num3 = num1.add(num2);
			num1 = num2;
			num2 = num3;
			System.out.println(num3);
			i--;
		}
		
	}

}
