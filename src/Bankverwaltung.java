
import java.util.ArrayList;

/**
 * Diese Klasse verwaltet die Bankkonten
 * 
 * @author fabio jaenecke & daniellerch
 * @version 1.1
 *
 */
public class Bankverwaltung {
	private ArrayList<Bankkonto> bankkonten;

	/**
	 * Initialisiert die Bankverwaltung
	 */
	public Bankverwaltung() {
		bankkonten = new ArrayList<Bankkonto>();
	}
	
	/**
	 * Erlaubt das Hinzufügen von Bankkonten
	 * 
	 * @param konto ein Bankkonto
	 */
	public void bankkontenHinzufuegen(Bankkonto konto) {
		bankkonten.add(konto);
	}
	
	/**
	 * @return the bankkonten
	 */
	public void bankkontenAusgeben() {
		for (Bankkonto konto : bankkonten) {
			System.out.println("Inhaber: " + konto.getInhaber() + ", Kontostand: " + konto.rappenZuFranken(konto.getKontostand()) + konto.ueberzugslimitAlsString());
		} 
	}
}
