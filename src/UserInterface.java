import java.util.Scanner;

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

	}

	private void farEntrareVeicolo(){}
}