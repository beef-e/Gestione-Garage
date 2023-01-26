import java.util.Scanner;

/**
* La classe UserInterface definisce l'interfaccia utente del programma, rendendo possibile all'utente interagire con
 * esso.
 * @author Giammaria Biffi
 * @version 1
 * */
public class UserInterface {
	private Garage garage;
	private Scanner scanner;

	public UserInterface(Garage garage) {
		this.garage = garage;
		scanner = new Scanner(System.in);
	}

	public void start() {
		boolean exit = false;
		while (!exit) {
			System.out.println("Scegli un'opzione:");
			System.out.println("1. Far entrare un veicolo");
			System.out.println("2. Far uscire un veicolo");
			System.out.println("3. Visualizzare posti liberi");
			System.out.println("4. Visualizzare posti occupati");
			System.out.println("5. Esci");
			int scelta = scanner.nextInt();
			scanner.nextLine();
			switch (scelta) {
				case 1:
					farEntrareVeicolo();
					break;
				case 2:
					farUscireVeicolo();
					break;
				case 3:
					garage.visualizzarePostiLiberi();
					break;
				case 4:
					garage.visualizzarePostiOccupati();
					break;
				case 5:
					exit = true;
					break;
				default:
					System.out.println("Opzione non valida.");
					break;
			}
		}
		scanner.close();
	}

	private void farUscireVeicolo() {
		System.out.println("Inserisci la targa del veicolo da far uscire:");
		//come faccio a dire "Per ogni veicolo presente nella lista posti occupati?"
	}

	/**
*
 * Metodo per far entrare un veicolo nel Garage
 * @author Giammaria Biffi*/
	public void farEntrareVeicolo() {
		System.out.println("Inserire il tipo di veicolo (1 per Automobile, 2 per Motocicletta): ");
		int scelta = scanner.nextInt();
		if (scelta == 1) {
			System.out.println("Inserire la targa dell'automobile: ");
			String targa=scanner.nextLine();
			System.out.println("Inserire il modello dell'auto: ");
			String modello=scanner.nextLine();
			System.out.println("Per ragioni logistiche, inserire anche il numero di porte di cui dispoone il modello:");
			int numPorte=scanner.nextInt();
			Automobile auto = new Automobile(targa, modello, numPorte);
			garage.entraVeicolo(auto);
		} else if (scelta == 2) {
			System.out.println("Inserire la targa della motocicletta: ");
			String targa=scanner.nextLine();
			System.out.println("Inserire il modello della motocicletta: ");
			String modello=scanner.nextLine();
			System.out.println("Per ragioni logistiche, inserire anche la cilindrata del modello: ");
			int cilindrata=scanner.nextInt();
			Motocicletta moto = new Motocicletta(targa, modello, cilindrata);
			garage.entraVeicolo(moto);
		} else {
			System.out.println("Scelta non valida. Riprovare.");
		}
	}

}