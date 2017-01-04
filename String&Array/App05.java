//Program5: The "key" array is an array containing the correct answers to an
//exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's
//answers, with "?" representing a question left blank. The two arrays are not
// empty and are the same length. Return the score for this array of answers,
//giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.

import java.util.Scanner;
import java.util.Arrays;
public class App05{

  public static void result(char[] ans){
    char[] result = new char[] { 'b', 'b', 'c', 'a', 'd' };
    int finalResult = 0;
    for(int i=0; i<5; i++){

      if(ans[i] == '?'){
        finalResult = finalResult + 0;
      }else if(ans[i] == result[i]){
        finalResult = finalResult + 4;
      }else{
        finalResult = finalResult - 1;
      }

    }

    System.out.println("Final Result is : "+finalResult);
  }
  public static void main(String[] a){
    System.out.println("Enter your answer for first five questions:");
    char[] ans = new char[5];
    Scanner s = new Scanner(System.in);

    for(int i=0; i<5; i++){
      ans[i] = s.next(".").charAt(0);
    }

    result(ans);

  }
}
