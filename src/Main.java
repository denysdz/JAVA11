import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MyFrame extends Frame {
    public MyFrame() {
        new Frame();
        setBounds(0, 0, 300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        addMouseMotionListener(new MouseAdapter() {
            public void mouseMoved(MouseEvent e) {
                int menuBarHeight = getInsets().top;
                if (e.getY() <= menuBarHeight) {
                    JOptionPane.showMessageDialog(null, "Вихід курсора за верхню межу вікна");
                }
            }
        });

    }
}

public class Main {
    public static void main(String[] args) {
        new MyFrame();
    }
}