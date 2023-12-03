import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class RC4Example {

    public static void main(String[] args) throws Exception {
        String plaintext = "Hello world";
        String key = "YourSecretKey";

        // Create RC4 cipher
        Cipher rc4 = Cipher.getInstance("RC4");
        SecretKeySpec rc4Key = new SecretKeySpec(key.getBytes(), "RC4");
        rc4.init(Cipher.ENCRYPT_MODE, rc4Key);

        // Encrypt the text
        byte[] encryptedBytes = rc4.doFinal(plaintext.getBytes());
        String encryptedText = new String(encryptedBytes);

        System.out.println("Original Text: " + plaintext);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}

