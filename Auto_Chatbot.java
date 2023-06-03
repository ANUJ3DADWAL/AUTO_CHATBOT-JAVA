package P1;
import java.util.*;
public class after_ed {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your name ---> ");
		String name=input.nextLine();
		System.out.println("Hello "+name+"!");
		System.out.println("*** Welcome to Rising Stars ***");
		boolean b=true;
		while(b) {
			System.out.println("Press 1. Which courses are available");
			System.out.println("Press 2. Contact Details");
			System.out.println("Press 3. Course fees and duration");
			System.out.println("Press 4. Others");
			System.out.println("Press 5. Exit");
			System.out.println();
			System.out.println("Enter your choice ---> ");
			int num=input.nextInt();
			if(num==1) {
				System.out.println("Java");
				System.out.println("C++");
				System.out.println("Python");
				System.out.println("Matlab");
				
			}
			else if(num==2) {
				System.out.println("Address ---> Shop No. 13, Gauri Shankar Mandir, Guru Amar Daas Nagar");
				System.out.println("Phone Number ---> +91 78886-20205");
				System.out.println("+91 82963-63642");
				
			}
			else if(num==3) {
				System.out.println("Course Java, Price= Rs 12000");
				System.out.println("Course C++, Price= Rs 15000");
				System.out.println("Course Python, Price= Rs 11000");
				System.out.println("Course Matlab, Price= Rs 18000");
				
			}
			else if(num==4) {
				System.out.print("Enter your query ---> ");
				input.nextLine();
				String query=input.nextLine();
				System.out.println("We will reach you soon!");
				
			}
			else if(num==5){
				System.out.println("*** Thanks for choosing us ***");
				b=false;
			}
			
				
			
		}
		
		
		

	}



}
