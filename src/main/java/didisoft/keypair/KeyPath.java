package didisoft.keypair;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class KeyPath {
	public static String PUBLIC_KEY;
	public static String PRIVATE_KEY;

	static {
		URL uPub = KeyPath.class.getResource("private.key");
		URL uPri = KeyPath.class.getResource("private.key");
		File fPub = null;
		File fPri = null;
		try {
			fPub = new File(uPub.toURI());
			fPri = new File(uPri.toURI());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		PUBLIC_KEY = fPub.getPath();
		PRIVATE_KEY = fPri.getPath();
	}
}
