import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.management.RuntimeErrorException;

public class OpenCrypto extends java.lang.Object{
	public static void main(String[] args) {
		
		try {
			
			Runtime.getRuntime().exec(new String[]{"/usr/bin/open", "-a",
					"/Applications/Google Chrome.app", 
					"https://coinmarketcap.com/currencies/wax/"});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
