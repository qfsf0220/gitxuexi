package test180227;

import com.sun.xml.internal.messaging.saaj.util.*;
import jodd.util.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/**
 * Created by Administrator on 2018/3/13.
 */
public class OtherGetSignature {
    public static void main(String[] args) {
        OtherGetSignature ogs = new OtherGetSignature();
        ogs.testabc();
    }

    public  void testabc(){
        try {
            Map<String, String> param = new HashMap<>();
            param.put("Action" , "DescribeDomains");
            param.put("Format" , "json");
            param.put("Version" , "2015-01-09");
            param.put("SignatureMethod" , "HMAC-SHA1");
            param.put("SignatureNonce" , "15215528852366");
            param.put("SignatureVersion" , "1.0");
            param.put("AccessKeyId" , "");
            param.put("Timestamp" , "2018-03-13T06:35:00Z");


            StringBuffer cqs = new StringBuffer();
            String[] keyArray = (String[]) param.keySet().toArray(new String[]{});
            Arrays.sort(keyArray);

            for(int i =0 ;i <keyArray.length;i++){
                cqs.append(percentEncode(keyArray[i])).append("=").append(percentEncode(param.get(keyArray[i])));
                if (i < keyArray.length - 1) {
                    cqs.append("&");
                }
            }
            StringBuffer StringTosign = new StringBuffer();
            StringTosign.append("GET").append("&").append(percentEncode("/")).append(percentEncode(cqs.toString()));
            System.out.println(StringTosign.toString());
            /////jisuan 签名 HMAC值
            String signKey = "testsecret&";
            String dig = "HmacSHA1";
            Mac mac = Mac.getInstance(dig);
            mac.init(new SecretKeySpec(signKey.getBytes("utf-8"),dig));
            byte[] doFinal = mac.doFinal(StringTosign.toString().getBytes("utf-8"));

            System.out.println(Base64.encodeToString(doFinal));

        }catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
    }

    private static final String ENCODING = "UTF-8";

    private static String percentEncode(String value) throws UnsupportedEncodingException {
        return value != null ? URLEncoder.encode(value, ENCODING).replace("+", "%20").replace("*", "%2A").replace("%7E", "~") : null;
    }

}
