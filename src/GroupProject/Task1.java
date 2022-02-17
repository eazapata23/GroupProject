package GroupProject;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// #1
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the length of the array: ");
	    int length=scan.nextInt();
	    int[] arr=new int[length];
	    System.out.println("Enter the elements of the array: ");
	    for (int i=0; i<length; i++) {
	   	 arr[i]=scan.nextInt();
	  	  
	    }
	    int sum=0;
	    for(int num:arr) {
	   	 sum+=num;
	  	  
	    }
	    System.out.println("The sum of all elemets in the array is "+sum);
		

		
		
		
		
		
		
		
		
	}

}
