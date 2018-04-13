package co.gui_swing.ui.model.Data;

import com.google.gson.Gson;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataWorker {
    private String nameWorker;
    private String kingOfServiceWorker;
    private String priceWorker;
    private int idButtonWorker;
    private Image imgWorker;
    private static Path path;
    //private String imgWorker;
    private static int counterImg = 0;

    public String getNameWorker() {
        return nameWorker;
    }

    public String getKingOfServiceWorker() {
        return kingOfServiceWorker;
    }

    public String getPriceWorker() {
        return priceWorker;
    }

    public int getIdButtonWorker() {
        return idButtonWorker;
    }

    public Image getImgWorker() {
        return imgWorker;
    }

    public DataWorker() {
        this("", "", "", -1, "");
    }

    public DataWorker(String nameWorker, String kingOfServiceWorker, String priceWorker, int idButtonWorker, String imgWorker) {
        this.nameWorker = nameWorker;
        this.kingOfServiceWorker = kingOfServiceWorker;
        this.priceWorker = priceWorker;
        this.idButtonWorker = idButtonWorker;
        this.imgWorker = getImage(imgWorker);
    }

    /*temporary function, delete her*/
    public static Image getImage(String name) {
        if(path == null) {
            String dir = ".tmp";
            path = Paths.get(dir);
            if (!Files.exists(path)) {
                try {
                    Files.createDirectories(path);
                } catch (IOException e) {
                    //fail to create directory
                    e.printStackTrace();
                }
            }
        }
        String filename = ".tmp/tmpImg" + counterImg + ".jpg";
        counterImg++;
        try {
            byte[] bytearray = new Gson().fromJson(name, byte[].class);

            BufferedImage imag = ImageIO.read(new ByteArrayInputStream(bytearray));
            ImageIO.write(imag, "jpg", new File(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image img = Toolkit.getDefaultToolkit().getImage(filename);
        return img;
    }
}
