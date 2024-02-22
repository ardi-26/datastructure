package Perseritje;

import java.util.Scanner;

import javax.net.ssl.SSLContext;

/**
 * Programi lexon nga perdoruesi nje numer te plote qe perfaqeson
 * numrin e sekondave dhe afishon ne ekran numrin e oreve, minutave dhe
 * sekondave.
 * 
 * Shkruaj sekondat: 10000
 * 10000 sekonda jane 2 ore 46 minuta 40 sekonda
 * 
 * @author student
 *
 */
public class KonvertimSekonda {

	public static void main(String[] args) {
		int sekonda;
		System.out.print("Shkruaj sekondat: ");
		Scanner s = new Scanner(System.in);
		sekonda = s.nextInt();
		System.out.printf("%d sekonda jane %d ore %d minuta %d sekonda",
				sekonda, sekonda / 3600, (sekonda % 3600)/60, (sekonda%360)%60
				);
	}

}




















