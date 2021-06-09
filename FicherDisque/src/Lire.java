import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Auteur: raind
* Date: Jun. 9, 2021
* Description: 
*/

public class Lire {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader ficALire;
		BufferedReader entree;
		int c;
		
		ficALire = new FileReader("Ecrire.txt");
		entree = new BufferedReader(ficALire);
		c = entree.read();
		
		while(c != -1) {
			System.out.print((char) c);
			c = entree.read();
		}
		
		entree.close();
		ficALire.close();
	}

}
