package GroupProject;

public class Task6 {

	public static void main(String[] args) {
		// #6
		
		int num3=13;
		  boolean isPrime=true;
		  
		  for(int x=2;x<num3/2; x++) {
			  if(num3%1==0) {
				  isPrime=false;
				  break;
			  }
		  	 }
			if(isPrime) {
				System.out.println(num3+" is a Prime number!");
			}else {
				System.out.println("Not a prime number!");
		}

	}

}
