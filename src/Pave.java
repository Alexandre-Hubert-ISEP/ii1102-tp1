import java.util.Scanner;

public class Pave {
	public static void main(String [] args){
		double volume=0,longueur=0,largeur=0,hauteur=0;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Veuillez saisir la longueur :");
			longueur = scan.nextDouble();
		}while(longueur<0);
		do{
			System.out.println("Veuillez saisir la largeur :");
			largeur = scan.nextDouble();
		}while(largeur<0);
		do{
			System.out.println("Veuillez saisir la hauteur :");
			hauteur = scan.nextDouble();
		}while(hauteur<0);
		volume=longueur*largeur*hauteur;
		System.out.println("Volume du pavé : " + volume);
	}
}
