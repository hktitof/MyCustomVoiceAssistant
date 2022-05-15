import java.io.IOException;

public class OpenVoiceMemos {
	public static void main(String[] args) {
		try {

			Runtime.getRuntime().exec(new String[] { "/usr/bin/open", "-a", "/Applications/Voice Memos.app"});

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
