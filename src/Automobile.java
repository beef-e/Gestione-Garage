public class Automobile extends Veicolo {
	private int numeroPorte;

	public Automobile(String targa, String modello, int numeroPorte) {
		super(targa, modello, "auto");
		this.numeroPorte = numeroPorte;
	}

	public int getNumeroPorte() {
		return numeroPorte;
	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;
	}
}
