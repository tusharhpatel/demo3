import java.util.Scanner;

public class demp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p,q,r;
		
		Scanner home = new Scanner(System.in);
		System.out.print("enter p value");
		p=home.nextInt();
		
		System.out.print("enter q value ");
		q=home.nextInt();
		
		System.out.print("enter r value");
		r=home.nextInt();
		
		
		System.out.println("Interest=" +(p*q/r));
		
		

	}

}
