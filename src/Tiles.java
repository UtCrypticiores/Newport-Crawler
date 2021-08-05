package src;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Tiles {
    public static void name() throws IOException {
        File file = new File("your_file.jpg");
        BufferedImage image = ImageIO.read(file);
        for (int i = 1; i <= 16 * 16; i++) {

        }
    }

    private static int[] getTilePos(int tile) {
        int location[] = new int[2];
        for (int row = 1; row <= 16; row++) {
            if (tile <= row * 16) {
                System.out.println(row);
                location[1] = row * 16 - 16;
                location[0] = ((int) Math.IEEEremainder(tile, 16) * 16 - 16);
                return location;
            }
        }
        return location;
    }
}
