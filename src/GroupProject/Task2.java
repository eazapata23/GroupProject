package GroupProject;

public class Task2 {

	public static void main(String[] args) {
		// #2
		
		int [][] numbers= {
				{1,3,5,7},
				{2,4,6,8},
				{20,30,40,50},
		};
		int sum11=0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				sum11+=numbers[i][j];
			}
		}
		System.out.println(sum11);

	}

}
