import java.util.Base64;

public class SecretKeyGenerator {
    public static void main(String[] args) {
        byte[] secret = new byte[32]; // 256-bit key
        new java.security.SecureRandom().nextBytes(secret);
        String base64Secret = Base64.getUrlEncoder().withoutPadding().encodeToString(secret);
        System.out.println("Secret Key: " + base64Secret);
    }
}
