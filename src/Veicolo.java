/**
 * La classe Veicolo rappresenta un veicolo generico che pu&ograve; essere un'automobile o una motocicletta.
 * Essa fornisce le informazioni di base su un veicolo come la targa, il modello e il posto assegnato nel garage.
 * @author Giammaria Biffi
 * @version 1
 * */
public class Veicolo {
	/*
	* targa è una stringa che indica la targa del veicolo*/
	private String targa;
	/*
	* modello è una stringa che indica il modello del veicolo*/
	private String modello;
	/*
	 * tipo è una stringa che indica il tipo di veicolo*/
	private String tipo;
	/*
	* posto è un intero che indica il posto assegnato al veicolo*/
	private int posto;


	public Veicolo(String targa, String modello, String tipo) {
		this.targa = targa;
		this.modello = modello;
		this.tipo = tipo;
	}

	/*
	* ritorna la targa del veicolo
	* @return targa del veicolo*/
	public String getTarga() {
		return targa;
	}

	/*
	* assegna una targa al veicolo
	* @param targa del veicolo*/
	public void setTarga(String targa) {
		this.targa = targa;
	}

	/*
	 * ritorna il modello del veicolo
	 * @return modello del veicolo*/
	public String getModello() {
		return modello;
	}

	/*
	 * assegna il modello al veicolo
	 * @param modello del veicolo*/
	public void setModello(String modello) {
		this.modello = modello;
	}

	/*
	 * ritorna il tipo del veicolo
	 * @return tipo del veicolo*/
	public String getTipo() {
		return tipo;
	}

	/*
	 * assegna il tipo al veicolo
	 * @param tipo del veicolo*/
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/*
	 * assegna il posto al veicolo
	 * @param posto del veicolo*/
	public void setPosto(int posto) {
		this.posto = posto;
	}

	/*
	 * ritorna il posto del veicolo
	 * @return posto del veicolo*/
	public int getPosto() {
		return posto;
	}
}

