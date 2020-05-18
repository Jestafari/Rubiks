
package screens;

import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author JesTa
 */
public class Bloque {

       
    private int nonce;
    private String data;
    private String pHash;
    private String hash;
    private final SecureRandom randomGenerator = new SecureRandom();
       
    
    public Bloque() {
       this.nonce = Nonce();
       this.data = "<--- INTRODUCE DATA TO HASH --->";
       this.pHash = "0000000000000000000000000000000000000000000000000000000000000000";
       this.hash = "";                   
    }   
       
    public int Nonce() {
        int nonce = 0;
        nonce = randomGenerator.nextInt(100000);
        return nonce;
    }
  
    public String Hash(String data){
        String hash = null;
        try {            
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] info = digest.digest(data.getBytes("UTF-8"));
            return bytesToHex(info);           
        } catch (Exception ex) {
           ex.printStackTrace();
        } return hash;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getpHash() {
        return pHash;
    }

    public void setpHash(String pHash) {
        this.pHash = pHash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    private String bytesToHex(byte[] info) {
       //To change body of generated methods, choose Tools | Templates.
       return DatatypeConverter.printHexBinary(info);
    }
    
    public String toString (int nonce) {
        return "" + nonce;
    }
}