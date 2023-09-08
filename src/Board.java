import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    // Initialize Image variables
    private Image apple;
    private Image dot;
    private Image head;

    private int dots;

    Board() {
        setBackground(Color.BLACK);
        setFocusable(true);

        loadImages();
        initGame();
    }

    public void loadImages() {
        // Load the image for the apple
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("src/icons/apple.png"));
        apple = i1.getImage();

        // Load the image for a snake body segment - dot
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("src/icons/dot.png"));
        dot = i2.getImage();

        // Load the image for the snake's head
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("src/icons/head.png"));
        head = i3.getImage();
    }

    public void initGame() {
        dots = 3;

        for (int i = 0; i < dots; i++) {

        }
    }
}
