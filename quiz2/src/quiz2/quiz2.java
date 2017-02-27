package quiz2;
import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter an initial tuition cost: $"); 
		double tuition=input.nextDouble();
		System.out.println("Please enter a percentage increases rate: "); 
		double percentage=input.nextDouble();
		percentage*=0.01;
		double totalcost=tuition+tuition*(1+percentage)+tuition*(1+percentage)*(1+percentage)+tuition*(1+percentage)*(1+percentage)*(1+percentage);
	
		System.out.printf("Total tuition for a degree is %4.2f ", totalcost);

		input.close();
	}

}
