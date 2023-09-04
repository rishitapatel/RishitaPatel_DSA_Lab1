package Model;

public class Employee {

	private String fisrtName;
	private String lastName;
	private String email;
	private String password;

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [fisrtName=" + fisrtName + ", lastName=" + lastName + ", email=" + email + ", password=" + password + "]";
	}

	public Employee() {
		super();
	}

	public Employee(String fisrtName, String lastName) {
		super();
		this.fisrtName = fisrtName;
		this.lastName = lastName;
	}

}
