package com.onlineinteract.arrays;

/**
 * Created by Digilogue on 10/11/2016.
 * <p>
 * The Caeser Cipher solution first constructs the CaeserCipherEncryption creating two arrays for both encryption and
 * decryption. The range of characters we are interested in are: [A-Z] (all uppercase).
 * <p>
 * Calling the constructor with the rotation argument offsets the circular position of the letters by its value.
 * A rotation offset of 3 for example will create a sequence of [DEF..C]
 * <p>
 * Both the encrypt / decrypt methods take in their message / secret (respectively) and call transform passing in the
 * appropriate encoder / decoder array (respectively). This is because the transform processing code is the exact same
 * no mater what - the arrays themselves (which have already been worked out in our constructor) determine the crypt
 * values to be transformed.
 * <p>
 * important note about % operator: If you divide a lower number by a higher number, it will never be => 1
 * therefore we are always left with the remainder if using modulo %. e.g: 3 % 26 = 3. 25 % 26 = 25.
 * When working out the encoder, the modulo is important to work out the rotation / new positions based on the
 * rotation sizes passed in as it will also yield numerators >= 26 therefore the result of the modulo will effectively
 * reset back to 0,1,2.. etc.. giving us this circular rotational reference we desire.
 */
public class CaeserCipherEncryption {

    protected char[] encoder = new char[26];            // Encryption array
    protected char[] decoder = new char[26];            // Decryption array

    /**
     * Constructor that initializes the encryption and decryption arrays
     */
    public CaeserCipherEncryption(int rotation) {
        for (int k = 0; k < 26; k++) {
            encoder[k] = (char) ('A' + (k + rotation) % 26);
            decoder[k] = (char) ('A' + (k - rotation + 26) % 26);
        }
    }

    /**
     * Returns String representing encrypted message.
     */
    public String encrypt(String message) {
        return transform(message, encoder);               // use encoder array
    }

    /**
     * Returns decrypted message given encrypted secret.
     */
    public String decrypt(String secret) {
        return transform(secret, decoder);                // use decoder array
    }

    /**
     * Returns transformation of original String using given code.
     */
    private String transform(String original, char[] code) {
        char[] msg = original.toCharArray();
        for (int k = 0; k < msg.length; k++)
            if (Character.isUpperCase(msg[k])) {            // we have a letter to change
                int j = msg[k] - 'A';                         // will be value from 0 to 25
                msg[k] = code[j];                             // replace the character
            }
        return new String(msg);
    }

    public static void main(String[] args) {

        int cA = 'A';
        int cB = 'B';
        int cC = 'C';

        System.out.println(cA);
        System.out.println(cB);
        System.out.println(cC);

        char temp = (char) ('A' + (0) % 26);
        System.out.println(temp);

        // ^ dummy test to view integer values of chars.

        System.out.println();
        System.out.println("----");
        System.out.println();

        CaeserCipherEncryption cipher = new CaeserCipherEncryption(3);
        System.out.println("Encryption code = " + new String(cipher.encoder));
        System.out.println("Decryption code = " + new String(cipher.decoder));
        String message = "RED FIVE STANDING BY.";
        String coded = cipher.encrypt(message);
        System.out.println("Secret:  " + coded);
        String answer = cipher.decrypt(coded);
        System.out.println("Message: " + answer);         // should be plaintext again

    }
}
