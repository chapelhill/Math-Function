package devirative;

import java.util.Scanner;

public class derivate {

	public static void calc() {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		String function = sc.next();
		int first = 0;
		int second = 0;
		int ten = 1;
		int j = 0;
		char plus = '+';
		int efficents = 1;
		int counter2 = 0;
		System.out.println("the first derivative is:");
		for (int g = 0; g < function.length(); g++) {
			if (function.charAt(g) == plus) {
				efficents++;
			}
		}
		int end = 0;
		int end2 = 0;

		
		while (counter2 != efficents) {
			first = 0;
			second = 0;
			x = function.indexOf("x", x + 1);
			if (counter2 == 0) {
				end = 0;
			} else {
				end = function.indexOf("+", end + 1);
			}

			for (j = x - 1; j >= end; j--) {
				first += derive(function, j) * ten;
				ten *= 10;
			}

			ten = 1;
			end2 = function.indexOf("+", end2 + 1);
			if (end2 == -1) {
				end2 = function.length();
			}
			if (x == end2 - 1) {
				second = 1;
			} else {
				int exponent = x + 2;
				for (int g = end2 - 1; g >= exponent; g--) {
					second += derive(function, exponent) * ten;
					ten *= 10;
				}
			}

			if (x == -1) {
				first = 0;
				second = 1;
			}
			ten = 1;
			first = first * second;
			second -= 1;
			
			if (end2 != function.length() && second != 0) {
				System.out.print(first + "x^" + second + "+");
			} else if (second != 0) {
				System.out.print(first + "x^" + second);
			} else {
				if (end2 == function.length()) {
					System.out.print(first);
				} else {
					System.out.print(first + "+");
				}
			}
			counter2++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ex:4x^4+5x^5+3x^3");
		System.out.println("enter a postive polynomial function:");

		calc();
	}

	private static int derive(String degree, int x) {
		int y = 0;
		char zero = '0';
		char one = '1';
		char two = '2';
		char three = '3';
		char four = '4';
		char five = '5';
		char six = '6';
		char seven = '7';
		char eight = '8';
		char nine = '9';
		if (degree.charAt(x) == zero) {
			y = 0;
		} else if (degree.charAt(x) == one) {
			y = 1;
		} else if (degree.charAt(x) == two) {
			y = 2;
		} else if (degree.charAt(x) == three) {
			y = 3;
		} else if (degree.charAt(x) == four) {
			y = 4;
		} else if (degree.charAt(x) == five) {
			y = 5;
		} else if (degree.charAt(x) == six) {
			y = 6;
		} else if (degree.charAt(x) == seven) {
			y = 7;
		} else if (degree.charAt(x) == eight) {
			y = 8;
		} else if (degree.charAt(x) == nine) {
			y = 9;
		}
		return y;
	}
}
