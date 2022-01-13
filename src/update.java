package src;

import src.render.Render;
import src.Launcher;

public class Update {
    public static void check() {
        boolean needed = false;
        if (needed) {
            Render.makeJFrame("Updater - Newport Crawler", 600, 400, false);
        } else {
            Launcher.launch();
        }
    }
}