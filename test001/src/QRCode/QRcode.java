package QRCode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/9/25.
 */
public class QRcode {
    public static void main(String[] args) {
        int width=200;
        int height =200;
        String format ="png";
        String content = "adsdasd";

        HashMap hints= new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hints.put(EncodeHintType.MARGIN,1);

        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height);
            Path file = new File("E:/hello.png").toPath();

            MatrixToImageWriter.writeToPath(bitMatrix,format,file);

            System.out.println("done.");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
