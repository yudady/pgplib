package com.foya.sign;
import java.io.IOException;

import com.didisoft.pgp.PGPException;
/*
 * Copyright 2008 DidiSoft Ltd. All Rights Reserved.
 */
import com.didisoft.pgp.PGPLib;
import com.didisoft.pgp.exceptions.WrongPasswordException;

/**
 * This example demonstrates OpenPGP signing with no encryption.
 *
 * We use our private key for creating the digital signature and our partners
 * will use our public key to verify it.
 */
public class SignFile {

	private static final String TOMMY_PRIVATE_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tommy_private.asc";
	private static final String TOMMY_PUBLIC_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tommy_public.asc";
	private static final String TOMMY_PASSWORD = "tommy";
	private static final String TSTAR_PRIVATE_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tstar_private.asc";
	private static final String TSTAR_PUBLIC_KEY_PATH = "F:/foya/02.tommy4Git/gpg/src/main/resources/tstar_public.asc";
	private static final String TSTAR_PASSWORD = "123456";



	public static void main(String[] args) {
		// initialize the library
		PGPLib pgp = new PGPLib();

		// specify should the output be ASCII or binary
        boolean asciiArmor = true;
		try {
			pgp.signFile("e:/123.en.txt",
					TSTAR_PRIVATE_KEY_PATH,
					TSTAR_PASSWORD,
						"e:/123.en.sign.txt",
						asciiArmor);
		} catch (WrongPasswordException e) {
			e.printStackTrace();
		} catch (PGPException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
