package application;

import java.util.ArrayList;

public class PSE {
	
	private ArrayList<Integer> value;
	private PSE leftTree, rightTree;
		
	public PSE() {
	}
	
	/**
	 * TODO 
	 * l'objectif de l'algo est de définir la somme des poids des objets en fonctions des objets qui sont mis dans
	 * le sac 
	 * 
	 * fonction récursif ? qui permettrait de faire appel à la fonction sur les arbres fils 
	 * changer à chaque tour les noeuds courants pour toujours ajouter les objets aux fils du noeud courant 
	 * définir les bornes -> valeur borne min à revoir et valeur borne max = maxeight du sac 
	 */
	public void pseAlgorithm(SacADos b) {
		ArrayList<PSE> currents = new ArrayList<>();
		currents.add(this);
		float lowerBoundary = 0, higherBoundary = b.getMaxWeight();
		
		for(Objet o : b.getObjectList()) {
			
		}
	}
	
}
