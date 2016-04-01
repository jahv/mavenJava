package jahv.selfstudy.web;

/**
 * Welcome controller
 * 
 * @author jose.hernandez
 *
 */
public class WelcomeController {

	/**
	 * Method to welcome
	 * @return
	 */
	public static String welcome() {
		return "Welcome";
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(WelcomeController.welcome());
	}

}
