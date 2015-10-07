import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		//boolean isValid = false;
		
		
		while(!person.getIsValid()){
			Scanner input = new Scanner(System.in);
			
				System.out.print("Please enter your age: ");
				person.setAge(input.nextInt());
				
				if(person.getIsValid()){
				System.out.println("\nYou entered: " + person.getAge());	
				}
				
				
		}
		
	}

}
