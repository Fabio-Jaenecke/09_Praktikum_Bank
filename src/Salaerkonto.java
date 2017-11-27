

/**
 * @author fabio jaenecke
 * @version 1.0
 *
 */
public class Salaerkonto extends Bankkonto {
	private int ueberzugslimit;
	
	/**
	 * @param kontoinhaber der Inhaber des Kontos
	 * @param ueberzugslimit das Ueberzugslimit in Franken
	 */
	public Salaerkonto(String kontoinhaber, double ueberzugslimit) {
		super(kontoinhaber);
		int ueberzugsLimitInRappen = frankenZuRappen(ueberzugslimit);
		if (ueberzugsLimitInRappen <= 1000000 && ueberzugsLimitInRappen >= 0) {
			this.ueberzugslimit = ueberzugsLimitInRappen;
		} else {
			this.ueberzugslimit = 0;
		}
		
	}
	
	/**
	 * @param kontoinhaber der Inhaber des Kontos
	 * @param eroeffnungsbetrag die Ersteinzahlung beim erstellen des Kontos in Franken.
	 * @param ueberzugslimit das Ueberzugslimit in Franken
	 */
	public Salaerkonto(String kontoinhaber, double eroeffnungsbetrag, double ueberzugslimit) {
		super(kontoinhaber, eroeffnungsbetrag);
		int ueberzugsLimitInRappen = frankenZuRappen(ueberzugslimit);
		if (ueberzugsLimitInRappen <= 1000000 && ueberzugsLimitInRappen >= 0) {
			this.ueberzugslimit = ueberzugsLimitInRappen;
		} else {
			this.ueberzugslimit = 0;
		}
		
	}
    
	/**
	 * Erlaubt das Abheben vom Konto. Sollte der abzuhebende Betrag unter das Überzugslimit fallen,
	 * ist das Konto neu im maximalen Überzugslimit.
	 * 
	 * @param abzuhebenderbetrag
	 */
	@Override
	public void geldAbheben(double abzuhebenderbetrag) {
		int abhebenInRappen = frankenZuRappen(abzuhebenderbetrag);
		if ((getKontostand() - abhebenInRappen) < (0 - ueberzugslimit)) {
			int bezugslimit = (getKontostand() + ueberzugslimit);
			System.out.println("Sie dürfen nur " + bezugslimit + "CHF abheben.");
			setKontostand(-ueberzugslimit); 
		} else {
			setKontostand(getKontostand() - abhebenInRappen);
		}
	}
	
	
	@Override
	public String ueberzugslimitAlsString() {
		return ", Ueberzugslimite: " + rappenZuFranken(getUeberzugslimit());
	}

	/**
	 * @return the ueberzugslimit
	 */
	public int getUeberzugslimit() {
		return ueberzugslimit;
	}
}
