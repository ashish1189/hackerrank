package encryption;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Encoding {

	private static boolean isAlphaNumeric(String str) {
		return str.matches("^[a-zA-Z0-9]*$");
	}

	private static void md5Hash(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] hashInBytes = md.digest(str.getBytes(StandardCharsets.UTF_8));

			StringBuilder sb = new StringBuilder();
			for (byte b : hashInBytes) {
				sb.append(String.format("%02x", b));
			}
			System.out.println(sb.toString());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String password = scan.nextLine();

		if ((password.length() >= 6 && password.length() <= 20) && isAlphaNumeric(password))
			md5Hash(password);
		
		scan.close();
	}
}
