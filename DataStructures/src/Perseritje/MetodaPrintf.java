package Perseritje;

public class MetodaPrintf {

	public static void main(String[] args) {
		/* Metoda printf eshte akronim i print formatted
		 * Parametri i pare eshte formati(maska) i perbere nga ato qe
		 * quhen placeholdera % pasura me nje tip te dhenash
		 * 
		 * %d numer te plote
		 * %f numer me presje
		 * %s nje string
		 * %c nje karakter te vetem
		 * %.2f nje numer me presje te rrumbullakosur me dy shifra pas presjes
		 * %3d numri i plte ze tre pozicione ne ekran te plotesuara me hapesire
		 * sipas rastit.
		 * %-3d hapesirat shtohen djathtas
		 * 
		 * Parmetrat e tjere jane aq placeholdera sa ndodhen tek formati.
		 * 
		 * 
		 */
		System.out.printf("%3d\n", 6);
		System.out.printf("%s%.2f"
				,"Vlera e pi me dy shifra pas presjes ", 3.14154545
				);
		System.out.printf("\n%.3f",10.1456788888);
	}

}












