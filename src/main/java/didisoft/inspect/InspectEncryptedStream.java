package didisoft.inspect;

import java.io.*;

import com.didisoft.pgp.*;
import com.didisoft.pgp.inspect.*;

/**
 * Illustrates how to inspect the contents of an OpenPGP encrypt stream
 *
 * Check also: http://www.didisoft.com/java-openpgp/examples/inspect-the-contents-of-an-openpgp-archive/
 */
public class InspectEncryptedStream {

	public static String SRC = System.getProperty("user.dir") + "/src/main/resources/";

	public static void main(String[] args) throws IOException, PGPException {

		System.out.println(SRC);
		// Encrypt a file
		PGPLib pgp = new PGPLib();
		boolean asciiArmor = true;
		pgp.encryptFile(SRC + "examples/DataFiles/INPUT.txt", SRC + "examples/DataFiles/public.key", SRC + "examples/DataFiles/encrypted.pgp",
				asciiArmor);

		// Inspect the content of the encrypted file without decrypting
		PGPInspectLib inspectLib = new PGPInspectLib();

		InputStream privateKey = new FileInputStream(SRC + "examples/DataFiles/private.key");
		String privateKeyPassword = "changeit";
		InputStream encryptedStream = new BufferedInputStream(new FileInputStream(SRC + "examples/DataFiles/encrypted.pgp"));

		ContentItem[] files = inspectLib.listOpenPGPStream(encryptedStream, privateKey, privateKeyPassword);
		for (int i = 0; i < files.length; i++) {
			System.out.print(files[i].getFileName());
			System.out.print(files[i].isDirectory() ? "<DIR>" : "     ");
			System.out.println(files[i].getModificationDate());
		}

		privateKey.close();
		encryptedStream.close();
	}
}
