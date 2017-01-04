//Program2: Given an array of ints, return true if the sequence of
//numbers 1, 2, 3 appears in the array somewhere.

import java.util.Scanner;

public class ArrayConcept{

private static Scanner s;
public static boolean matching(int[] numbers, int num){
    for(int i=0; i<num; i++){
      if((numbers[i] == 1) && (i <= num-2)){
        if(numbers[i+1] == 2){
          if(numbers[i+2] == 3){
            return true;
          }
        }
      }
    }
    return false;
  }
  public static void main(String a[]){

    s = new Scanner(System.in);
    System.out.print("How many numbers do you wanna enter :");
    int num = s.nextInt();
    int[] numbers = new int[num];
    System.out.println("Start Entering Your Numbers ..");
    for(int i=0; i<num; i++){
      numbers[i] = s.nextInt();
    }

    //Printing
    System.out.print("Your Entered Numbers Are :");
    for(int i=0; i<num; i++){
      System.out.print(numbers[i]+ " ");
    }
    System.out.println();
    boolean result =  matching(numbers,num);

    if(result == true){
      System.out.println("The sequence of numbers 1, 2, 3 appears in the array somewhere");
    }else{
      System.out.println("The sequence of numbers 1, 2, 3 does not appears in the array somewhere");
    }

  }
}
