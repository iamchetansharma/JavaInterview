//Program3:Given a string, return true if the first 2 chars in the string also
//appear at the end of the string, such as with "edited"

import java.util.Scanner;
public class StringPrac01{

  public static void main(String a[]){
    System.out.println("Enter a Word :");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();

    int size = input.length();
    char[] ch = new char[size];
    for(int i=0; i<size; i++){
      ch[i] = input.charAt(i);
    }

    //Comparing
    if((ch[0] == ch[size-2]) && (ch[1] == ch[size-1])){
      System.out.println("First 2 and last 2 Matched");
    }else{
      System.out.println("First 2 and last 2 does not Matched");
    }



  }
}
