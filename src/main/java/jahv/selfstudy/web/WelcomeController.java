package jahv.selfstudy.web;

import org.apache.commons.lang3.StringUtils;

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
		System.out.println(StringUtils.capitalize(WelcomeController.welcome()));
	}

}
