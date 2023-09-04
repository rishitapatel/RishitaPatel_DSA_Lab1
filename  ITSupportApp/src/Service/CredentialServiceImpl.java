package Service;

import java.util.Random;

import Model.Employee;
import emailInterface.CredentialService;

public class CredentialServiceImpl implements CredentialService {
	
	@Override
	public String generatePassword() {
		String password = "";
		
		String generate="abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		Random rm = new Random();
		char temp;
		for(int i=0;i<8;i++) {
			password += String.valueOf(generate.charAt(rm.nextInt(generate.length())));
		}
		
		
		return password;
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String deparment) {
		String email = firstName.concat(lastName).concat("@").concat(deparment).concat(".xyz").concat(".com");
		return email;
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFisrtName()+" your generated credentails are as follows");
		System.out.println("email --> "+employee.getEmail());
		System.out.println("password--> "+ employee.getPassword());
	}

}
