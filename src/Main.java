public class Main {
	/**
	*
	* il metodo main è il punto di entrata del programma, in cui vengono istanziate le classi garage e UserInterface
	* @author Giammaria Biffi
	* @version 1*/
	public static void main(String[] args) {
		Garage garage = new Garage();
		UserInterface ui = new UserInterface(garage);
		ui.start();
	}
}