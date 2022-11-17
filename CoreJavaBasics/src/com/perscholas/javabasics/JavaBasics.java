package com.perscholas.javabasics;

/**
 * 
 * @author venus teah
 * 
 *
 */

public class JavaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addInts();
		addDoubles();
		addIntDouble();
		divideInt();
		divideIntWithDecimal();
		divideDoubleAndCast();
		divideIntAndCast();
		calculateAge();
		calculateOrderAmount();
	
	}
	
	
	
	//Write a program that declares 2 integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.

	public static void addInts() {
		
		int x = 5;
		int y = 6;
		
		int sum = x + y;
		
		System.out.println(sum);
		
		
	}
	
	
	
	
	//Write a program that declares 2 double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
	
	public static void addDoubles() {
		
		double x = 100.5;
		double y = 40.7;
		
		double sum = x + y;
		
		System.out.println(sum);
	}
	
	
	
	
	
	/*Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. 
	 * Assign the sum to a variable. Print out the result. What variable type must the sum be?
	 */
	
	public static void addIntDouble() {
		
		int x = 50;
		double y = 500.4;
		
		double sum = x + y;
		
		System.out.println(sum);
	}
	
	
	
	
	
	/*Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number. 
	 * Assign the result to a variable. Print out the result. Now change the larger number to a decimal. 
	 * What happens? What corrections are needed?
	 */
	
	public static void divideInt() {
		
		int x = 47;
		int y = 12;
		
		int quotient = x/y;
		
		System.out.println(quotient);
	}
	
	
	public static void divideIntWithDecimal() {
		
		double x = 47.5;
		int y = 12;
		
		double quotient = x/y;
		
		System.out.println(quotient);
	}
	
	
	
	
	
	
	/* Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. 
	 * Assign the result to a variable. 
	 * Print out the result. Now, cast the result to an integer. Print out the result again.
	 */
	
	
	public static void divideDoubleAndCast() {
		
		double x = 60.6;
		double y = 9.8;
		
		double quotientd = x/y;
		
		System.out.println(quotientd);
		
		int quotienti = (int) quotientd;
		
		System.out.println(quotienti);
		
	}
	
	
	
	/*Write a program that declares two integer variables, x, and y, and assigns 
	 * 5 to x and 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
	 */
	
	public static void divideIntAndCast() {
		
		int x = 5;
		int y = 6;
		
		double q = y/x;
		
		System.out.println(q);
		
		q = (double) y;
		
		System.out.println(q);
	}
	
	
	 
	
	
	/*Write a program that declares a named constant and 
	 * uses it in a calculation. Print the result.
	 */
	 
	
	
	public static void calculateAge() {
		
		final int BIRTH_YEAR = 2002;
		int age = 2022 - BIRTH_YEAR;
		
		System.out.println(age);
		
		
	}
	
	
	

	/*Write a program where you create 3 variables that represent products at a cafe. 
	 * The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product. 
	 * Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 4 items of the second product,
	 *  and 2 items of the third product. Add them all together to calculate the subtotal. 
	 * Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. 
	 * Be sure to format the results to 2 decimal places.
	 */
	
	public static void calculateOrderAmount() {
		
		double coffee = 2.99;
		double latte = 3.99;
		double matcha = 4.99;
		
		double subtotal;
		double totalSale;
		
		
		subtotal = (coffee * 3) + (latte * 4) + (matcha * 2);
		
		final double SALES_TAX = .06;
		
		totalSale = subtotal * (SALES_TAX + 1);
		
		System.out.println(String.format("%.2f", totalSale));
		
		
		
		
		
		
		
		
	}
	
	

	
	

}
