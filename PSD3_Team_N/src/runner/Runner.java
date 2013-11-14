package runner;

import java.io.InputStreamReader;
import java.util.Scanner;

import roles.User;

public class Runner {

	public static void main(String[] args) {
		boolean success;
		String username, password;
		Scanner sn = new Scanner(new InputStreamReader(System.in));
		String input;
		
		System.out
				.println("Welcome to our system! If you want to see the full list of commands please type \"-help\""
						+ " and press Enter.");

		do {
			System.out.print("username: ");
			username = sn.next();
			System.out.print("password: ");
			password = sn.next();
			success = User.login(username, password);
		} while (!success);

		input = sn.nextLine();

		while (!input.equals("-exit")) {
			// System.out.println(input);

			input = sn.nextLine();
		}
		sn.close();
		System.out.println("terminated");

	}

}
