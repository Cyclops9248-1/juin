import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
* Auteur: raind
* Date: Jun. 9, 2021
* Description: 
*/

public class Ecrire1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fichier = "Ecrire.txt";
		String s1 = "Hello guys welcome ";
		String s2 = "to my minecraft letsplay";
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
		
		try {
			ficAEcrire = new FileWriter(fichier);
			sortie = new PrintWriter(ficAEcrire);
			sortie.print(s1);
			sortie.print(s2);
			sortie.close();
		}
		catch(IOException e) {
			System.out.println("Erreur entrée/sortie");
		}
	}

}
