package src.render;

import java.lang.reflect.Array;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFrame;

public class render {
    public Array sprites;

    public static void makeJFrame(String title, int width, int height, boolean maximized) {
        JFrame frame = new JFrame();
        if (maximized) {
            frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        }
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Newport Crawler");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // try {
        //     loadImage("src/res/sprites/pixel-frame-0.png");
        // } catch (IOException e) {
            
        // }
    }

    public static void loadImage(String path) throws FileNotFoundException, IOException {
        byte[] buffer = new byte[1024];
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        FileInputStream fis = new FileInputStream(new File(path));
        int read;
        while((read = fis.read(buffer))!=-1){
            os.write(buffer, 0, read);
        }
        fis.close();
        os.close();
        System.out.println(os.toByteArray());
    }

    private static int[] findPixels(int gridSize, int tile) {
        // idk i think this work
        int tileSize = 16;
        int col = 0;
        int row = 0;
        int[] output = new int[2];
        for (int i = 0; i <= tile; i++) {
            if (i > col * gridSize) {
                col = +1;
            }
            if ((col + 1) * gridSize > tile - (col * gridSize) && tile - (col * gridSize) < gridSize) {
                row = tile - (col * gridSize);

            }
        }
        output[1] = col * tileSize;
        output[2] = row * tileSize;
        return output;
    }
}
