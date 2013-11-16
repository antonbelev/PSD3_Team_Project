package roles;

import java.util.Scanner;

public abstract class User {
	
	private String FirstName;
	private String LastName;
	private String email;
	private String ID;
	
	public User()
	{
		
	}

	public User(String firstName, String lastName, String iD, String email) {
		this.FirstName = firstName;
		this.LastName = lastName;
		this.ID = iD;
		this.email = email;
	}
	
	public String getFirstName() {
		return FirstName;
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
	
	public static User login(String username, String password)
	{
		if (authenticate(username, password))
		{
			User user = null;
			System.out.println("Welcome " + username + "!");
			if (username.equals("admin"))
			{
				user = new TeachingAdmin("Harry", "Potter", "12345", "harry.potter@gmail.com");
				user.getHelp();
			}
			else if (username.equals("lecturertutor"))
			{
				user = new LecturerTutor("Albus", "Dumbledore", "anOldId", "harry.is@weak.com");
				user.getHelp();
			}
			
			return user;
		}
		else
		{
			System.out.println("Wrong password or username!");
			return null;
		}
	}	
	
	//This method should authenticate the user credentials.
	public static boolean authenticate(String username, String password)
	{
		if (username.equals("admin") && password.equals("admin"))
			return true;
		else if (username.equals("lecturertutor") && password.equals("lecturertutor"))
			return true;
		return false;
	}
	
	/**
	 * Gets list of available commands for the current user and prints them to the standard output.
	 */
	public abstract void getHelp();
	
	/**
	 * Executes user specific command. Prints out an error message if the command is invalid.
	 * @param command Takes a string command.
	 */
	public abstract void processCommand(String command, Scanner sn);
	

}
