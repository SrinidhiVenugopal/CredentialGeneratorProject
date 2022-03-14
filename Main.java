package com.credentials.main;
import java.util.Scanner;
import com.credential.model.Employee;
import com.credential.service.CredentialService;
public class Main {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("First Name:");
		String firstName=s.nextLine();
		System.out.println("Second Name:");
		String lastName=s.nextLine();
		
		Employee E= new Employee(firstName,lastName);
		CredentialService cs = new CredentialService();
		System.out.println("Please enter the department from below following list:");
		System.out.println(" 1.Technical\n 2.Admin\n 3.Human Resource\n 4.Legal");
		int option= s.nextInt();
		
		switch(option)
		{
		case 1:
			cs.showCredential(E, "tech");
			break;
			
		case 2:
			cs.showCredential(E, "admin");
			break;
			
		case 3:
			cs.showCredential(E, "hr");
			break;
			
		case 4:
			cs.showCredential(E, "legal");
			break;

		default:
			System.out.println("Invalid Department!");
			break;

	}
		s.close();
	}
}
