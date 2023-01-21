public class Main {
	public static void main(String[] args) {
		Garage garage = new Garage();
		UserInterface ui = new UserInterface(garage);
		ui.start();
	}
}