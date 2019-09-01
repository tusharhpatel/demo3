import java.util.Scanner;

public class else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		 Scanner group= new Scanner(System.in);
		 
		 System.out.print("enter a value");
		 a= group.nextInt();
		 System.out.print("enter b value");
		 b= group.nextInt();
		 System.out.print("enter c value");
		 c=group.nextInt();
		 
		 if(a>b && a>c)
		 {
			 System.out.println("a has greater value");
		 }
		 else if(b>c && b>a)
		 {
			 System.out.println("b has greater value");
		 }
		 else if(c>a && c>b)
		 {
			 System.out.println("c has greater value");
		 }
		 else 
		 {
			 System.out.println("All are same");
		 }
		 
		 }
		 	
		 

	}



