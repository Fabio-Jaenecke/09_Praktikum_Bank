
import java.util.ArrayList;

/**
 * Diese Klasse verwaltet die Bankkonten
 * 
 * @author fabio jaenecke
 * @version 1.0
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
	public void bankkontenErstellen(Bankkonto konto) {
		bankkonten.add(konto);
	}
	
	/**
	 * @return the bankkonten
	 */
	public void bankkontenAusgeben() {
		for (Bankkonto konto : bankkonten) {
			System.out.println("Inhaber: " + konto.getInhaber() + ", Kontostand: " + konto.aendereZuFranken(konto.getKontostand()) + konto.ueberzugslimitAlsString());
		} 
	}
}
