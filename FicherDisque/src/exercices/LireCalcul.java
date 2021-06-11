/*
* Auteur: raind
* Date: Jun. 9, 2021
* Description: 
*/

package exercices;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LireCalcul {
	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader ficALire;
		BufferedReader entree;
		int c;
		int somme = 0;
		String tempNombre = "";
		
		ficALire = new FileReader("monCalcul");
		entree = new BufferedReader(ficALire);
		c = entree.read();
		
		while(c != -1) {
			if((char)c == '\n') {
				tempNombre = tempNombre.substring(0,tempNombre.length() - 1);
				somme += Integer.parseInt(tempNombre);
				tempNombre = "";
			}
			else {
				tempNombre += (char) c;
			}
			
			c = entree.read();
		}
		
		System.out.println("Somme: " + somme);
		
		String fichier = "monResultat";
		
		FileWriter ficAEcrire;
		PrintWriter sortie;
		
		try {
			ficAEcrire = new FileWriter(fichier);
			sortie = new PrintWriter(ficAEcrire);
			sortie.print(somme);
			sortie.close();
		}
		catch(IOException e) {
			System.out.println("Erreur entrée/sortie");
		}
		
		entree.close();
		ficALire.close();
	}
}
