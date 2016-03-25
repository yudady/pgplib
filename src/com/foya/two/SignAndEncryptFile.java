package com.foya.two;
/*
 * Copyright 2008 DidiSoft Ltd. All Rights Reserved.
 */
import com.didisoft.pgp.PGPLib;

/**
 * Demonstrates OpenPGP signing and encryption in one pass.
 */
public class SignAndEncryptFile {

	private static final String TOMMY_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_private.asc";
	private static final String TOMMY_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_public.asc";
	private static final String TSTAR_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_private.asc";
	private static final String TSTAR_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_public.asc";



	public static void main(String[] args) throws Exception{
		// create an instance of the library
		PGPLib pgp = new PGPLib();

		// should output be ASCII or binary
        boolean asciiArmor = true;
        // should integrity check information be added
        // set to false for compatibility with older versions of PGP such as 6.5.8.
        boolean withIntegrityCheck = true;

        // sign and encrypt
		pgp.signAndEncryptFile("e:/123.txt",
								TOMMY_PRIVATE_KEY_PATH,
								"tommy",
								TSTAR_PUBLIC_KEY_PATH,
								"e:/123.sign.en.txt",
								asciiArmor,
								withIntegrityCheck);
	}
}
