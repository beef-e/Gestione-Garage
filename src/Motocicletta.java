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
