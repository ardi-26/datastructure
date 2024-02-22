package Perseritje;

import java.util.Scanner;

/*
 * Programi lexon nga perdoruesi rrezen e rrethit (double)
 * dhe afishon me dy shifra pas presjes siperfaqen dhe perimetrin
 * Nese rrezja eshte numer negativ ose zero te afishohet mesazhi:
 * Gabim rrezja duhet te jete nje numer pozitiv
 * 
 */
public class Rrethi {

	public static void main(String[] args) {
		double rrezja;
		Scanner s = new Scanner(System.in);
		System.out.println("Shkruaj rrezen(cm): ");
		rrezja = s.nextDouble();
		
		if(rrezja <=0) 
			System.out.println("Gabim rrezja duhet te jete nje numer pozitiv!");
		else
		{
			double perimeter = 2* Math.PI * rrezja;
			double siperfaqe = Math.PI * rrezja * rrezja;
			System.out.printf("Perimetri dhe siperfaqja e rrethit me rreze "+
					"%.2f cm jane %.2f cm dhe %.2f cm2", rrezja, perimeter, siperfaqe
					
					);
		}

	}
	
	
	
	
	
	
	
	
	
	

}








