package com.foya.encrypt;
/*
 * Copyright 2008 DidiSoft Ltd. All Rights Reserved.
 */
import com.didisoft.pgp.PGPLib;

/**
 * This example demonstrates how to encrypt a file with the library API.
 */
public class EncryptFile {


	private static final String TOMMY_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_private.asc";
	private static final String TOMMY_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_public.asc";
	private static final String TSTAR_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_private.asc";
	private static final String TSTAR_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_public.asc";



	public static void main(String[] args) throws Exception{
		// create an instance of the library
		PGPLib pgp = new PGPLib();

		// if true the output file will be in ASCII armored format,
		// otherwise will be in binary format
        boolean asciiArmor = true;
        // if true additional integrity check information is added
        // set to false for compatibility with older versions of PGP such as 6.5.8.
        boolean withIntegrityCheck = true;

        pgp.encryptFile("e:/123.txt",
        				TOMMY_PUBLIC_KEY_PATH,
        				"e:/123.en.txt",
        				asciiArmor,
        				withIntegrityCheck);
	}
}
