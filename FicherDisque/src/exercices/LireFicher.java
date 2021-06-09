/*
* Auteur: raind
* Date: Jun. 9, 2021
* Description: 
*/

package exercices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LireFicher {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader ficALire;
		BufferedReader entree;
		int c;
		int nombreDeA = 0;
		
		ficALire = new FileReader("monFichier");
		entree = new BufferedReader(ficALire);
		c = entree.read();
		
		while(c != -1) {
			if((char)c == 'a') nombreDeA += 1;
			c = entree.read();
		}
		
		System.out.println("Nombre de charactères A: " + nombreDeA);
		
		entree.close();
		ficALire.close();
	}
	
	 
}
