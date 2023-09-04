package emailInterface;

import Model.Employee;

public interface CredentialService {

	
	public String generatePassword();
	public String generateEmailAddress(String firstName, String lastName,String deparment); 
	public void showCredentials(Employee employee); 
	
	
	
}
