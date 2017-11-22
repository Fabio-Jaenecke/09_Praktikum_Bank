package bankverwaltung;

/**
 * Hier werden die Bankkonten erstellt.
 * Der Kontostand und das Kontolimit ist in Rappen gespeichert.
 * 
 * @author fabio jaenecke
 * @version 1.0
 *
 */
public class Bankkonto {
	private String inhaber;
	private int kontostand;
	private final static int kontolimit = 10000000;
	
	/**
	 * @param kontoinhaber der Kontoinhaber
	 * @param eroeffnungsbetrag der Kontostand in Franken
	 */
	public Bankkonto(String kontoinhaber, double eroeffnungsbetrag) {
		int eroeffnungsbetragInRappen = aendereZuRappen(eroeffnungsbetrag);
		this.inhaber = kontoinhaber;
		if (eroeffnungsbetragInRappen <= kontolimit) {
			this.kontostand = eroeffnungsbetragInRappen;
		} else {
			this.kontostand = 0;
		}
	}

	/**
	 * Erlaubt die Kontoeinzahlung, wobei das Kontolimit nicht überschritten werden darf.
	 * 
	 * @param einzahlungsbetrag der Betrag der eingezahlt wird
	 */
	public void geldEinzahlen(double einzahlungsbetrag) {
		int einzahlungsbetragInRappen = aendereZuRappen(einzahlungsbetrag);
		if ((kontostand + einzahlungsbetragInRappen) <= kontolimit) {
			kontostand += einzahlungsbetragInRappen; 
		} else {
			kontostand = kontolimit;
		}
	}
	
	/**
	 * Erlaubt das Abheben vom Konto. Sollte der abzuhebende Betrag unter 0 fallen, hat das Konto neu 0 Geld.
	 * 
	 * @param abzuhebenderbetrag
	 */
	public void geldAbheben(double abzuhebenderbetrag) {
		int abhebenInRappen = aendereZuRappen(abzuhebenderbetrag);
		if ((kontostand - abhebenInRappen) < 0) {
			kontostand = 0; 
		} else {
			kontostand -= abhebenInRappen;
		}
	}
	
	/**
	 * @return the inhaber
	 */
	public String getInhaber() {
		return inhaber;
	}

	/**
	 * @return the kontostand in Rappen.
	 */
	public int getKontostand() {
		return kontostand;
	}
	
	/**
	 * Setzt den Kontostand. Diese sollte protected bleiben und wird
	 * für Berechnungen verwendet.
	 * 
	 * @param kontostand the kontostand to set
	 */
	protected void setKontostand(int kontostand) {
		this.kontostand = kontostand;
	}
	
	/**
	 * @return nichts, ausser es wird überschrieben
	 */
	public String ueberzugslimitAlsString() {
		return "";
	}
	
	/**
	 * Rechnet Geldbeträge in Franken um.
	 * 
	 * @param wert Geldbetrag in Rappen
	 */
	protected double aendereZuFranken(int wert) {
		return (double) (wert / 100);
	}
	
	/**
	 * Rechnet Geldbeträge in Rappen um.
	 * 
	 * @param wert Geldbetrag in Franken
	 */
	protected int aendereZuRappen(double wert) {
		return (int) (wert * 100);
	}
	
}