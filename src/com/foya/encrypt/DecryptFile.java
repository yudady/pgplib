package com.foya.encrypt;
/*
 * Copyright 2008 DidiSoft Ltd. All Rights Reserved.
 */
import com.didisoft.pgp.PGPLib;

public class DecryptFile {


	private static final String TOMMY_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_private.asc";
	private static final String TOMMY_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tommy_public.asc";
	private static final String TSTAR_PRIVATE_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_private.asc";
	private static final String TSTAR_PUBLIC_KEY_PATH = "F:/foya/00.work/gpg/src/main/resources/tstar_public.asc";


	public static void main(String[] args) throws Exception{
		// initialize the library instance
		PGPLib pgp = new PGPLib();

		String privateKeyPass = "tommy";

		// The decrypt method returns the original name of the file
		// that was encrypted. We can use it afterwards,
		// to rename OUTPUT.txt to it for example.
		String originalFileName = pgp.decryptFile("e:/123.en.txt",
				TOMMY_PRIVATE_KEY_PATH,
												privateKeyPass,
												"e:/123.de.txt");
	}
}
