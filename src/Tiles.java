package src;

public class Tiles {
    private static int[] getTile(int tile) {
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
