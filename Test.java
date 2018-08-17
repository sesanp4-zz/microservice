/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

 import org.apache.commons.codec.digest.DigestUtils;
/**
 *
 * @author centricgateway
 */
public class Test {
    
    public static void main(String[] args) {
        
          String loginid="23985714";
        String requestid="123123";
        String pubkey ="69319759";
        
        String checksum="23985714|0217|1|2|08080203378|5000|23985714|sesanp4@gmail.com|69319759";
        //String checksum="23985714||69319759";
        String checksumm="23985714|2018-08-16|69319759";

//        MessageDigest digest = MessageDigest.getInstance("SHA-1");
//       byte[] hash = digest.digest(checksum.getBytes(StandardCharsets.UTF_8));
//        String encoded = Base64.getEncoder().encodeToString(hash);
//        System.out.println(encoded);
//        System.out.println(new String(hash));
//        System.out.println("------------------");
          
     

         String sha256hex = DigestUtils.sha1Hex(checksum.getBytes());
         String realchecksum=DigestUtils.md5Hex(sha256hex);
         System.out.println(realchecksum);
        
        
    }
    
}
