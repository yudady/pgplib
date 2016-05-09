package didisoft.inspect;

import com.didisoft.pgp.PGPKeyPair;
import com.didisoft.pgp.exceptions.NoPublicKeyFoundException;

import didisoft.keypair.KeyPath;

/**
 * This sample illustrates how to list the signatures in an OpenPGP key created by other keys (users)
 */
public class InspectPublicKeySignatures {

	public static void main(String[] args) throws NoPublicKeyFoundException {
		PGPKeyPair key = new PGPKeyPair(KeyPath.PUBLIC_KEY);

		System.out.println(KeyPath.PUBLIC_KEY);
		System.out.println(KeyPath.PRIVATE_KEY);

		long[] signatureIds = key.getSignedWithKeyIds();
		System.out.println(signatureIds.length);
		for (int i = 0; i < signatureIds.length; i++) {
			System.out.println("Signed with key Id: " + signatureIds[i]);
		}

	}

}
