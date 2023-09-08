import javax.swing.*;

public class SnakeGame extends JFrame {

    SnakeGame() {
        super("Snake Game"); // Naming the window
        setSize(300, 300); // Setting the size of the window
        setLocationRelativeTo(null); // Centering the window on the screen
        setVisible(true); // Making the window visible and displaying it on the screen
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}