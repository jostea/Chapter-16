package HomeWork16_21;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageMerger{

    private static void fuseImages(BufferedImage img1, BufferedImage img2) throws IOException {

        int width1 = img1.getWidth();
        int height1 = img1.getHeight();
        int width2 = img2.getWidth();
        int height2 = img2.getHeight();
        if (width1 < width2 && height1 < height2)
            img2 = img2.getSubimage(0, 0, img1.getWidth(), img1.getHeight());

        if (width1 > width2 && height1 > height2)
            img1 = img1.getSubimage(0, 0, img2.getWidth(), img2.getHeight());

        if (width1 < width2 && height1 > height2) {
            img1 = img1.getSubimage(0, 0, img1.getWidth(), img2.getHeight());
            img2 = img2.getSubimage(0, 0, img1.getWidth(), img2.getHeight());
        }

        if (width1 > width2 && height1 < height2) {
            img1 = img1.getSubimage(0, 0, img2.getWidth(), img1.getHeight());
            img2 = img2.getSubimage(0, 0, img2.getWidth(), img1.getHeight());
        }
        BufferedImage result = new BufferedImage(img1.getWidth(), img1.getHeight(), BufferedImage.TYPE_INT_RGB);

        for (int i = 0; i < img1.getWidth(); i++) {
            for (int j = 0; j < img1.getHeight(); j++) {
                if (j % 2 == 0) result.setRGB(i, j, img1.getRGB(i, j));
                else if (i % 2 == 0) result.setRGB(i, j, img2.getRGB(i, j));
            }
        }
        File file = new File("C:\\Users\\drihlitchii\\Desktop\\test\\3.jpg");
        ImageIO.write(result, "jpg", file);
    }


    public static void main(String[] args) throws IOException {
        BufferedImage img1 = ImageIO.read(new File("C:\\Users\\drihlitchii\\Desktop\\test\\1.jpg"));
        BufferedImage img2 = ImageIO.read(new File("C:\\Users\\drihlitchii\\Desktop\\test\\2.jpg"));


        fuseImages(img1, img2);


    }

}