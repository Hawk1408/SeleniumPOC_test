import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.Key;
import org.apache.commons.codec.binary.Base64;

public class Crypto {
    private static String ALGORITHM = "AES";
    private static byte [] keyValue = "kadklhihwdnc5645".getBytes();

    public static Key generateKey(){
        return new SecretKeySpec(keyValue, ALGORITHM);
    }

    public static String encryptString(String encryptinValue) throws java.security.NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte [] encValue = cipher.doFinal(encryptinValue.getBytes());
        byte [] encByteValue = new Base64().encode(encValue);
        return new String(encByteValue);
    }

    public static String decryptString(String decryptinValue) throws java.security.NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte [] decValue = new Base64().decode(decryptinValue.getBytes());
        byte [] decByteValue = cipher.doFinal(decValue);
        return new String(decByteValue);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Encoded string: " + encryptString("12488cchd"));
        System.out.println("Decoded string: " + decryptString(encryptString("password")));
    }
}
