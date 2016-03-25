package com.foya.sign;

/* Copyright 2008 DidiSoft Ltd. All Rights Reserved. */
import com.didisoft.pgp.PGPLib;

/**
 * This example demonstrates OpenPGP signed file verification.
 *
 * Using the public key of the sender we can verify that he is really the source of the signed file and extract the contents of the file at the same time.
 *
 * This example assumes that the file signed.pgp was only signed with the private key of the sender. (Note that this is different from sign and encrypt in one pass)
 */
public class VerifyFile {

	private static final String TOMMY_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_private.asc";
	private static final String TOMMY_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_public.asc";
	private static final String TSTAR_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_private.asc";
	private static final String TSTAR_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_public.asc";

	public static void main(String[] args) throws Exception {
		// create an instance of the library
		PGPLib pgp = new PGPLib();

		// verify
		boolean validSignature = pgp.verifyFile(
				"e:/123.sign.txt",
				TOMMY_PUBLIC_KEY_PATH,
				"e:/123.valid.txt");
		if (validSignature) {
			System.out.println("Signature is valid.");
		} else {
			System.out.println("!Signature is invalid!");
		}
	}
}
