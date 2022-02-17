package GroupProject;

public class Task8 {

	public static void main(String[] args) {
		// #8
		
int nums[]= {12,30,10,2,89,14};
		
		int min=nums[0];
		int max=nums[0];
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<min) {
				min=nums[i];
			}
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println("The minimim number is "+min+" and the naximim number is "+max);

	}

}
