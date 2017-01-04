//Program 1 : Given a string and a non-negative int n, return a larger string
//that is n copies of the original string.


import java.lang.String;
import java.util.Scanner;
public class stringPrac{

  public static void main(String a[]){
    String input = "hi";
    Scanner s = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int i =  s.nextInt();

    String result="";
    for(int j=0; j<i; j++){
      result = result+""+input; // or result.concat(input);
    }
    System.out.println(result);
  }

}
