package b;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class teclas implements KeyListener {
    ScrollingBanner scrollingBanner;

    public teclas(ScrollingBanner scrollingBanner) {
        this.scrollingBanner = scrollingBanner;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();

        switch (code) {
            case KeyEvent.VK_ADD:
                scrollingBanner.aumentarVelocidad();
                System.out.println("Presionaste la tecla +");
                break;
            case KeyEvent.VK_MINUS:
                scrollingBanner.disminuirVelocidad();
                System.out.println("Presionaste la tecla -");
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
