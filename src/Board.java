import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    // Initialize Image variables
    private Image apple;
    private Image dot;
    private Image head;

    private final int ALL_DOTS = 900;
    private final int DOT_SIZE = 10;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private int dots;

    Board() {
        setBackground(Color.BLACK);
        setFocusable(true);

        loadImages();
        initGame();
    }

    public void loadImages() {
        // Load the image for the apple
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("./icons/apple.png"));
        apple = i1.getImage();

        // Load the image for a snake body segment - dot
        ImageIcon i2 = new ImageIcon(ClassLoader.getSystemResource("./icons/dot.png"));
        dot = i2.getImage();

        // Load the image for the snake's head
        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("./icons/head.png"));
        head = i3.getImage();
    }

    public void initGame() {
        dots = 3;

        for (int i = 0; i < dots; i++) {
            y[i] = 50;
            x[i] = 50 - i * DOT_SIZE;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        draw(g);
    }

    public void draw(Graphics g) {
        for (int i = 0; i < dots; i++) {
            if (i == 0) {
                g.drawImage(head, x[i], y[i], this);
            } else {
                g.drawImage(dot, x[i], y[i], this);
            }
        }

        Toolkit.getDefaultToolkit().sync();
    }
}
