package src;

import src.render.render;

public class update {
    private static boolean needed = false;

    public static void check() {
        if (needed) {
            render.makeJFrame("Updater - Newport Crawler", 600, 400, false);
        } else {
            launcher.launch();
        }
    }
}