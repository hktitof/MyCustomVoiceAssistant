import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class Test {

	
	
	
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
			Document document = Jsoup.connect("https://coinmarketcap.com/currencies/bitcoin/").followRedirects(false).timeout(8000).get();
			String value =document.body().getElementsByClass("PriceValue").text();
			System.out.println(value);
//			speak(value.substring(1, 10)+" $");

		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
