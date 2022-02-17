package GroupProject;

public class Task9 {

	public static void main(String[] args) {
		// #9
		
		int[] numbers1= {80,10,15,80,60,20,30,40};
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<numbers1.length; i++) {
			if(numbers1[i]>largest) {
				secondLargest=largest;
				largest=numbers1[i];
			}else if(numbers1[i]>secondLargest && numbers1[i]<largest) {
				secondLargest=numbers1[i];
			}
		}
		System.out.println("The second largest number in the array is "+secondLargest);
	
	


	}

}
