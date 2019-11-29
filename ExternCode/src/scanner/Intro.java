package scanner;

import java.util.Scanner;

public class Intro {

	public static void main(String[] args) {

		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter your name:\t");
		String user = a.next();
		
		System.out.println("Are you admin?\t");
		char response = a.next().charAt(0);
		
		
		isAdminDeterminator(response, user);
		a.close();
		
	}
	
	public static void isAdminDeterminator(char response, String user) {
		if(response == 'Y')
		{
			if(user.contentEquals("Anupam"))
			{
				System.out.println("Welcome " + user);
			}
			
			else 
			{
				System.out.println("Not admin!");
			}
		}
		
		else
		{
			System.out.println("Welcome ..." + user);

		}
	}
}
