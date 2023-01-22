import java.util.ArrayList;
import java.util.List;

/**
 * La classe Garage definisce tutti gli attributi del nostro garage e ci permette di modificarli, andando a cambiare
 * il numero di posti liberi o occupati al suo interno
 * @author Giammaria Biffi
 * @version 0.5*/
public class Garage {
	private final int POSTI_AUTO = 15;
	private final int POSTI_MOTO = 10;
	private final int POSTI_TOTALI = POSTI_AUTO+POSTI_MOTO;
	private final int TARIFFA_AUTO = 2;
	private final int TARIFFA_MOTO = 1;
	private List<Veicolo> postiOccupati;
	private List<Integer> postiLiberi;

	public Garage() {
		postiOccupati = new ArrayList<>();
		postiLiberi = new ArrayList<>();
		for (int i = 1; i <= POSTI_TOTALI; i++) {
			postiLiberi.add(i);
		}
	}

	public boolean entraVeicolo(Veicolo veicolo){
		if (postiOccupati.size() >= POSTI_TOTALI) {
			System.out.println("Il garage è pieno, non è possibile fare entrare altri veicoli.");
			return false;
		}
		int posto = 0;
		if (veicolo instanceof Automobile) {
			if (postiLiberi.size() <= POSTI_AUTO) {
				System.out.println("Non ci sono posti per le automobili disponibili.");
				return false;
			}
			posto = postiLiberi.get(0);
			postiLiberi.remove(0);
		} else if (veicolo instanceof Motocicletta) {
			if (postiLiberi.size() <= POSTI_MOTO) {
				System.out.println("Non ci sono posti per le motociclette disponibili.");
				return false;
			}
			posto = postiLiberi.get(0);
			postiLiberi.remove(0);
		}
		veicolo.setPosto(posto);
		postiOccupati.add(veicolo);
		System.out.println("Il veicolo con targa " + veicolo.getTarga() + " è stato fatto entrare nel garage al posto " + posto + ".");
		return true;
	}

	public int uscitaVeicolo(Veicolo veicolo, int ore) {
		if (!postiOccupati.contains(veicolo)) {
			System.out.println("Spiacenti, Il veicolo non è presente nel garage.");
			return 0;
		}
		int prezzo = 0;
		if (veicolo instanceof Automobile) {
			prezzo = ore * TARIFFA_AUTO;
		} else if (veicolo instanceof Motocicletta) {
			prezzo = ore * TARIFFA_MOTO;
		}
		postiOccupati.remove(veicolo);
		postiLiberi.add(veicolo.getPosto());
		return prezzo;
	}

	public void visualizzarePostiLiberi() {
		System.out.println("Posti liberi: " + postiLiberi);
	}

	public void visualizzarePostiOccupati() {
		System.out.println("Posti occupati:");
		//come faccio a dirgli (per ogni veicolo all'interno della lista posti occupati?)
	}

}