import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Auteur: raind
* Date: Jun. 16, 2021
* Description: 
*/

public class PhoneNewFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})?[-.\\s]([0-9]{4})$";
		
		List<String> tel = new ArrayList<String>();
		Scanner crayon = new Scanner(System.in);
		int k = 0;
		String input = "";
		for(int i = 0; i < 5; i++) {
			k = i + 1;
			System.out.println("Inscrire le numéro de télephone " + k);
			input = crayon.nextLine();
			tel.add(input);
		}
		
		crayon.close();
		
		Pattern pattern = Pattern.compile(regex);
		for(String phone : tel) {
			Matcher matcher = pattern.matcher(phone);
			if(matcher.matches()) {
				System.out.println(matcher.replaceFirst("($1) $2-$3"));
			}
		}
	}

}
