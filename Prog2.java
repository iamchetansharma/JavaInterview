// Write a function:
// class Solution { public int solution(int A, int B, int K); }
// that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:
// { i : A ≤ i ≤ B, i mod K = 0 }
// For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.
//
// Assume that:
//
//         A and B are integers within the range [0..2,000,000,000];
//         K is an integer within the range [1..2,000,000,000];
//         A ≤ B.

import java.util.Scanner;

public class Prog2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("First number should be less then second.....");
		System.out.print("Enter the number from where you wants to start :");
		int a = s.nextInt();

		System.out.print("Enter the last number :");
		int b = s.nextInt();

		// Checking if B > A
		if (a > b) {
			System.out.println("Invalid input");
			System.exit(0);
		}

		System.out.print("Enter the by which you want to divide:");
		int k = s.nextInt();

		int size = b - a;
		int[] numbers = new int[size + 1];

		// Calculating how many numbers do we need to check
		for (int i = 0; i < size + 1; i++) {
			numbers[i] = a;
			a++;
		}

		int result = 0;
		for (int i = 0; i < size + 1; i++) {
			//Checking if number is divisible or not
			if (numbers[i] % k == 0) {
				result++;
			}

		}

		System.out.println("result : " + result);

	}

}
