package runner;

import java.io.InputStreamReader;
import java.util.Scanner;

import roles.User;

public class Runner {

	public static void main(String[] args) {

		System.out
				.println("Welcome to our system! If you want to see the full list of commands please type \"-help\""
						+ " and press Enter.");

		System.out.print("username: ");
		Scanner sn = new Scanner(new InputStreamReader(System.in));
		//System.out.println("a");
		String username, password;

		
		username = sn.next();
		//System.out.println("test username: " + username);
		System.out.print("password: ");
		password = sn.next();
		//System.out.println("test password: " + password);
		boolean success = User.login(username, password);		
		String input;
		input = sn.nextLine();	
		
		while (!input.equals("-exit")) {
			//System.out.println(input);

			input = sn.nextLine();
		}
		
		System.out.println("terminated");

	}

}
