package com.foya.two;

/* Copyright 2008 DidiSoft Ltd. All Rights Reserved. */
import com.didisoft.pgp.PGPLib;

/**
 * This example demonstrates how to decrypt and verify a one pass signed and encrypted OpenPGP archive.
 */
public class DecryptAndVerify {

	private static final String TOMMY_PRIVATE_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tommy_private.asc";
	private static final String TOMMY_PUBLIC_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tommy_public.asc";
	private static final String TSTAR_PRIVATE_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tstar_private.asc";
	private static final String TSTAR_PUBLIC_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tstar_public.asc";



	public static void main(String[] args) throws Exception {
		// create an instance of the library
		PGPLib pgp = new PGPLib();

		String privateKeyPassword = "123456";
		boolean validSignature = pgp.decryptAndVerifyFile(
				"e:/123.sign.en.txt",
				TSTAR_PRIVATE_KEY_PATH,
				privateKeyPassword,
				TOMMY_PUBLIC_KEY_PATH,
				"e:/123.verify.decrypt.txt");
		if (validSignature) {
			System.out.println("Signature is valid.");
		} else {
			System.out.println("Signature is invalid!");
		}
	}
}
