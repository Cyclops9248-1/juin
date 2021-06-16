import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Auteur: raind
* Date: Jun. 16, 2021
* Description: 
*/

public class ValidPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner crayon = new Scanner(System.in);
		System.out.println("Inscrire le num�ro de t�lephone au format (123)-456-7890 Ext 234");
		String input = crayon.nextLine();
		verifPhone(input);
		crayon.close();
	}
	
	private static void verifPhone(String tel) {
		Pattern pattern = Pattern.compile("\\(\\d{3}\\)[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}\\s(X|Ext)\\s\\d{3,5}");
		Matcher matcher = pattern.matcher(tel);
		if(matcher.matches()) {
			System.out.println("Le num�ro " + tel + " est valide");
		}
		else {
			System.out.println("Le num�ro " + tel + " n'est pas valide");
		}
	}

}
