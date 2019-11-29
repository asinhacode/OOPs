/**
 * 	Create a 8 character password
 * 	-----------------------------
 * 	At least
 * 	1. Must have a small letter
 * 	2. Must have a capital letter.
 * 	3. Must have a special letter.
 * 	4. Must have a number.
 */

package password;

import java.util.ArrayList;

public class Trial1 
{

	public static void main(String[] args) 
	{
		
	}
	/**
	 *  Select at random anyone of the arrays
	 * @return
	 */
	public static String password() 
	{
		int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5 };
		char[] smallLetter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y' };
		char[] capitalLetter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y' };
		String[] string1 = {"!", "@", "#","$","%","^","&","*","(", ")", "_", "-", "+", "=", "~", "`", "!", "@", "#","$","%","^","&","*","(", ")"};
		
		//Object[] All = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y' , 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y' , "!", "@", "#","$","%","^","&","*","(", ")", "_", "-", "+", "=", "~", "`"};
		
		Object[] All = {number, smallLetter, capitalLetter, string1};
		
		
		
		
		
		String[] password = new String[8];
		ArrayList<String> p = new ArrayList<String>();
		
		// choice for number, small, capital or String
		for(int i = 0; i < 8; i++)
		{
			
			// choose from one of the 4
			for(int j = 0; j < 4; j++) {
				int choice = (int) (Math.random() * 4);

				// choose from 1 of the 26
				for(int k = 0; k < 26; k++) {
					int choice2 = (int) (Math.random() * 26);

					p.add((object)All[choice][choice2]);
				}
			}

		}
		return null;
	}

}
