import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class KeyAdapter implements KeyListener {
    protected KeyAdapter() {}

    public void keyTyped(KeyEvent e) {}

    public void keyPressed(KeyEvent e) {}
}
