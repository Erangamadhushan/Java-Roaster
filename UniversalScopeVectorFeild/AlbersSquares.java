import java.awt.Color;

public class AlbersSquares {
    public static void main(String[] args) {
        // Set canvas size
        StdDraw.setCanvasSize(800, 800);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

        // First color
        int r1 = Integer.parseInt(args[0]);
        int g1 = Integer.parseInt(args[1]);
        int b1 = Integer.parseInt(args[2]);

        Color c1 = new Color(r1, g1, b1);

        // Second color
        int r2 = Integer.parseInt(args[3]);
        int g2 = Integer.parseInt(args[4]);
        int b2 = Integer.parseInt(args[5]);

        Color c2 = new Color(r2, g2, b2);

        // First Albers square
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.25, 0.5, 0.2);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.25, 0.5, 0.1);

        // Second Albers square
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.75, 0.5, 0.2);
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.75, 0.5, 0.1);
    }
}
