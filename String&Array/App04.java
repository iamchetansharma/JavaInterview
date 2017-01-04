//Program4:Given a string and an int n, return a string made of the first n
//characters of the string, followed by the first n-1 characters of the string,
//and so on.

import java.util.Scanner;
public class App04{

  public static void repeatMethod(char[] ch,int size, int num){

    for(int repeat = 1; repeat <= num; repeat--){
      for(int i=0; i<num; i++){
        System.out.print(ch[i]);
      }
      num--;
    }
  }
  public static void main(String a[]){
    System.out.print("Enter a word :");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();

    System.out.print("Enter a number from which you wanna start you splits :");
    int num = s.nextInt();

    int size = input.length();
    char[] ch = new char[size];
    for(int i=0; i<size; i++){
      ch[i] = input.charAt(i);
    }

    repeatMethod(ch,size,num);
    System.out.println();

  }
}
