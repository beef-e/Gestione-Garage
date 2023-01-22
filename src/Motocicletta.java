/**
*
* La classe Motocicletta estende la classe Veicolo, contiene gli attributi fondamentali caratteristici delle motociclette e non applicabili agli altri veicoli
* @author Giammaria Biffi
* @version 1
* */

public class Motocicletta extends Veicolo {
	private int cilindrata;

	public Motocicletta(String targa, String modello, int cilindrata) {
		super(targa, modello, "moto");
		this.cilindrata = cilindrata;
	}

	public int getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
}
