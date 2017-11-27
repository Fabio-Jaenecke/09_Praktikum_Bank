

/**
 * @author fabio jaenecke
 * @version 1.0
 *
 */
public class Nummernkonto extends Bankkonto {
	private static int kontonummern = 1000;
	private int kontonummer;
	
	/**
	 * @param kontoinhaber
	 * @param kontostand
	 */
	public Nummernkonto(String kontoinhaber) {
		super(kontoinhaber);
		kontonummer = kontonummern;
		kontonummern++;
	}

	/**
	 * @param kontoinhaber
	 * @param kontostand
	 */
	public Nummernkonto(String kontoinhaber, double eroeffnungsbetrag) {
		super(kontoinhaber, eroeffnungsbetrag);
		kontonummer = kontonummern;
		kontonummern++;
	}
	
	/**
	 * @return the the kontonummer instead of the inhaber
	 */
	@Override
	public String getInhaber() {
		return String.valueOf(kontonummer);
	}
}
