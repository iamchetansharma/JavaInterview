// A zero-indexed array A consisting of N integers is given. Shifting of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.
// For example, the shifting of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to shift array A for K times; that is, each element of A will be shifted to the right by K indexes.
// Write a function:
// struct Results solution(int A[], int N, int K);
// that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A shifted K times.
// For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
//
// Assume that:
//
//         N and K are integers within the range [0..100];
//         each element of array A is an integer within the range [−1,000..1,000].
//


import java.util.Random;
import java.util.Scanner;

//Starting class
public class Prog1 {

	static void solution(int[] numbers, int N , int K){

		int counter = 0;
		int storing = K;
		int count = N-K;
		int[] result =  new int[N];

		int i=0; // Loop which will starts from the Shift number
		while(i < count){
			 result[counter] = numbers[K];
			 counter++;
			 i++;
			 K++;

		}

		// for the rest number
		for(int l=0; l < storing ;l++){
			result[counter] = numbers[l];
			counter++;
		}

		//Printing
		for(int j = 0; j < counter; j++)
		{
		System.out.print(result[j]+" ");
		}
	}

	//Starting main
	public static void main(String[] args) {

		System.out.print("How many number do you want :");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();

		System.out.print("From what number do want to shift :");
		int K = s.nextInt();

		if(N == K){
			K = K - 1;
		}

		// Generating random numbers
		Random random = new Random();
		int[] numbers = new int[N];
		for(int i = 0; i < N; i++)
		{
		    numbers[i] = random.nextInt(100) + 1;
		    System.out.print(numbers[i]+" ");
		}

		System.out.println();
		solution(numbers,N,K); //Calling function for final result
	} // Ending main

}//End of class
