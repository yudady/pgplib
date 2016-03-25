package com.foya.sign;
/*
 * Copyright 2008 DidiSoft Ltd. All Rights Reserved.
 */
import com.didisoft.pgp.PGPLib;

/**
 * This example demonstrates OpenPGP signing with no encryption.
 *
 * We use our private key for creating the digital signature and our partners
 * will use our public key to verify it.
 */
public class SignFile {

	private static final String TOMMY_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_private.asc";
	private static final String TOMMY_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_public.asc";
	private static final String TSTAR_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_private.asc";
	private static final String TSTAR_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_public.asc";



	public static void main(String[] args) throws Exception{
		// initialize the library
		PGPLib pgp = new PGPLib();

		// specify should the output be ASCII or binary
        boolean asciiArmor = true;
		pgp.signFile("e:/123.txt",
					TOMMY_PRIVATE_KEY_PATH,
					"tommy",
					"e:/123.sign.txt",
					asciiArmor);
	}
}
