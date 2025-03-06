package jirautils;

import java.util.Base64;
import java.util.Base64.Encoder;

public class CredentialsEncoder {
	public String getEncodedCredentials(String userName, String tokenID) {

		
		String encodedString = Base64.getEncoder().encodeToString((userName + ":" + tokenID).getBytes());
		System.out.println(encodedString);
		return encodedString;
	}

}
