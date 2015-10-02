import java.util.Scanner;

public class Eq2deg {
	public static void main(String [] args){
		double a=0,b=0,c=0,delta=0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Veuillez saisir a :");
		a = scan.nextDouble();

		System.out.println("Veuillez saisir b :");
		b = scan.nextDouble();

		System.out.println("Veuillez saisir c :");
		c = scan.nextDouble();
		
		delta=(b*b)-4*a*c;
		
		if(a!=0){
			if(delta==0){
				double sol=-b/(2*a);
				System.out.println("1 seule solution : " + sol);
			}
			else if(delta>0){
				double racine = Math.sqrt(delta);
				double x1=(-b - racine)/(2*a);
				double x2=(-b + racine)/(2*a);
				System.out.println("2 solutions : " + x1 + " et " + x2);
			}
			else{
				System.out.println("Pas de solution réelle.");
			}
		}
		else{
			System.out.println("Erreur : division par zéro.");
		}
	}
}
