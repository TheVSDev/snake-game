import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("Snake Game"); // Naming the window
        add(new Board());
        pack();

        setLocationRelativeTo(null); // Centering the window on the screen
        setResizable(false);
    }

    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }
}