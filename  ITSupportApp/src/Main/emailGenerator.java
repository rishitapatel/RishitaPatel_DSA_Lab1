package Main;

import java.util.Scanner;

import Model.Employee;
import Service.CredentialServiceImpl;

public class emailGenerator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee e1 = new Employee("rishita", "patel");

		CredentialServiceImpl cs = new CredentialServiceImpl();

		System.out.println("Welcome page");

		System.out.println("---------------------");

		System.out.println("Please enter option fro department from the following");

		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Integer userinput = sc.nextInt();

		String generatedemail = null;
		String generatedpassword = null;

		switch (userinput) {

		case 1: {

			generatedemail = cs.generateEmailAddress(e1.getFisrtName(), e1.getLastName(), "Tech");
			generatedpassword = cs.generatePassword();
			break;
		}
		case 2: {

			generatedemail = cs.generateEmailAddress(e1.getFisrtName(), e1.getLastName(), "Admin");
			generatedpassword = cs.generatePassword();
			break;
		}
		case 3: {

			generatedemail = cs.generateEmailAddress(e1.getFisrtName(), e1.getLastName(), "HR");
			generatedpassword = cs.generatePassword();
			break;
		}
		case 4: {

			generatedemail = cs.generateEmailAddress(e1.getFisrtName(), e1.getLastName(), "Legal");
			generatedpassword = cs.generatePassword();

			break;
		}

		default: {
			System.out.println("Please enter valid option");
			break;
		}
		
		}
		if(generatedemail!=null) {
		e1.setEmail(generatedemail);
		e1.setPassword(generatedpassword);
		cs.showCredentials(e1);
		}
		
	}
}
