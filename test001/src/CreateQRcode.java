import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.decoder.ec.ErrorCorrection;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;


import java.io.File;
import java.nio.file.Path;
import java.util.HashMap;


/**
 * Created by qfsf on 2017/9/23.
 */
public class CreateQRcode{
    public static void main(String[] args) {
        int width =300;
        int height = 300;
        String format = "png";
        String content = "臭臭阿宝宝囡囡啊。";

        HashMap hints = new HashMap();
        hints.put(EncodeHintType.CHARACTER_SET,"utf-8");
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hints.put(EncodeHintType.MARGIN,2);

        try {
            BitMatrix bitMatrix = new MultiFormatWriter().encode(content, BarcodeFormat.QR_CODE, width, height, hints);

            Path path =new File("E:/tes.png").toPath();

            MatrixToImageWriter.writeToPath(bitMatrix,format,path);

                   } catch (Exception e) {
            e.printStackTrace();
        }


    }
}