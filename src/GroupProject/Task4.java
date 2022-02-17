package GroupProject;

public class Task4 {

	public static void main(String[] args) {
		// #4
		
		int num1[][]= {
				{2,4,6,5,8,7},
				{13,21,37,19,62,69},
		};
		int sumEven=0;
		int sumOdd=0;
		for(int x=0; x<num1.length;x++) {
			for(int y=0; y<num1[x].length;y++) {
				if(num1[x][y]%2==0) {
					sumEven=sumEven+num1[x][y];
				}else {
					sumOdd=sumOdd+num1[x][y];
				}
			}
		}
		System.out.println("The sum of even numbers is = "+sumEven);
		System.out.println("The sum of odd numbers is = "+sumOdd);

		
		
		
		
	}

}
