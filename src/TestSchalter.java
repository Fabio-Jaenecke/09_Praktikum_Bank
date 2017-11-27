

/**
 * Diese Klasse ermöglicht die Interaktion mit der Bankverwaltung und repräsentiert dadurch einen Bankschalter.
 * 
 * @author fabio jaenecke
 * @version 1.0
 *  *
 */
public class TestSchalter {

	public static void main(String[] args) {
		
		//Initialisierung der Verwaltung
		Bankverwaltung bankverwaltung;
		bankverwaltung = new Bankverwaltung();
		
		//Die Personen und die Beträge der Konten:
	    Bankkonto konto1 = new Bankkonto("Jolly Jumper", 30000.0);
	    Bankkonto konto2 = new Salaerkonto("Donald Duck", 20000.50, 5000.0);
		Bankkonto konto3 = new Nummernkonto("Justus Jonas", 99000.0);
		Bankkonto konto4 = new Bankkonto("Michael Jackson", 1000000.0);
	    Bankkonto konto5 = new Salaerkonto("Lorem Ipsum", 200.50, 3000.0);
		Bankkonto konto6 = new Nummernkonto("Jack Peter", 9000.0);
		Bankkonto konto7 = new Bankkonto("Madeline Right", 61289.80);
	    Bankkonto konto8 = new Salaerkonto("Trevor True", 20000.0, 400.60);
		Bankkonto konto9 = new Nummernkonto("Millionaer Bob", 1.5);
		
		//Es werden neue Bankkonten erstellt:
		bankverwaltung.bankkontenHinzufuegen(konto1);	
		bankverwaltung.bankkontenHinzufuegen(konto2);
		bankverwaltung.bankkontenHinzufuegen(konto3);
		bankverwaltung.bankkontenHinzufuegen(konto4);	
		bankverwaltung.bankkontenHinzufuegen(konto5);
		bankverwaltung.bankkontenHinzufuegen(konto6);
		bankverwaltung.bankkontenHinzufuegen(konto7);	
		bankverwaltung.bankkontenHinzufuegen(konto8);
		bankverwaltung.bankkontenHinzufuegen(konto9);
		
		//Es finden diverse transaktionen statt:
		konto1.geldAbheben(20000.0);
		konto2.geldAbheben(20002.0);
		konto3.geldAbheben(20000.0);
		konto4.geldEinzahlen(30000.0);
		konto5.geldEinzahlen(61000.0);
		konto6.geldEinzahlen(4500.0);
		konto5.geldAbheben(80000.0);
		konto7.geldEinzahlen(30000.0);
		konto8.geldEinzahlen(0.50);
		konto9.geldEinzahlen(99998.5);
		konto2.geldAbheben(1999.0);
		
		//Gibt die Kontodaten aus:
		bankverwaltung.bankkontenAusgeben();
	}

}
