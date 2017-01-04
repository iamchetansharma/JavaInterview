import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class App {

	public static void mean(double[] numbers, double counter){
		double sum = 0;
		for(int i=0; i<counter; i++){
			sum = sum + numbers[i];
		}
		
		System.out.println("Mean is = "+sum/counter);
	}
	
	public static void median(double[] numbers){
		Arrays.sort(numbers);
		double median = 0;
		double pos1 = Math.floor((numbers.length - 1.0) / 2.0);
	    double pos2 = Math.ceil((numbers.length - 1.0) / 2.0);
	      if (pos1 == pos2 ) {
	         median = numbers[(int)pos1];
	      } else {
	         median = (numbers[(int)pos1] + numbers[(int)pos2]) / 2.0 ;
	      }
	      
	      System.out.println("Median: " + median);
	}
	
	public static void mode(double[] numbers, int counter){
		TreeMap<Double, Integer> t1 = new TreeMap<Double, Integer>();
		
		for(int i=0; i<counter; i++){
			
			if(t1.containsKey(numbers[i]))
				t1.put(numbers[i], t1.get(numbers[i])+1);
			else	
				t1.put(numbers[i],1);
		}
		
		int[] treeValues = new int[t1.size()]; int counterVal = 0;
		double[] treeKeys   = new double[t1.size()]; int counterKeys = 0;
		Collection<Integer> s1 = t1.values();
		for(Integer ss2:s1){
			treeValues[counterVal] = ss2;
			//System.out.println(treeValues[counterVal]);
			counterVal++;
		}
		
		Set<Double> keys = t1.keySet();
        for(Double key: keys){
        	treeKeys[counterKeys] = key;
            //System.out.println(treeKeys[counterKeys]);
            counterKeys++;
        }

		comparsion(treeValues,treeKeys);
		
	}
	
	public static void comparsion(int[] treeValues,double[]treeKeys){
		
        int large = 0;
        int small = 0;
		for(int i=1; i< treeValues.length; i++){
                if(treeValues[i] > large)
                    large = i;
                else
                	small = i;
         }
		System.out.println("Mode :"+treeKeys[large]);
	}
	
	
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("data.txt");
		BufferedReader br  = new BufferedReader(new InputStreamReader(fs));

		String textLine;
		String storingData = "";
		String[] finalData = new String[6];
		int counter = 0;
		while((textLine = br.readLine()) != null){
			storingData = textLine;
			finalData[counter] = storingData;
			counter++;
			storingData = "";
		}
		br.close();
		double[] numbers = new double[counter];
		for(int i=0; i<counter; i++){
			numbers[i] = Double.parseDouble(finalData[i]);
		}
		/*
		for(int i=0; i<counter; i++){
			System.out.println(numbers[i]);
		}
		*/
		
		System.out.println("Enter Your Choice :");
		System.out.println("1 : Mean");
		System.out.println("2 : Median");
		System.out.println("3 : Mode");
		System.out.println();
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		
		if(choice == 1){
			mean(numbers,counter);
		}else if( choice == 2 ){
			median(numbers);
		}else if(choice == 3){
			mode(numbers,counter);
		}else{
			System.out.println("Invalid Input");
		}
		
		
	
	}

}
