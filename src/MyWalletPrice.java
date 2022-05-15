import java.io.IOException;

import org.jsoup.Jsoup;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class MyWalletPrice {
	

	
	
	
	public static  void speak(String text) {
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice textaudio;
        textaudio = VoiceManager.getInstance().getVoice("kevin16");
        if (textaudio != null) {
            textaudio.allocate();
        }
        try {
            textaudio.setRate(100);
            textaudio.setPitch(150);
            textaudio.setVolume(6);
            textaudio.speak(text);
        } catch (Exception e) {
            e.printStackTrace();
        }

        
	}
	
	
	public static void main(String[] args) {
		
		try {
			
			System.out.println((String.valueOf(Float.parseFloat(
					Jsoup.connect("https://www.binance.com/en/price/wax").followRedirects(false).timeout(8000)
					.get().body().getElementsByClass("css-12ujz79").text().substring(2, 10))*415).substring(0, 5)+" $"));


		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}
}
