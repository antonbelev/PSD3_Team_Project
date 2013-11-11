package roles;

public abstract class User {
	
	private String FirstName;
	private String LastName;
	private String email;
	private String ID;

	public String getFirstName() {
		return FirstName;
	}

	public User(String firstName, String lastName, String iD, String email) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.ID = iD;
		this.email = email;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static boolean login(String username, String password)
	{
		if (authenticate(username, password))
		{
			System.out.println("Welcome " + username + "!");
			return true;
		}
		else
		{
			System.out.println("Wrong password or username!");
			return false;
		}
	}
	
	
	//This method should authenticate the user credentials.
	public static boolean authenticate(String username, String password)
	{
		if (username.equals("admin") && password.equals("admin"))
			return true;
		return false;
	}
	
	
	

}
