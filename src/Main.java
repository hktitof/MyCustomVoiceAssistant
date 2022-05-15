import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

public class Main extends java.lang.Object{
	public static void main(String[] args) {
		
		try {
			
			Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a", "/Applications/Google Chrome.app", "https://discord.com/channels/936970203974234123/952539365710635058"});
			Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a", "/Applications/Google Chrome.app", "https://app.slack.com/client/T02QPLK37MH/D039ZD5JF5L/user_profile/U039ZCNP7FY"});
			Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a", "/Applications/Visual Studio Code.app","/Users/abdellatifanaflous/Desktop/TrouveTavoie/Project/feverPlatform"});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
